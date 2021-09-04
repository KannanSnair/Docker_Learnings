package com.kan.rest.webservices.restfulwebservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kan.rest.webservices.restfulwebservices.service.AnimalAbstract;
import com.kan.rest.webservices.restfulwebservices.service.Car;
import com.kan.rest.webservices.restfulwebservices.service.Cat;
import com.kan.rest.webservices.restfulwebservices.service.Employee;
import com.kan.rest.webservices.restfulwebservices.service.Engine;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class HelloWorldController {

	@Autowired
	Car carBean;

	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping(path = "/hello-world-bean1")
	public HelloWorldBean helloWorldBean() {
		// throw new RuntimeException("Some Error has Happened! Contact Support at
		// ***-***");
		return new HelloWorldBean("Hello World1");
	}

	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}

	@GetMapping(path = "/hello-world/int-test")
	public String interfaceTesting() {
		AnimalAbstract test = new Cat();
		return test.animalMovement() + test.sound();
	}

	// to learn autowiring in Spring
	@GetMapping(path = "/getcardetails")
	public String getCarDetails() {
		return carBean.toString();
		// return "hai";
	}

	@GetMapping(path = "/getcardetails-1")
	public String getDetails() {
		return carBean.engine.toString();
	}

	@GetMapping(path = "/circuitbreaker")
	@HystrixCommand(fallbackMethod = "getDataFallBack")
	public Employee getCircuitbreaker() throws ClassNotFoundException {
		
		Class x = Class.forName("Employee.class");
		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);

		if (emp.getName().equalsIgnoreCase("emp1"))
			throw new RuntimeException();

		return emp;
	}

	public Employee getDataFallBack() {

		Employee emp = new Employee();
		emp.setName("fallback-emp1");
		emp.setDesignation("fallback-manager");
		emp.setEmpId("fallback-1");
		emp.setSalary(3000);

		return emp;

	}
}

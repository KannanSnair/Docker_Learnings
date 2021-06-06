package com.kan.rest.webservices.restfulwebservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kan.rest.webservices.restfulwebservices.service.AnimalAbstract;
import com.kan.rest.webservices.restfulwebservices.service.Car;
import com.kan.rest.webservices.restfulwebservices.service.Cat;
import com.kan.rest.webservices.restfulwebservices.service.Engine;

@RestController
public class HelloWorldController {

	@Autowired
	Car carBean;
	
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		// throw new RuntimeException("Some Error has Happened! Contact Support at
		// ***-***");
		return new HelloWorldBean("Hello World");
	}

	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}
	  
	@GetMapping(path="/hello-world/int-test")
	public String interfaceTesting() {
		AnimalAbstract test = new Cat();
		return  test.animalMovement()+ test.sound();
	}
	
	//to learn autowiring in Spring
	@GetMapping(path="/getcardetails")
	public String getCarDetails() {
		return carBean.toString();
		//return "hai";
	}
	
	@GetMapping(path="/getcardetails-1")
	public String getDetails() {
		return carBean.engine.toString();
	}
}

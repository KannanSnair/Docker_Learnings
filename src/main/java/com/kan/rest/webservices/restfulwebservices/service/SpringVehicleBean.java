package com.kan.rest.webservices.restfulwebservices.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringVehicleBean {

	@Bean
	public Car getCarBean() {
		return new Car("2018","yes","Alpha");
	}
	
	@Bean
	public Engine getEngine() {
		return new Engine("BCX-123", "ELECTRIC", "2021");
	}
}

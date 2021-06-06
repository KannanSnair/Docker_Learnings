package com.kan.rest.webservices.restfulwebservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service	
public class ServiceClass1 {

	@Autowired
	SpringVehicleBean carBean;

	public String getCarDetails() {
		return carBean.getCarBean().toString();
	}
}

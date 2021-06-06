package com.kan.rest.webservices.restfulwebservices.service;

public class Car {

	private String model;
	private String fourWheelDrive;
	private String varient;

	public Car(String model, String fourWheelDrive, String varient) {
		this.model = model;
		this.fourWheelDrive = fourWheelDrive;
		this.varient = varient;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getFourWheelDrive() {
		return fourWheelDrive;
	}
	public void setFourWheelDrive(String fourWheelDrive) {
		this.fourWheelDrive = fourWheelDrive;
	}
	public String getVarient() {
		return varient;
	}
	public void setVarient(String varient) {
		this.varient = varient;
	}
	
	@Override
	public String toString() {
		return "model:"+ model + " fourWheelDrive:" + fourWheelDrive + " varient:"+ varient;
	}
	
}

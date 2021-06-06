package com.kan.rest.webservices.restfulwebservices.service;

public class Engine {

	private String engineSerialNo;
	private String engineFuelType;
	private String engineModel;

	public Engine(String engineSerialNo, String engineFuelType, String engineModel) {
		this.engineSerialNo = engineSerialNo;
		this.engineFuelType = engineFuelType;
		this.engineModel = engineModel;
	}
	public String getEngineSerialNo() {
		return engineSerialNo;
	}
	public void setEngineSerialNo(String engineSerialNo) {
		this.engineSerialNo = engineSerialNo;
	}
	public String getEngineFuelType() {
		return engineFuelType;
	}
	public void setEngineFuelType(String engineFuelType) {
		this.engineFuelType = engineFuelType;
	}
	public String getEngineModel() {
		return engineModel;
	}
	public void setEngineModel(String engineModel) {
		this.engineModel = engineModel;
	}
	
	public String toString() {
		return "engineSerialNo: "+ engineSerialNo +" engineFuelType: "+ engineFuelType +" engineModel"+ engineModel;
	}
}

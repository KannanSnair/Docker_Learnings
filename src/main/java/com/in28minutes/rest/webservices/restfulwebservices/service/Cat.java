package com.in28minutes.rest.webservices.restfulwebservices.service;

public class Cat extends AnimalAbstract {

	@Override
	public String animalMovement() {
		
		animalMovement = "movement by four legs - tiny steps - cat";
		return animalMovement;
	}

	@Override
	public String sound() {
		animalSound = "Meow sound - cat";
		return animalSound;
	}

}

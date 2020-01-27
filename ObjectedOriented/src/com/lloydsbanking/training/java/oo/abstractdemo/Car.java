package com.lloydsbanking.training.java.oo.abstractdemo;

public abstract class Car {

	public void start() {
		System.out.println("Car is started");
	}
	public void drive() {
		System.out.println("Car is driven");
	}
	
	public void openDoor() {
		System.out.println("Car door is opened");
	}
	
	public void closeDoor() {
		System.out.println("Car door is closed");
	}
	
	public void stop() {
		System.out.println("Car is stopped");
	}
}

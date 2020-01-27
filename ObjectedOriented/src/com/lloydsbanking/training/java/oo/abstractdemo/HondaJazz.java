package com.lloydsbanking.training.java.oo.abstractdemo;
/**
 * 
 * @author shant
 *
 */
public class HondaJazz extends Car {

	public String color;
	private int length = 10;
	private int width = 5;
	
	public HondaJazz() {
		// TODO Auto-generated constructor stub
	}

	public HondaJazz(String color) {
		this.color = color;
	}



	public void start() {
		System.out.println("Honda Jazz Car is started");
		airConOn();
	}
	public void drive() {
		System.out.println("Honda Jazz Car is driven");
	}
	
//	public void openDoor() {
//		System.out.println("Honda Jazz Car door is opened");
//	}
	
//	public void closeDoor() {
//		System.out.println("Honda Jazz Car door is closed");
//	}
//	
	public void stop() {
		airConOff();
		System.out.println("Honda Jazz Car is stopped");
	}

	private void airConOn() {
		System.out.println("Honda Jazz Car AirCon on");
	}

	private void airConOff() {
		System.out.println("Honda Jazz Car AirCon Off");
	}
}

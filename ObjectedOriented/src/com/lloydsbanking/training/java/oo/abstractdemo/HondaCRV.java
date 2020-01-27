package com.lloydsbanking.training.java.oo.abstractdemo;
/**
 * 
 * @author shant
 *
 */
public class HondaCRV extends Honda {

	public String color = "BLACK";
	private int length = 12;
	private int width = 5;
	
	public HondaCRV() {
		// TODO Auto-generated constructor stub
	}
	public HondaCRV(String color) {
		this.color = color;
	}
	public static void print() {
		System.out.println("I am a Honda CRV Model but not a car");
	}
	
	public void start() {
		System.out.println("Honda CRV Car is started");
	}
	public void drive() {
		System.out.println("Honda CRV Car is driven");
	}
	
//	public void openDoor() {
//		System.out.println("Honda CRV Car door is opened");
//	}
	
//	public void closeDoor() {
//		System.out.println("Honda CRV Car door is closed");
//	}
//	
	public void stop() {
		System.out.println("Honda CRV Car is stopped");
	}


}

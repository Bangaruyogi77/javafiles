package com.lloydsbanking.training.java.oo.interfacedemo;

public class Keyboard implements USBInterface{

	@Override
	public void plugin() {
			System.out.println("Keyboard has is plugged in.");
	}

	@Override
	public void plugout() {
		System.out.println("Keyboard has is plugged out.");
		
	}

	

}

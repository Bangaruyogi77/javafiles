package com.lloydsbanking.training.java.oo.interfacedemo;

public class Mouse implements USBInterface{

	@Override
	public void plugin() {
			System.out.println("Mouse has is plugged in.");
	}

	@Override
	public void plugout() {
		System.out.println("Mouse has is plugged out.");
		
	}

	

}

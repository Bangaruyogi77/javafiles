package com.lloydsbanking.training.java.oo.interfacedemo;

public class Printer implements USBInterface{

	@Override
	public void plugin() {
			System.out.println("Printer has is plugged in.");
	}

	@Override
	public void plugout() {
		System.out.println("Printer has is plugged out.");
		
	}

	

}

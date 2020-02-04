package com.lloydsbanking.training.java.staticnonstatic;

public class Attributes {

	// public name and can be accessed without a reference
	public static String name = "Java";
	// cannot be accessed without a reference
	private String address;
	/**
	 * constructor
	 */
	public Attributes(String address) {
		this.address = address;
	}
	// returns the local instance variable
	public String getAddress() {
		return address;
	}

	// sets the value of the the private variable
	public void setAddress(String address) {
		this.address = address;
	}

	// accessor methods for static member
	public static void setName(String name) {
		Attributes.name = name;
	}

	// accessor methods for static member
	public static String getName() {
		return name;
	}
	
}

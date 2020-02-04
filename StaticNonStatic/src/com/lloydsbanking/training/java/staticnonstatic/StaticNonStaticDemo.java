package com.lloydsbanking.training.java.staticnonstatic;
/**
 * 
 * @author shant
 *
 */
public class StaticNonStaticDemo {

	public static void main(String[] args) {
		Attributes attr = new Attributes("My address in London");
		// getting access to class static variables without an instance
		print("Without an instance", Attributes.getName());
		// getting access with an instance
		print("With an instance", attr.getAddress());
		// setting a new value to address local instance variable
		attr.setAddress("My address in Cardiff");
		// retrieve the new value
		print("With an instance", attr.getAddress());
		
	}

	/**
	 * Object Oriented design to avoid duplication
	 * @param message
	 * @param value
	 */
	private static void print(String message, String value) {
		System.out.println(message + " : " + value);
	}
}
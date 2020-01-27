/**
 * 
 */
package com.lloydsbanking.training.java.datatype;

/**
 * @author shant
 *
 */
public class IntegerDemo implements DataTypeInterface{

	/**
	 * 
	 */
	public IntegerDemo() {
		// TODO Auto-generated constructor stub
	}

	public void print() {
		int intVariable = 424242424;
		System.out.println("Sample int " + intVariable );
		System.out.println("int min value : " + Integer.MIN_VALUE);
		System.out.println("int max value : " + Integer.MAX_VALUE);
	}
}

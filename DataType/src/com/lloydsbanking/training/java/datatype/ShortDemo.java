/**
 * 
 */
package com.lloydsbanking.training.java.datatype;

/**
 * @author shant
 *
 */
public class ShortDemo implements DataTypeInterface{

	/**
	 * 
	 */
	public ShortDemo() {
		// TODO Auto-generated constructor stub
	}

	public void print() {
		short shortVariable = 127;
		System.out.println("Sample short " + shortVariable );
		System.out.println("Short min value : " + Short.MIN_VALUE);
		System.out.println("Short max value : " + Short.MAX_VALUE);
	}
}

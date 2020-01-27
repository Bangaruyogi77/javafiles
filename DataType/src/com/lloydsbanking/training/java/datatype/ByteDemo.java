/**
 * 
 */
package com.lloydsbanking.training.java.datatype;

/**
 * @author shant
 *
 */
public class ByteDemo implements DataTypeInterface {

	/**
	 * 
	 */
	public ByteDemo() {
		// TODO Auto-generated constructor stub
	}

	public void print() {
		byte byteVariable = 127;
		System.out.println("Sample byte " + byteVariable );
		System.out.println("Byte min value : " + Byte.MIN_VALUE);
		System.out.println("Byte max value : " + Byte.MAX_VALUE);
	}
}

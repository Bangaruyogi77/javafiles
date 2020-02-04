/**
 * 
 */
package com.lloydsbanking.training.java.innerclasses;

/**
 * @author shant
 *
 */
public class NonStaticInnerClassDemo {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// outer class and inner class
		OuterClass outClass = new OuterClass();
		outClass.printInnerClass();
		
		// method local inner class
		outClass.printMethodInnerClass();
	
	}

}

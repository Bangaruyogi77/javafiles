/**
 * 
 */
package com.lloydsbanking.training.java.innerclasses;

/**
 * @author shant
 *
 */
public class OuterClass {

	/**
	 * Inner class
	 */
	private class InnerClass {
		
		public void print() {
			System.out.println("Printing from InnerClass");
		}
	}

	/**
	 * call the inner class method print()
	 */
	public void printInnerClass() {
		InnerClass innClass = new InnerClass();
		innClass.print();
	}
	
	public void printMethodInnerClass() {
		class MethodDemo{
			public void print() {
				System.out.println("Printing from Method Inner Class");
			}
		}
		MethodDemo mDemo = new MethodDemo();
		mDemo.print();
	}
}

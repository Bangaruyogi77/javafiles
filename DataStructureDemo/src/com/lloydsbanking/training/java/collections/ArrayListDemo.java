/**
 * 
 */
package com.lloydsbanking.training.java.collections;

import java.util.ArrayList;

/**
 * @author shant
 *
 */
public class ArrayListDemo {

	/**
	 * 
	 */
	public ArrayListDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList  list = new ArrayList ();
		// put random values
		for (int i = 0; i < 100; i++) {
			int randomNumber = (int) (1000 * (Math.random()));
			list.add(randomNumber);
		}

		for (int i = 0; i < 100; i++) {
			System.out.println("Number " + i + " is" + list.get(i));
		}
	}

}

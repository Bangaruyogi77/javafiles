/**
 * 
 */
package com.lloydsbanking.training.java.gc;

import java.util.ArrayList;

/**
 * @author shant
 *
 */
public class GarbageCollectionDemo {

	//static ArrayList<Employee> list = new ArrayList<Employee>();
	/**
	 * 
	 */
	public GarbageCollectionDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		for(int i = 0; i < Integer.MAX_VALUE; i++) {
			Employee emp = new Employee("firstName_"+ i, "surName_" + i, (byte)(100 * Math.random()));
			list.add(emp);
			if ((i%100) == 0) {
				System.out.println(i + " iteration, Max Memory - " + Runtime.getRuntime().maxMemory());
				System.out.println(i + " iteration, Free Memory - " + Runtime.getRuntime().freeMemory());
			}

		}

	}

}

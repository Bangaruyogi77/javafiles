package com.lloydsbanking.training.java.ds;

import java.util.*;

public class VectorDemo {

	public static void main(String args[]) {
		// initial size is 3, increment is 2
		Vector v = new Vector(10, 5);
		System.out.println("Initial size: " + v.size());
		System.out.println("Initial capacity: " + v.capacity());

		for(int i = 0; i < 100; i++) {
			v.addElement(new Integer(i));
		}
		System.out.println("Capacity after " + v.size() + " additions: " + v.capacity());

		for(int i = 101; i < 200; i++) {
			v.addElement(new Double(i));
		}

		System.out.println("First element: " + (Integer) v.firstElement());
		System.out.println("Last element: " + (Double) v.lastElement());

		if (v.contains(new Integer(100)))
			System.out.println("Vector contains 100.");

		// enumerate the elements in the vector.
		Enumeration vEnum = v.elements();
		System.out.println("\nElements in vector:");

		while (vEnum.hasMoreElements()) {
			System.out.println(vEnum.nextElement() + " ");
		}

	}
}
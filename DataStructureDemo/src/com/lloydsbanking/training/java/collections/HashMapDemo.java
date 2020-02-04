package com.lloydsbanking.training.java.collections;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		Map map = new HashMap();

		for (int i= 1; i <= 100; i++) {
			int randomValue = (int) (1000 * Math.random());
			map.put(i, randomValue);
		}
		for (int i= 1; i <= 100; i++) {
			System.out.println("Value of " + i + " is " + map.get(i));
		}

	}

}

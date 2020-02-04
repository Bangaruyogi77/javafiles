package com.lloydsbanking.training.java.collections;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		HashSet set = new HashSet();

		for (int i= 1; i <= 100; i++) {
			int randomValue = (int) (1000 * Math.random());
			set.add(randomValue);
		}
		
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// sorted set
		TreeSet treeSet =  new TreeSet(set);
		System.out.println(treeSet);
		
	}

}

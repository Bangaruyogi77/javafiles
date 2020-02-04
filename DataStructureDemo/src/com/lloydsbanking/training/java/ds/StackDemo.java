package com.lloydsbanking.training.java.ds;

import java.util.*;

public class StackDemo {


	public static void main(String args[]) {
		Stack st = new Stack();
		System.out.println("stack: " + st);
		
		for (int i = 0; i <= 100; i=i+10) {
			printPush(st,i);
		}
		
		for (int i = 0; i <= 10; i++) {
			printPop(st);
		}
		
		try {
			printPop(st);
		} catch (EmptyStackException e) {
			System.out.println("Exception Caught!!! empty stack");
		}
	}
	
	static void printPush(Stack st, int a) {
		st.push(new Integer(a));
		System.out.println("push(" + a + ")");
		System.out.println("stack: " + st);
	}

	static void printPop(Stack st) {
		System.out.print("pop -> ");
		Integer a = (Integer) st.pop();
		System.out.println(a);
		System.out.println("stack: " + st);
	}

}
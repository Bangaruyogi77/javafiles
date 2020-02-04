package com.lloydsbanking.training.java.stringdemo;

public class StringDemo {

	public static void main(String args[]) {
		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
		// merge the characters
		String helloString = new String(helloArray);
		System.out.println(helloString);
		
		// split the word to "hell"
		System.out.println(helloString.substring(0, 4));

		// get the length
		System.out.println(helloString.length());
		
		String world = new String("World");
		
		// merge two strings
		System.out.println(helloString.concat(world));
		String message = helloString.concat(world);
		
		// change cases
		System.out.println(message.toUpperCase());
		
		// change to lower case
		System.out.println(message.toLowerCase());
		
		// replace a letter in the string
		System.out.println(message.replaceAll("l", "B"));
		
	}
}
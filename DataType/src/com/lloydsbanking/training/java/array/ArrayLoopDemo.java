package com.lloydsbanking.training.java.array;
class ArrayLoopDemo {
    public static void main(String[] args) {
    	
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];

        // assignment loop
        for (int i = 0; i < 10; i++) {
        	anArray[i] = (i+1) * 100;
        }

        // retrieving loop
        for (int i = 0; i < 10; i++) {
        	System.out.println("Element at index " + i + ": " +  anArray[i]);
        }

    }
} 
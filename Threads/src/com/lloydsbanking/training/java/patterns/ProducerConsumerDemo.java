package com.lloydsbanking.training.java.patterns;
// Java program to implement solution of producer 
// consumer problem. 

import java.util.LinkedList; 

public class ProducerConsumerDemo { 
	public static void main(String[] args) 
		throws InterruptedException 
	{ 
        LinkedList<Integer> list = new LinkedList<>(); 
        int capacity = 10; 
		// Object of a class that has both produce() 
		// and consume() methods 
		ProducerConsumer producerConsumer = new ProducerConsumer(list, capacity);
		
		// Create producer thread 
		Thread t1 = new Thread(new Runnable() { 
			@Override
			public void run() 
			{ 
				try { 
					producerConsumer.produce(); 
				} 
				catch (InterruptedException e) { 
					e.printStackTrace(); 
				} 
			} 
		}); 

		// Create consumer thread 
		Thread t2 = new Thread(new Runnable() { 
			@Override
			public void run() 
			{ 
				try { 
					producerConsumer.consume(); 
				} 
				catch (InterruptedException e) { 
					e.printStackTrace(); 
				} 
			} 
		}); 

		// Start both threads 
		t1.start(); 
		t2.start(); 

		// t1 finishes before t2 
		t1.join(); 
		t2.join(); 
	} 


} 

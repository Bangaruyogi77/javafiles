package com.lloydsbanking.training.java.patterns;

import java.util.LinkedList;

// This class has a list, producer (adds items to list 
// and consumer (removes items). 
public class ProducerConsumer {

	private LinkedList<Integer> list;
	private int capacity;

	public ProducerConsumer(LinkedList<Integer> list, int capacity) {
		this.list = list;
		this.capacity = capacity;
	}

	// Function called by producer thread
	public synchronized void produce() throws InterruptedException {
		int value = 0;
		while (true) {
			// producer thread waits while list
			// is full
			while (list.size() == capacity)
				wait();

			System.out.println("Producer produced-" + value + " and the list size is " + list.size());

			// to insert the jobs in the list
			list.add(value++);

			// notifies the consumer thread that
			// now it can start consuming
			notify();

			// makes the working of program easier
			// to understand
			Thread.sleep(1000);
		}
	}
	
	// Function called by consumer thread
	public synchronized void consume() throws InterruptedException {
		while (true) {
			// consumer thread waits while list
			// is empty
			while (list.size() == 0)
				wait();

			// to retrive the ifrst job in the list
			int value = list.removeFirst();

			System.out.println("Consumer consumed-" + value + " and the list size is " + list.size());

			// Wake up producer thread
			notify();

			// and sleep
			Thread.sleep(1000);
		}
	}
}
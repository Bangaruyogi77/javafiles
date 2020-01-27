package com.lloydsbanking.training.java.thread.joining;
class ThreadJoiningSequenceDemo 
{ 
	public static void main (String[] args) 
	{ 

		// creating two threads 
		ThreadJoining t1 = new ThreadJoining(); 
		ThreadJoining t2 = new ThreadJoining(); 
		ThreadJoining t3 = new ThreadJoining(); 

		// thread t1 starts 
		t1.start();
		t2.start();
		t3.start();

		System.out.println(Thread.currentThread().getName().toUpperCase() + " is running...");

		// wait for all the threads to end
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Main thread ending".toUpperCase());
	} 
} 

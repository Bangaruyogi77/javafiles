package com.lloydsbanking.training.java.thread.joining;
/**
 * 
 * @author shant
 * Java program to explain the concept of joining a thread. 
 */

class ThreadJoining extends Thread 
{ 
	@Override
	public void run() 
	{ 
		for (int i = 0; i < 2; i++) 
		{ 
			try
			{ 
				Thread.sleep(500); 
				System.out.println("Current Thread: "
						+ Thread.currentThread().getName()); 
			} 

			catch(Exception ex) 
			{ 
				System.out.println("Exception has" + 
								" been caught" + ex); 
			} 
			System.out.println(i + " from " + Thread.currentThread().getName());
		} 
	} 
} 


package com.lloydsbanking.training.java.thread.deadlock;
// This class is shared by both threads 
class ShreadResource 
{ 

	synchronized void testOne(ShreadResource s2) 
	{ 
		System.out.println("testOne-begin"); 
		SleepUtility.sleep(1000); 

		// taking a lock on the resource
		s2.testTwo(this); 
		System.out.println("testOne-end"); 
	} 


	synchronized void testTwo(ShreadResource s1) 
	{ 
		System.out.println("test2-begin"); 
		SleepUtility.sleep(1000); 

		// taking a lock on the resource
		s1.testOne(this); 
		System.out.println("test2-end"); 
	} 
} 

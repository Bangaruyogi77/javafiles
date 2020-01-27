package com.lloydsbanking.training.java.thread.deadlock;
class SleepUtility 
{ 
	// Util class to sleep a thread 
	static void sleep(long millis) 
	{ 
		try
		{ 
			Thread.sleep(millis); 
		} 
		catch (InterruptedException e) 
		{ 
			e.printStackTrace(); 
		} 
	} 
} 
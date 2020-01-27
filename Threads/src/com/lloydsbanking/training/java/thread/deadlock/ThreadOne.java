package com.lloydsbanking.training.java.thread.deadlock;
class ThreadOne extends Thread 
{ 
	private ShreadResource s1; 
	private ShreadResource s2; 

	// constructor to initialize fields 
	public ThreadOne(ShreadResource s1, ShreadResource s2) 
	{ 
		this.s1 = s1; 
		this.s2 = s2; 
	} 

	// run method to start a thread 
	@Override
	public void run() 
	{ 
		// taking object lock of s1 enters 
		// into test1 method 
		s1.testOne(s2); 
	} 
} 
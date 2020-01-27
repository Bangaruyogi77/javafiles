package com.lloydsbanking.training.java.thread.deadlock;

public class DeadlockDemo 
{ 
	public static void main(String[] args) 
	{ 

		ShreadResource s1 = new ShreadResource(); 

		ShreadResource s2 = new ShreadResource(); 

		ThreadOne t1 = new ThreadOne(s1, s2); 
		t1.start(); 

		ThreadTwo t2 = new ThreadTwo(s1, s2); 
		t2.start(); 

		SleepUtility.sleep(2000); 
	} 
} 

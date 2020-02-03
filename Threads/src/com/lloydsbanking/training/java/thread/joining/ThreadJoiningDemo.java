package com.lloydsbanking.training.java.thread.joining;
class ThreadJoiningDemo 
{ 
	public static void main (String[] args) 
	{ 

		// creating two threads 
		ThreadJoining t1 = new ThreadJoining(); 
		ThreadJoining t2 = new ThreadJoining(); 
		ThreadJoining t3 = new ThreadJoining(); 

		// thread t1 starts 
		t1.start(); 

		// starts second thread after when 
		// first thread t1 has died. 
		try
		{ 
			System.out.println("Current Thread: "
				+ Thread.currentThread().getName()); 
			t1.join(); 
		} 

		catch(Exception ex) 
		{ 
			System.out.println("Exception has " + 
								"been caught" + ex); 
		} 

		// t2 starts 
		t2.start(); 

		// starts t3 after when thread t2 has died. 
		try
		{ 
			System.out.println("Current Thread: "
				+ Thread.currentThread().getName()); 
			t2.join(); 
		} 

		catch(Exception ex) 
		{ 
			System.out.println("Exception has been" + 
									" caught" + ex); 
		} 

		t3.start(); 
//		try {
//			t3.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("Main thread finishing...");
	} 
} 

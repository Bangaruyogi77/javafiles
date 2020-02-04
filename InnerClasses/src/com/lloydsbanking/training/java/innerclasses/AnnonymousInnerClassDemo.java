package com.lloydsbanking.training.java.innerclasses;

public class AnnonymousInnerClassDemo {

	/**
	 * 
	 * @param m
	 */
	public void printAnnonymous(Message m) {
		
		m.printAnnonymous();
	}
	
	
	public static void main(String args[]) {
		
		AnnonymousInnerClassDemo aiDemo = new AnnonymousInnerClassDemo();
		
		
		aiDemo.printAnnonymous(new Message() {

			@Override
			public void printAnnonymous() {
				System.out.println("Printing the message in the annonymous class!!!");				
			}});
	
		}			
}

interface Message{
	public void printAnnonymous();
}
package com.lloydsbanking.training.java.threads;
/**
 * 
 * @author shant
 *
 */
public class MyThread extends Thread {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
    	MyThread myThread = new MyThread();
    	myThread.start();
    }

}
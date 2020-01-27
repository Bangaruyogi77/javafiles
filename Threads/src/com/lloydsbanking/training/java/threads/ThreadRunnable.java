package com.lloydsbanking.training.java.threads;
/**
 * 
 * @author shant
 *
 */
public class ThreadRunnable implements Runnable {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        ThreadRunnable t = new ThreadRunnable();
        Thread thread = new Thread(t);
        thread.start();
    }

}
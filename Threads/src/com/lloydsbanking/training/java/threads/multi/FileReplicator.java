package com.lloydsbanking.training.java.threads.multi;
/**
 * 
 * @author shant
 *
 */
public class FileReplicator {


    public static void main(String args[]) {

    	MyThread myFileReplicator = new MyThread();
//    	myFileReplicator.start();
    	
    	for (int i = 0; i < 10; i++) {
    		myFileReplicator = new MyThread("Thread " + i);
        	myFileReplicator.start();
        		
    	}
    }

}
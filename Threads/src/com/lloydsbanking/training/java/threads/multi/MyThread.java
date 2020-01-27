package com.lloydsbanking.training.java.threads.multi;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 
 * @author shant
 *
 */
public class MyThread extends Thread {

	public String name;
	public final int BUFFER_SIZE = 4096;
	
	public MyThread() {

	}

	public MyThread(String name) {
		this.name = name;
	}

	public void run() {
		long startTime = System.currentTimeMillis();
		System.out.println(name + " has just begun reading the large file");
		try {
			
			File inFile = new File("C:\\Users\\shant\\Videos\\Captures\\screenshot_1.png");
			// read the file
			FileInputStream iStream = new FileInputStream(inFile);
			// write the file
			File outFile = new File("C:\\Users\\shant\\Videos\\Captures\\Write\\" + this.name + inFile.getName());
			FileOutputStream fOut = new FileOutputStream(outFile);

			byte[] buffer = new byte[BUFFER_SIZE];
			int bytesRead = -1;
			
//			while((bytesRead = iStream.read()) != -1) {
//				fOut.write(bytesRead);
//			
//			}
			while((bytesRead = iStream.read(buffer)) != -1) {
				fOut.write(buffer, 0, bytesRead);
			}
			
			
			iStream.close();
			fOut.close();
			
		}
		catch( Exception e) {
			e.printStackTrace();
		}
		System.out.println(name + " has just finished reading the large file and took " + (System.currentTimeMillis() - startTime) + " msecs");

	}
}
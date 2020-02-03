package com.lloydsbanking.training.java.io;
/**
 * @author shant
 * File demo for training.
 */
import java.io.File;

public class FileDemo {

	/**
	 * constructor
	 */
	public FileDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param args input array of parameters.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			// open a file to the target
			File file = new File("C:\\Users\\shant\\Documents\\TCS\\Training\\filestore\\input.txt");
			System.out.println("Can we read this file " +  file.canRead());
			System.out.println("Path of this file " +  file.getAbsolutePath());
			System.out.println("Is this a directory " +  file.isDirectory());
			
			// get the parent directory
			File training = new File(file.getParent()+ "\\training");
			// create a directory under the parent
			training.mkdir();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

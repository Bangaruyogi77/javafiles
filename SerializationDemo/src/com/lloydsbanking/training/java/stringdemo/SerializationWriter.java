package com.lloydsbanking.training.java.stringdemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationWriter {

	public static void main(String args[]) {
		short height = 172;
		Employee e = new Employee("Shanth", "Kumar", height);

		try {
			FileOutputStream fileOut = new FileOutputStream("C:\\Users\\shant\\Documents\\TCS\\Training\\serialize\\emp.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in C:\\Users\\shant\\Documents\\TCS\\Training\\serialize\\emp.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}
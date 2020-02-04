package com.lloydsbanking.training.java.stringdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationReader {

	public static void main(String args[]) {

		try {
			FileInputStream fileIn = new FileInputStream("C:\\Users\\shant\\Documents\\TCS\\Training\\serialize\\emp.ser");
			ObjectInputStream objIn = new ObjectInputStream(fileIn);
			// read the emp reference
			Employee emp = (Employee)objIn.readObject();
			objIn.close();
			fileIn.close();
			
			System.out.printf("Deserialized data " + emp.getFirstName() + " " + emp.getSurname() + " " + emp.getHeight());
		} catch (IOException | ClassNotFoundException i) {
			i.printStackTrace();
		}
	}
}
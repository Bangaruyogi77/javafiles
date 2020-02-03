package com.lloydsbanking.training.java.io;

import java.io.*;

public class CharacterStreams {

	public static void main(String args[]) throws IOException {
		FileReader in = null;
		FileWriter out = null;

		try {
			in = new FileReader("C:\\Users\\shant\\Documents\\TCS\\Training\\filestore\\input.txt");
			out = new FileWriter("C:\\Users\\shant\\Documents\\TCS\\Training\\filestore\\Write\\output.txt");

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
	         System.out.println("File has been written...");
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}

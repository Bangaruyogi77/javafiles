package com.lloydsbanking.training.java.io;

import java.io.*;

import com.lloydsbanking.training.java.util.ConfigProperties;
/**
 * 
 * @author shant
 *
 */
public class ByteStreamsVsBufferedStreams {

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;
      FileOutputStream out = null;
      long startTime = System.currentTimeMillis();
      try {
         in = new FileInputStream("C:\\Users\\shant\\Documents\\TCS\\Training\\filestore\\input.txt");
         out = new FileOutputStream("C:\\Users\\shant\\Documents\\TCS\\Training\\filestore\\Write\\output.txt");
         
//         in = new FileInputStream(ConfigProperties.getPropValue("inputfile"));
//         out = new FileOutputStream(ConfigProperties.getPropValue("outputfile"));
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
         System.out.println("File has been written... and it took " + (System.currentTimeMillis() - startTime) + " msecs");
 
         startTime = System.currentTimeMillis();
         BufferedInputStream bin = new BufferedInputStream(new FileInputStream("C:\\Users\\shant\\Documents\\TCS\\Training\\filestore\\inputBig.txt"));
         BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("C:\\Users\\shant\\Documents\\TCS\\Training\\filestore\\Write\\outputBig.txt"));
         int bufferSize = 1 * 1024;
         byte[] buffer = new byte[bufferSize];
         while((bufferSize = bin.read(buffer)) != -1) {
        	 bout.write(buffer, 0, bufferSize);
         }
         System.out.println("File has been written using buffer... and it took " + (System.currentTimeMillis() - startTime) + " msecs");
         bin.close();
         bout.close();
      }catch(Exception e) {
    	  e.printStackTrace();
      }
      finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}
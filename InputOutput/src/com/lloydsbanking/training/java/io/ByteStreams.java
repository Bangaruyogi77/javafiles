package com.lloydsbanking.training.java.io;

import java.io.*;

import com.lloydsbanking.training.java.util.ConfigProperties;
/**
 * 
 * @author shant
 *
 */
public class ByteStreams {

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
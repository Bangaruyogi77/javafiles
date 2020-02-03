package com.lloydsbanking.training.java.io;
import java.io.*;
public class ReadConsole {

   public static void main(String args[]) throws IOException {
      InputStreamReader cin = null;

      try {
         cin = new InputStreamReader(System.in);
         System.out.println("Enter characters, 'q' to quit.");
         char quit;
         do {
            quit = (char) cin.read();
            System.out.print(quit);
         } while(quit != 'q');
      }finally {
         if (cin != null) {
            cin.close();
         }
      }
   }
}
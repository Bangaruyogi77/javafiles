package com.lloydsbanking.training.java.ds;

import java.util.*;
public class HashTableDemo {

   public static void main(String args[]) {
      // Create a hash table
      Hashtable timeAvailable = new Hashtable();
      Enumeration days;
      String day;
      double bal;

      for (int i = 1; i < 7; i++) {
    	  timeAvailable.put("Day " + i, (i * 100) * (Math.random()));
      }

      
      // Show all days in hash table.
      days = timeAvailable.keys();
      
      while(days.hasMoreElements()) {
    	  day = (String) days.nextElement();
         System.out.println(day + ": " + timeAvailable.get(day));
      }        
      System.out.println();
      
   }
}
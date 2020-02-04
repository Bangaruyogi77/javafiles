package com.lloydsbanking.training.java.ds;

import java.util.Vector;
import java.util.Enumeration;

public class EnumerationDemo {

   public static void main(String args[]) {
      Enumeration days;
      Vector weekDays = new Vector();
      
      weekDays.add("Sunday");
      weekDays.add("Monday");
      weekDays.add("Tuesday");
      weekDays.add("Wednesday");
      weekDays.add("Thursday");
      weekDays.add("Friday");
      weekDays.add("Saturday");
      days = weekDays.elements();
      
      while (days.hasMoreElements()) {
         System.out.println(days.nextElement()); 
      }
   }
}
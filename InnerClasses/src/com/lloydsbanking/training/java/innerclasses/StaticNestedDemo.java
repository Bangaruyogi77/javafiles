package com.lloydsbanking.training.java.innerclasses;

/**
 * @author shant
 *
 */
public class StaticNestedDemo {
	
   static class NestedInnerClass {
      public void print() {
         System.out.println("This is my static nested inner class");
      }
   }
   
/**
 * @param args
 */
public static void main(String args[]) {
	   StaticNestedDemo.NestedInnerClass nested = new StaticNestedDemo.NestedInnerClass();	 
	   nested.print();
   }
}
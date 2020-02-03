package com.lloydsbanking.training.java.oo.interfacedemo;

class USBDemo {
    public static void main(String[] args) {

    	USBInterface keyBoard = new Keyboard();
    	keyBoard.plugin();
    	keyBoard.plugout();
    	
    	USBInterface printer = new Printer();
    	printer.plugin();
    	printer.plugout();
    	
    	USBInterface mouse  = new Mouse();
    	mouse.plugin();
    	mouse.plugout();
    }
} 
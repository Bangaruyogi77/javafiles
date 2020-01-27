package com.lloydsbanking.training.java.oo.interfacedemo;

class USBDemo {
    public static void main(String[] args) {

    	USBInterface device = new Keyboard();
    	device.plugin();
    	device.plugout();
    	
    	device = new Printer();
    	device.plugin();
    	device.plugout();
    	
    	device = new Mouse();
    	device.plugin();
    	device.plugout();
    }
} 
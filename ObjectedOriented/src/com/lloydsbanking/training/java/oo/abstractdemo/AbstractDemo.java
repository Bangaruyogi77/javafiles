package com.lloydsbanking.training.java.oo.abstractdemo;
/**
 * 
 * @author shant
 *
 */
public class AbstractDemo {

	public static void main(String args[]) {

		Car car = new FordFocus();
		car.openDoor();
		car.closeDoor();
		car.start();
		car.drive();
		car.stop();
		
		System.out.println("------------------------------------------");
		
		car = new HondaJazz();
		car.openDoor();
		car.closeDoor();
		car.start();
		car.drive();
		car.stop();
		
		HondaJazz hondaCar = new HondaJazz();
		hondaCar.openDoor();
		hondaCar.closeDoor();
		hondaCar.start();
		hondaCar.drive();
		hondaCar.stop();

		System.out.println("------------------------------------------");
		HondaCRV.print();
		System.out.println("------------------------------------------");
		
		HondaCRV hondaCRV = new HondaCRV();
		hondaCRV.openDoor();
		hondaCRV.airConOn();
		hondaCRV.closeDoor();
		hondaCRV.start();
		hondaCRV.drive();
		hondaCRV.airConOff();
		hondaCRV.stop();
		
	}

}

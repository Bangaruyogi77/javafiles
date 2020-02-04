package com.lloydsbanking.training.java.stringdemo;

import java.io.Serializable;
/**
 * 
 * @author shant
 *
 */
public class Employee implements Serializable{

	private String firstName;
	private String surname;
	private short height;
	
	public Employee(String firstName, String surName, short height) {

		this.firstName = firstName;
		this.surname = surName;
		this.height = height;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the age
	 */
	public short getHeight() {
		return height;
	}

	/**
	 * @param age the age to set
	 */
	public void setHeight(short height) {
		this.height = height;
	}

	
}

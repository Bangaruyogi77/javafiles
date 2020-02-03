package com.lloydsbanking.training.java.controlflow;

public class ControlFlowDemo {

	public ControlFlowDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if-else block
		System.out.println("-----------------if block--------------------");
		boolean ifYes = true;
		if (ifYes) {
			System.out.println("Print boolean value " + ifYes);
		} else {
			System.out.println("Print boolean value " + ifYes);
		}

		// switch case
		System.out.println("-----------------switch case block--------------------");

		int day = 1;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}

		// while loop
		System.out.println("-----------------while loop block--------------------");

		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}

		// do-while loop
		System.out.println("-----------------do while loop block--------------------");

		int j = 0;
		do {
			System.out.println(j);
			j++;
		} while (j < 5);

		// for loop
		System.out.println("-----------------for loop block--------------------");

		for (int k = 0; k < 5; k++) {
			System.out.println(k);
		}
	}

}

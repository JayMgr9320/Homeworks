package assignmentsAndPractices;

import java.util.Scanner;

public class Assignment3 {
	public static void evenNumberOrNot() {
		Scanner scn = new Scanner (System.in);
		int number1 = 0; 
		System.out.println("Plear enter a number to check if it is even or not :");
		number1 = scn.nextInt(); 
		if (number1 % 2 == 0) {
			System.out.println(number1 + " is even number");
		}
		else {
			System.out.println(number1 + " is odd number");
		}
	}

	public static void oddNumberOrNot() {
		Scanner sn = new Scanner (System.in);
		int number2 = 0; 
		System.out.println("Plear enter a number to check if number is odd or not :");
		number2 = sn.nextInt(); 
		if (number2 % 2 != 0) {
			System.out.println(number2 + " is odd number");
		}
		else {
			System.out.println(number2 + " is not a odd number");
		}
	}
	public static void leapYearOrNot() {
		Scanner s = new Scanner (System.in);
		System.out.println("Please enter a number to check the leap year or not:");
		int year = s.nextInt(); 
		if (year % 4 == 0) 
			System.out.println(year + " is a leap year");
		else
			System.out.println(year + " not a leap year");
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		evenNumberOrNot(); 
		System.out.println(" ------------------------------------------------------------------------");
		oddNumberOrNot();
		System.out.println(" **********************************************************************");
		leapYearOrNot(); 
		
	}

}

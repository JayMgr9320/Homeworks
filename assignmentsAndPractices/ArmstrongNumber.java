package assignmentsAndPractices;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void armstrongNumber() {
		int remainder, originalNumber ,sum = 0, num = 0;
		System.out.println("Please enter a number to check if it is an Armstrong number: ");
		Scanner s = new Scanner (System.in);
		num = s.nextInt() ; 
		originalNumber = num;
		while(originalNumber != 0) {
			remainder = originalNumber % 10; 
			sum  += Math.pow(remainder, 3); 
			originalNumber /=10; 
			}
		if(sum == num) 
			System.out.println(num + " is an Armstong number");
				
		else 
			System.out.println(num + " is an Armstrong number");
		s.close();
		}

	public static void main(String[] args) {
		/*  Armstrong number is the sum of the three digit number such that sum of the
		 cube is of its digit is equal to the number of itself*/
			armstrongNumber();
			}
	}

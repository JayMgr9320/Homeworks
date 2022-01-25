package assignmentsAndPractices;

import java.util.Scanner;

public class Palindrome {
	public static void palindromeUsingStringBuild() {
		String palindrome = "abba";
		Scanner scan = new Scanner(System.in);
		StringBuffer s = new StringBuffer(palindrome);
		s.reverse();
		String pal = s.toString();
		if(pal.equals(palindrome))
			System.out.println("String is palindrome");
		else 
			System.out.println("Not a palindrome");
		System.out.println();
		scan.close();
	}
		
	public static void palindromeNum() {
		int reversePalNum = 0, remainder;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a number to check for palindrome");
		int palNum = s.nextInt();
		s.close();
		int originalNum = palNum;
		while (palNum != 0) {
			remainder = palNum % 10;
			reversePalNum = reversePalNum * 10 + remainder;
			palNum /= 10;
		}
		if (originalNum == reversePalNum) {
			System.out.println(originalNum + " is palindrome.");
		} else {
			System.out.println(originalNum + " is not  palindrome.");
		}

	}
	public static void main(String[] args) {
		palindromeNum();
		palindromeUsingStringBuild();
		
	}

}

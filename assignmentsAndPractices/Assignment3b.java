package assignmentsAndPractices;

import java.util.Scanner;

public class Assignment3b {
	public static void evenNumbers1To100() {
		int i;
		for (i = 2; i <= 100; ++i) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void primeNumbers1To100() {
		for (int i = 0; i < 100; i++) {
			boolean isPrime = true;
			if (i == 0 || i == 1) {
				System.out.println();
				isPrime = false;
			}

			for (int j = 2; j < i; ++j) {

				if (i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				System.out.println(i);
			}
		}
	}

	public static void fibonacciSequence() {
		int fibUpto = 10;
		int firstNum = 0, secondNum = 1;
		System.out.println("fibSequences are:");
		for (int i = 0; i < fibUpto; i++) {
			System.out.print(firstNum + " ");
			int temp = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = temp;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		evenNumbers1To100();
		System.out.println();
		primeNumbers1To100();
		fibonacciSequence();
		}
}

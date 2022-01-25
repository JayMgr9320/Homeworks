package assignmentsAndPractices;

import java.util.Scanner;

public class Factorial {

	public static void factorial() {
		int factorialNums = 1;
		System.out.println("Enter a numer to show the factorial");
		Scanner s = new Scanner(System.in);
		int numTObeFactored = s.nextInt();
		s.close();
		for (int i = 1; i <= numTObeFactored; i++) {
			factorialNums = factorialNums * i;
		}

		System.out.println("Factorial Number:" + factorialNums + " ");
	}

	public static void main(String[] args) {
		factorial();

	}

}

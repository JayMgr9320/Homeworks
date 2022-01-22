package assignmentsAndPractices;

public class SwapNumbers {
	private int num1, num2, num3, num4;

	public void SwapNums(int num1, int num2, int num3, int num4) {

		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
	}

	public void Swap2NumbersWithoutTempVar(int num1, int num2) {
		System.out.println("before swapping Number without using temp var:\t" + num1 + "\t" + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After swapping Numbers without using temp:\t" + num1 + "\t" + num2);
	}

	public void swap2numbersWithTempVar(int num1, int num2) {
		System.out.println("before swapping Number:" + num1 + "\t" + num2);
		int temp = 0;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After swapping Number:" + num1 + "\t" + num2);
	}

	public void swap3NumbersWithoutTempVar(int num1, int num2, int num3) {
		System.out.println("before swapping Number:" + num1 + "\t" + num2 + "\t" + num3);
		num1 = num1 + num2 + num3;
		num2 = num1 - (num2 + num3);
		num3 = num1 - (num2 + num3);
		num1 = num1 - (num2 + num3);
		System.out.println("After swapping Number:" + num1 + "\t" + num2 + "\t" + num3);

	}

	public void swap3NumbersWithTempVar(int num1, int num2, int num3) {
		System.out.println("before swapping Number:" + num1 + "\t" + num2 + "\t" + num3);
		int temp = 0;
		temp = num1;
		num1 = num2;
		num2 = num3;
		num3 = temp;
		System.out.println("After swapping Number:" + num1 + "\t" + num2 + "\t" + num3);

	}

	public void swap4numbersWithTempVar(int num1, int num2, int num3, int num4) {
		int temp = 0; 
		num1 = num1 + num2 + num3; 
		
		

	}

	public void swap4NumbersWithoutTempVar(int num1, int num2, int num3, int num4) {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapNumbers swap = new SwapNumbers();
		swap.Swap2NumbersWithoutTempVar(3, 7);
		swap.swap2numbersWithTempVar(11, 13);

		swap.swap3NumbersWithoutTempVar(17, 19, 23);
		swap.swap3NumbersWithTempVar(29, 33, 37);

	}

}

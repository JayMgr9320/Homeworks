package assignmentsAndPractices;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long gioFiberSilverPlanCost = 699;
		float gst = 18;
		double finalCost = 0;
		System.out.println("Before the tax:" + gioFiberSilverPlanCost);
		finalCost = gioFiberSilverPlanCost + (gioFiberSilverPlanCost * gst) / 100;
		System.out.println("After the tax final cost is:" + finalCost);
		

	}

}

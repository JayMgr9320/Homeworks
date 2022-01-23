package assignmentsAndPractices;

public class Assignment2 {
	public void question7() {
		float pizzaPrice = 399;
		float finalBill = 0;
		 float totalCostOfPizza = pizzaPrice * 2; 
		 finalBill = totalCostOfPizza -( totalCostOfPizza * 20)/100;
		 System.out.println(finalBill);	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long gioFiberSilverPlanCost = 699;
		float gst = 18;
		double finalCost = 0;
		System.out.println("Before the tax:" + gioFiberSilverPlanCost);
		finalCost = gioFiberSilverPlanCost + (gioFiberSilverPlanCost * gst) / 100;
		System.out.println("After the tax final cost is:" + finalCost);
		Assignment2 asg = new Assignment2();
		asg.question7();
	
	}

}

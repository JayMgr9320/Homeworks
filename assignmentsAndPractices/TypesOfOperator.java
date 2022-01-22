package assignmentsAndPractices;

public class TypesOfOperator {
	
	public void ternaryOperator(int num1, int num2) {
		int minNum = 0; 
		minNum = (num1  > num2)? num2 : num1;
		System.out.println(minNum);
		
	}
	public void booleanOperator(int num1, int num2) {
		boolean result; 
		result = (num1> num2) ? true:false;
		System.out.println(result);
		
		
	}
	public static void main(String[] args) {
		TypesOfOperator op = new TypesOfOperator(); 
		op.ternaryOperator(5, 7);
		op.booleanOperator(11, 17);
	}

}

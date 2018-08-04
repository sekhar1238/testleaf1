package wdMethods;

public class AccessArithmeticOperations {

	public static void main(String[] args) {
		ArithmeticOperations aao= new ArithmeticOperations();
		aao.addition();
		aao.subtract();
		aao.multiply();
		aao.multiplyNumberOnebytwo();
		int z= aao.divideNumberTwoby(5);
		System.out.println("Result of divide number two by 5 is"+z);
		
	}

}

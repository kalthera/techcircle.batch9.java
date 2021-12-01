package day04_operators;

public class TernaryOperator {

	public static void main(String[] args) {

//	variable = 	(condition) ? if true : if false

		int a, b;
		a = 10;

		b = (a == 1) ? 20 : 30;

		System.out.println(b); // false

		b = (a == 10) ? 20 : 30;

		System.out.println(b); // true
		
		int numA , numB, numC;
		
		numA = 1;
		numB = 2;
		numC = (numA + numB > 5) ? 10: 25;
		
		System.out.println(numC);
		
		

	}

}

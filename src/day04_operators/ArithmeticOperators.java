package day04_operators;

public class ArithmeticOperators {

	public static void main(String[] args) {

		int numA = 10;
		int numB = 20;

		System.out.println(numA + numB); // 30

		System.out.println(numB - numA); // 10

		System.out.println(numA-numB);// -10
		
		System.out.println(numA*numB);//200
		
		System.out.println(numA / numB);// 0 because int can hold only whole number
		
		int A = 10;
		double B = 20;
		
		System.out.println(A/B);//0.5 at least one of them need to be int
		
		int numC = 3;
		int numD = 2;
		int numE = 4;
		
		System.out.println(numA / numD); // 5
		
		System.out.println(numA % numD); // 0 (2,2,2,2,2)
		
		System.out.println(numA % 3); // 1 (3,3,3,1)
		
		System.out.println(numA % numE); //2 (4,4,2)
		
		System.out.println(numA);
		
		numA++; //numA = numA + 1; =11
		
		System.out.println(numA);
		
		numA++; // 12
		System.out.println(numA);
		
		numA++;
		numA++;
		
		
		
		System.out.println(numA);
		
		numA--; //     numA = numA - 1;
		numA--;
		numA--;
		numA--;
		
		System.out.println(numA); //10
		
		numA--;
		
		System.out.println(numA);
		
		
		
		
		
		
	}

}

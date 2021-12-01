package day04_operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		// +=, -=, *=, /=
		
		int A = 10;
		
		A += 5; // A = A +5
		
		System.out.println(A);
		
		A +=10;
		
		System.out.println(A);
			
		A -= 5;
		
		System.out.println(A);
		
		
		A += 5;
		A += 10;
		System.out.println(A); // 35
		
		A -= 5;
		System.out.println(A);//30
		

	}

}

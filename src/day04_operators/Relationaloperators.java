package day04_operators;

public class Relationaloperators {

	public static void main(String[] args) {
		
		int a = 3;
		
		int b = 4;
		
		int c = 2;
		
		int d = 3;
		
		// == , != , >= , <= , > , <
		
		System.out.println(a == d);
		
		boolean result = a == d; // optional if you want to create variable
		
		System.out.println(result);
//		                   3>4
		System.out.println(a > b);
		
		result = a > b;
		
		System.out.println(result);
		
		System.out.println(a != b); // not equal // true
		
		System.out.println(a >=b); // false
		
		System.out.println(a <=4);// true
		
		System.out.println(a != d); //false
		
		System.out.println(a >= d); //true
//		                   2 + 3 > 4
		System.out.println(a + c > b); // true
		
		System.out.println(a != b); // not equal // true
		
		
		

	}

}

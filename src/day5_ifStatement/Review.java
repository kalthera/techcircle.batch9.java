package day5_ifStatement;

public class Review {

	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 15;
		
		System.out.println(a > b && b > a); // false
		
		System.out.println(a >b | b > a); // true
		
		System.out.println(! (a > b && b > a)); // true
		
		
		int c = (a > b) ? 1 : 2;
		System.out.println(c);//2
		
		System.out.println(c++); //2
		
		System.out.println(c);//3
		
		c +=5; // c = c+5
		
		System.out.println(c);//8
		
		System.out.println(--c);//7
		
		
		
		final double pi = 3.14;
		
//		pi = 6.14;
		
		System.out.println(pi);//3.14
		
		
		
		
		//Modulus
		
		int result = 23%6; //(6,6,6,5)
		
		System.out.println(result);//5
		
		String str = (result > 3) ? "str1" : "str2";
		
		System.out.println(str);//str1
		
//		Write a program to find a given number is positive or negative
		
//  	num1 = 10;
//		num2 = -5;
		
		int num1 = 10;
		String givenNumber = (num1 > 0) ? "positive" : "negative";
		
		System.out.println(givenNumber);
		
		int num2 = -10;
		
		System.out.println(num2 > 0 ? num2 + " ;is positive" : num2 +" is negative"); // -10negative
		
		
		
		
		

	}

}

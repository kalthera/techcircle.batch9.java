package day09_loopReview;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int total;
		String operator;
		
		Scanner scanNum1 = new Scanner(System.in);
		System.out.println("Enter first number : ");
		num1 = scanNum1.nextInt();
				
		Scanner scanOperator = new Scanner(System.in);
		System.out.println("Enter operator [+,-,*,/]: ");
		operator = scanOperator.next();
		
		Scanner scanNum2 = new Scanner(System.in);
		System.out.println("Enter second number : ");
		num2 = scanNum2.nextInt();
		
		if(operator.equals("+")) {
			total = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + total);
		}else if(operator.equals("-")) {
			total = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + total);	
		}else if(operator.equals("*")) {
			total = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + total);	
		}else if(operator.equals("/")) {
			total = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + total);	
		}else {
			System.out.println("Error");
		}
		
		scanNum1.close();
		scanNum2.close();
		scanOperator.close();
		

	}

}

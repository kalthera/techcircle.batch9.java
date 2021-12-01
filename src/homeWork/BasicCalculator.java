package homeWork;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
	//	Create a basic calculator using if else statement.
	//	Note: Create a String variable name it operator. 
	//	Create 3 numeric variable, total, num1 and num2 and perform basic calculation. 
	
	      int n1;
	      int n2;
	      int total;
	      String operator;
	      
	      Scanner scann1 = new Scanner(System.in);
	      System.out.println("First Number");
	      n1 = scann1.nextInt();
	
	      Scanner scanoperator = new Scanner(System.in);
	      System.out.println("operator");
	      operator = scanoperator.next();
	
	      Scanner scann2 = new Scanner(System.in);
	      System.out.println("Second Number");
	      n2 = scann2.nextInt();
	       
	      if(operator.equals ("+")) {
				total = n1 + n2;
				System.out.println(n1 + " + " + n2 + " = " + total);
			}else if(operator.equals("-")) {
				total = n1 - n2;
				System.out.println(n1 + " - " + n2 + " = " + total);
	        }else if(operator.equals("*")) {
				total = n1 * n2;
				System.out.println(n1 + " * " + n2 + " = " + total);	
			}else if(operator.equals ("/")) {
				total = n1 / n2;
				System.out.println(n1 + " / " + n2 + " = " + total);	
			}else {
				System.out.println("Invalid");
			}
			
			scann1.close();
			scann2.close();
			scanoperator.close();
	      
	      
	      
	      
	
	}

}

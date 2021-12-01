package homeWork;

public class Hw2_NameOfMonth {

	public static void main(String[] args) {
		
		
		
		/*
		 * NameOfMonth2 
		 * 2, 
		 * Write a program that can print out the name of the month
		 * based on the number 1 ~ 12 
		 * number = 1 // 1 ~ 12 
		 * output: January\ Must use
		 * ternary
		 */
		
		int number = 6;
		
		int result = (number > 0 && number < 13) ? 1 : 2;
		
		if (result == 1) {
			
			if (number == 1) {
				System.out.println("January");
			}
			if (number == 2) {
				System.out.println("February");
			}
			if (number == 3) {
				System.out.println("March");
			}
			if (number == 4) {
				System.out.println("April");
			}
			if (number == 5) {
				System.out.println("May");
				
			}
			if (number == 6) {
				System.out.println("June");}
			}
			
		    if (number == 7) {
		    	System.out.println("July");
		    }
		    if (number == 8) {
		    	System.out.println("August");
		    }
		    if (number == 9) {
		    	System.out.println("September");
		    
		    }
		    if (number == 10) {
		    	System.out.println("October");
		    }
		    if (number == 11) {
		    	System.out.println("November");
		    }
		    if (number == 12) {
		    	System.out.println("December");
		    }
	}

}

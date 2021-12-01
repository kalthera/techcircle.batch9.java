package day5_ifStatement;

public class OmittingElsePart {

	public static void main(String[] args) {
		
		int count = 3;
		if (count < 2) {
			System.out.println("line number 11");
			
			
		}
		
		
		System.out.println("i'm here");
		
		if (count > 2) {
			
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
			System.out.println(5);
			
		}
		/*
		1. write a program that can check if the given 
		               number is odd or even (OddEven)
				Ex:
					number = 100;
					output:
						100 is even number
					number = 101
					output:
						101 is odd number
		 */
		
		
		int number = 100;
		if ( number % 2 == 0) {
			System.out.println(number + "is even number");
		}else {
			System.out.println(number + "is odd number");
		}
//		2. write a program that can print out the maximum number between two numbers
	//Ex:
//			num1 = 20;
//			num2 = 30;
//			output:
//				30 is the maximum number
//			num1 = 20;
//			num2 = 20;
//			output:
//				both numbers are equal
		
		int num1 = 20;
		int num2 = 30;
		if (num2 > num1){
			System.out.println(num2 + " is the maximun number");
			
		}
		
		if (num1 > num2){
			
			System.out.println(num1 + "is the maximun number");
		}
		else 
		
		{System.out.println("both numbers are equal");
			
			
		}
		
		
		
		
		
		
			
		{
		
		
		
		
		
		
		

	}

} 
}

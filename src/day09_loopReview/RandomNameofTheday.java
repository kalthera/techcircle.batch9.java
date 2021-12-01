package day09_loopReview;

import java.util.Random;

public class RandomNameofTheday {

	public static void main(String[] args) {
		
		Random r = new Random();
		
         
		for (int i = 0; i < 100; i++) {
			
		 
			int day = r.nextInt(7);
			
			switch (day) {
			
			case 1:
				
			   System.out.println("Monday");
		       break;
		       
			case 2:
				System.out.println("Tuesday");
				break;
			
			case 3:
				System.out.println("Wednesday");
				break;
				
			case 4:
				System.out.println("Thursdau");
				break;
				
			case 5:
				System.out.println("Friday");
				break;
				
			case 6:
				System.out.println("Saturday");
				break;
				
			case 7:
				System.out.println("Sunday");
				break;
				
			default:
				System.out.println("Invalid Input");
				
			
			
			
			}
		
		
		
		}
		
		
		
		
		
	}

}

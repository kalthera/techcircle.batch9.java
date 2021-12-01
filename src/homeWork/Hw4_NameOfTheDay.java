package homeWork;

public class Hw4_NameOfTheDay {

	public static void main(String[] args) {
		
		/*
		 * 4, Write program that can print out the name of the day based on the number 1
		 * ~ 7 
		 * number = 1 // 1 ~ 7 
		 * output: Monday 
		 * number = 5 output: Friday
		 */
	    
		int number = 3;
		
		if (number == 1) {
			System.out.println(number + " is Monday");
		
		}
		if (number == 2) {
			System.out.println(number + " is Tuesday");
		}
		if (number == 3) {
			System.out.println(number + " is Wednesday");
		}
		if (number == 4) {
			System.out.println(number + " is Thursday");
		}
		if(number == 5) {
			System.out.println(number + " is Friday");
		}
		if (number == 6) {
			System.out.println(number + " is Saturday");
		}
		if (number == 7) {
			System.out.println(number + " is Sunday");
		}
	
}
}
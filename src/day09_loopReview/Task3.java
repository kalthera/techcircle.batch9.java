package day09_loopReview;

import java.util.Random;


public class Task3 {

	public static void main(String[] args) {
	//	Write a program that ask the user to input a positive integer. 
	//	It should then print the multiplication table of that number

    // range of number is between 1 - 10:
		//in put: 5
		// out put: 1x5 =10 , 2x5 = 10, 3x5=15
		
		Random r = new Random();
		int input = r.nextInt(10);
		
		for (int i = 1; i <= 10; i++) {
		   System.out.println(i + " x" + input + "= "+ (i*input));
	}
		
		
		int input1 = 5;
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(i +"x5 =" +input*i);
		}
		
		
	}

}

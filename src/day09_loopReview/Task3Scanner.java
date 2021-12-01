package day09_loopReview;

import java.util.Scanner;

public class Task3Scanner {

	public static void main(String[] args) {
		
		
		
Scanner scan = new Scanner(System.in);
		
//		int input = 5;
		
		System.out.println("Type a number between 1 ~ 10");
		
		int input = scan.nextInt();
		
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i +" x "+ input + " = " + i*input);
		}
	
		scan.close();
	}


		
		
		
		
		
		
		

	}



package day07_switchStament;

import java.util.Scanner;

public class LearnScannerObject {

	public static void main(String[] args) {
		
//		int score = 90;
		
		
		Scanner irfan = new Scanner(System.in);
		
		System.out.println("Please enter the score");
		
		int score = irfan.nextInt();
		
		
		System.out.println("Youre score is " + score);
		
		
		irfan.close();
		
		
		
		
		

	}

}

package day11_nestTest;

import java.util.Scanner;

public class Timer {

	public static void main(String[] args) throws InterruptedException {
		
		
//		for (int i = 59; i >=0; i--) {
//			System.out.println(i);
//		}
//		
//		
//		for (int j = 2; j >0; j--) { // or i = 2-1; i >=0
//			System.out.println("Hello");
//		}
//		
	
		Scanner scan = new Scanner(System.in);
		  System.out.println("How long do you wan to take a break?");
		  
		  
		for (int i = scan.nextInt()-1; i >= 0; i--) {
		//	System.out.println(i + "minutes");
		for (int j = 59;j  >= 0; j--) {
			System.out.println(i + " minute "+j + " second");
			
			Thread.sleep(1000);
			
		}
		
		
		}
		
		scan.close();
		
		
		
	}

}

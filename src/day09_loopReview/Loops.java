package day09_loopReview;

public class Loops {

	public static void main(String[] args) {
		
		for (int i = 0; i <=100; i++) {
			System.out.println(i);
		}
		
		System.out.println("-------------");
		
		
		for (int i = 100; i <=200; i++) {
			System.out.println(i);
		}
		
		System.out.println("--------------");

		for (int i = 1; i <= 100; i += 2) {
			System.out.println(i);
		}
		
	//	 for (int i = 1; i <= 100 ; i++) {
	//		if (i % 2 == 1)
	//	}
		System.out.println("-------------");
		
		
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
			System.out.println(i);
				
			}

	// do 500 push ups		
			
			for (int G = 1; G <= 500;G++) {
				System.out.println("push up" + G);
			
		
			}
			
			
			
			
			
			
//			
//			//		1. print out the numbers between 0 ~ 100 
//			int num = 0;
//			
//			while(num <= 100) {
//				System.out.println(num);
//				
////				num++;
//				
//				num = num + 1;
//			}
//			
//			
////			System.out.println(num);
//			
//			num = 0;
//			
////			System.out.println(num);
//			
//			
//			do {
//				System.out.println(num);
//				num++;
//			}while(num < 101);
//			
//			
//			for (int i1 = 0; i1 <= 100; i1++) {
//				System.out.println(i1);
//			}
//					
//				
	// 6. print out all the number 	divisible by 2 or 3 or 5 rang between 0 - 100
			
			
			for (int j = 0; j <= 100; j++) {
				if(j % 2 == 0 || j % 3 == 0 || j % 5 == 0) {
			}
				System.out.println(j);
		
			
		}
	
	// 7. exam
			int num = 100;
			
			System.out.println("Number :" + num + "\n");
			
			for (int j = 1; j <= num ; j++) {
				if (j % 2 == 0 && j % 3 == 0 && i % 5 == 0) {
					System.out.println("CodilityTestCoders");
				
			}else if (j % 2 == 0 && j% 3 == 0) {
				System.out.println("CodilityTest");
				
			
			}else {
				 if (i % 2 == 0) {
					 System.out.println("Codility");
				 }else if (i % 3 == 0) {
				     System.out.println("Test");	 
					 
					 
				 }else if (i% 5 == 0) {
					 System.out.println("Coders");
				 }else {
					 System.out.println(i);
				 }
			}
				
		
		
		
		
		
		
			}
		}
	}
}
		



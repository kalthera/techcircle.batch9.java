package day09_loopReview;

public class HomeWorkTask5 {

	public static void main(String[] args) {
//		Task 5:
//
//			Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
//
//			Range is 1 to 100;
//
//			output:
//
//				Sum of all odd number
//			         and 
//				Sum of all even number

		int sumEven = 0;
        int sumOdd = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sumEven +=i; //calculating even number
                 
            } else { // 0r if (i % 2 == 1)
                sumOdd += i;
            }
        }
        System.out.println("Sum of all even number is " + sumEven);
        System.out.println("Sum of all odd number is " + sumOdd);
       
       
	
	
	}

		
		
		
	}



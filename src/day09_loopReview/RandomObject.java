package day09_loopReview;

import java.util.Random;

public class RandomObject {

	public static void main(String[] args) {
		
		
	Random r = new Random();
	System.out.println(r.nextInt(100));
		
		
		
		boolean result = r.nextBoolean ();
		
		System.out.println(result);
		
	//	703-123-1234
		for (int i = 0; i < 10; i++) {	
		System.out.print(703);
		System.out.print(r.nextInt(999));
		System.out.print(r.nextInt(9999));
		
	    System.out.println();
		System.out.println();
	}

	}

}

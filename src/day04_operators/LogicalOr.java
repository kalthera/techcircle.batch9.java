package day04_operators;

public class LogicalOr {

	public static void main(String[] args) {
		// || OR

		
//		ConditonA ConditionB Result
		
//		  true      true      true
//		  true      false     true
//		  false     true      true
//		  false     false     false
		
		
		int A = 1;
		int B = 2;
		int C = 3;
//                           t        t		
		System.out.println( A < B || C > B);
//                           t         f		
		System.out.println( A < B || C < B);
				
		
	}

}

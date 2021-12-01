package day04_operators;

public class logicalOperators {

	public static void main(String[] args) {
		
		// && (AND) , || (Or) , ! (NOT)
		
				// && 
				
				//ConditionA  ConditionB  Result
//				   true         true       true
//				   
//				   true         false       false
//				   
//				   false        true        false
//				   
//				   false         false       false
				
				
				int A = 1; 
				int B = 2; 
				int C = 3;
				
				boolean conditionA = A < B; // true
				boolean conditionB = A + B == C; // true
				
				System.out.println(  conditionA && conditionB);
//				                   false     true 
				System.out.println(A > B && B < C); // false
//				                   true          false
				System.out.println(A * B == B && B > C); // false
//				                      false     false
				System.out.println( A >= B && B >= C); // falsew
				
		
		
		
		

	}

}

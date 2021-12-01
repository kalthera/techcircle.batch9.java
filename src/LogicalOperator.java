
public class LogicalOperator {

	public static void main(String[] args) {
		
		// && (AND) , || (Or) , ! (NOT)
		
		// &&
		
		// ConditionA     ConditionB   Result
//           true           true        true
//           true            f		     f
//            f               t          f
//		      f              f           f
		
		
		    int A = 1;
		    int B = 2;
		    int C = 3;
		    
		    boolean conditionA = A < B; // true
		    boolean conditionB = A + B == C; // true
		    
		    System.out.println( conditionA && conditionB);
   //                              f       t
		    System.out.println(A > B && B < C); //false
	//	                          t         f
		    System.out.println(A * B == B && B > C);
		    
  }

}

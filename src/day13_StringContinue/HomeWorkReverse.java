package day13_StringContinue;

public class HomeWorkReverse {

	public static void main(String[] args) {
		
		 // Write a program to reverse a string
//      input = ABCD
//      output = DCBA
		
//                    0123
		String str = "ABCD";
		String output = "";
//		System.out.println("output " + output);
		
		
		for (int i = str.length()-1; i >=0; i--) {
			output = output + str.charAt(i);
			//System.out.println("output in for loop " + output);
		}
		    System.out.println(output);
		
	}
}
//		//                 01234567
//		//     String str = "kalthera";
//		    		
//	//	    System.out.println(str.length());
//		//     String output = "";
//			    
//		
//		    for (int i = 0; i <=str.length()-1; i++) {
////			System.out.println(i);
////		    System.out.println(str.charAt(i));
//		}
//			
//		    for (int j = str.length()-1; j >=0; j--) {
//	//		System.out.println(str.charAt(j));
//		    	output = output + str.charAt(j);
//		    		System.out.println(output);
//		}
//		
////		System.out.println(output);
//		
		
		
		

	



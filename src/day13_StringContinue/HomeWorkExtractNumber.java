package day13_StringContinue;

public class HomeWorkExtractNumber {

	public static void main(String[] args) {
		
		
//		String str = "ab123456cde78d";

//      Write a program to extract number from a string.

//      expected output : 12345678
		
		
		String str = "ab123456cde78d";
		
        for(int i = 0 ; i <= str.length()-1 ; i++) {
            
            for(char j =48 ; j <= 57 ; j++) {  // print only 0-9
                if(j == str.charAt(i)) {
                    System.out.print(str.charAt(i));
                }
		
		
		
	}
}
	//   remove,replace
	//		System.out.print(str.replaceAll("[a-z]", ""));
		
	//or
        
        for(int i = 0; i < str.length(); i ++) {
//          System.out.println(str.charAt(i));
          
          char currentChar = str.charAt(i);
          
//          System.out.println(currentChar);
          
          int refNum = currentChar;
          
//          System.out.println(refNum);
          
          if (refNum >= '0' && refNum <= '9') {
              System.out.print(currentChar);
          }
          
          
      }
      
      
//      char zero = '0';
//      int numZero = zero;
//      
//      System.out.println(numZero); 
//      
//      int nine = '9';
//      
//      System.out.println(nine);
//      
      

        
        
        
        }
	}



package day13_StringContinue;

public class HomeWorkExtractLetter {

	public static void main(String[] args) {
//		Extract letters from a String 
//		Write a program to extract all the letter from a given alphanumeric string 
//		input :"a1b2c34d098098efg" 
//		output: abbdefg
//		
		
		String str = "a1b2c34d098098efg";
		System.out.println(str.replaceAll("[0-9]","")); //or "\\d",""
//or
		
		for(int i = 0; i < str.length(); i ++) {
//          System.out.println(str.charAt(i));
          
          char currentChar = str.charAt(i);
          
//          System.out.println(currentChar);
          
          int refNum = currentChar;
          
//          System.out.println(refNum);
          
//          if (refNum < '0' || refNum >'9') {
//              System.out.print(currentChar);
//          }
          
          if ((refNum >= 'a' && refNum <= 'z') || (refNum >= 'A' && refNum <= 'Z')) 
          {
              System.out.print(currentChar);
          }
		
		
		
		
		

	}

} 
}

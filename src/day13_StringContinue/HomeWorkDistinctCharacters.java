package day13_StringContinue;

public class HomeWorkDistinctCharacters {

	public static void main(String[] args) {
		
//		Write a program to find distinct character from a string
//        String str = "aaaaaaabbbbbbbbbbbccccccccccccddddddeeeeffffgggg";
//        //String expectedStr = "abc"; 
		
		String str = "aaaaaaabbbbbbbbbbbccccccccccccddddddeeeeffffgggg";
		String result = "";
		 for(int i = 0 ; i <= str.length()-1 ; i++ ) {
	           //if result does not contains a single letter , then do this 
	            if(!result.contains(str.substring(i,i+1))) {
	                
	         //       result += x10.charAt(i); or
	                result = result + str.charAt(i);
	              
	            }
	            
	            
	        } 
	        
		   System.out.println(result);	
				
		
	//or
		   String str1 = "aaaaaaaaaaaaaaabbbbbbbkkkkkkkkkkkkkkkkmbkjhkjghkbbbbbbbcANSDFSDF12313ccccccccccccccccccc";
	        
	        String expectedStr = "abc";
	        
	        String unique = "";
	        
	        for (int i = 0 ; i < str.length() ; i ++) {
	            
	            char currentChar = str.charAt(i);
	                    
	            String s = String.valueOf(currentChar);
	            
	            if (!unique.contains(s)) {
	                unique = unique+s;
	            }
	            
	        }
	        
	        
	        System.out.println(unique);
		
		
		
	}

}

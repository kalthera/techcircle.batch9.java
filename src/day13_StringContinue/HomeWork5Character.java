package day13_StringContinue;

import java.util.Scanner;

public class HomeWork5Character {

	public static void main(String[] args) {
		     
//		Make it total of 5 characters 
//		Write a program that checks the length of the string. 
//		If the string length is less than 5 characters then add any character and make it total of five character.
//		 if the length is equal to 5 then keep the original string. 
//		if string length greater than 5 characters then keep the last 5 characters. 
//		 Examples: String str1 = "computer"; 
//		           String str2 = "Java"; 
//		           String str3 = "Pizza";  
//		         expected "puter" , "JavaA" "Pizza"
//		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Word");
		String word =scan.nextLine();
		
	    int L = word.length();
		String add = "";
	    
	    
		if(L == 5) {
			System.out.println(word);
		}else if(L > 5) {
			System.out.println(word.substring(L-5,L));
		}else if (L < 5) {
			for(int i = 1 ; i <= (5-L) ; i++ ) {
                add += "A";
            }
            System.out.println(word + add );
			
			scan.close();
			
		}
		
	}

}

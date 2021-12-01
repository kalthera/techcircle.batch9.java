package day13_StringContinue;

import java.util.Scanner;

public class HomeWorkMiddleCharacter {

	public static void main(String[] args) {
		
//		Find the middle character of a string 
//		Write a Java program to find the middle character of a string.
//		 If the length of the string is odd there will be one middle character. 
//		 If the length of the string is even there will be 2 middle characters. 
//		 Input: abcde 
//		 output:c 
//		 intput car11car 
//		 output 11
//		
//		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Character");
		String name = scan.next();
		
	//	String name = "";
		
        int   x = name.length();
        int   x1 = name.length()/2;
//        System.out.println(name.substring(x1-1,x1+1));
       
       if (x%2==0) {
    	   System.out.println(name.substring(x1-1,x1+1));
       } else {
    	   System.out.println(name.substring(x1,x1+1));
		}   
			
		scan.close();
			
		} 
			
		
		
	}



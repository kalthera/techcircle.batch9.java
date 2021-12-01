package day13_StringContinue;

import java.util.Scanner;

public abstract class HomeWorkTwoWords {

	public static void main(String[] args) {
		/*
         * Task: 1. Ask user to enter two words. Print first word without its first
         * character then print the second word without its first character. Input:
         * apple banana Output: ppleanana
         */
		
		
//		Scanner scan1 = new Scanner(System.in);
//		System.out.println("Enter Two Word");
//		String str1 = scan1.next();
//
//		
//		 System.out.println("\n");
////		for (int i = 0; i < str1.length()-1; i++) {	
//			int space = str1.indexOf(' ');
//			
////			if(str1.charAt(i)==' ') {
////				System.out.println(i);
////			}
//			
//		System.out.println(str1.substring(1,space) + str1.substring(space+2));
//		
	 Scanner scan = new Scanner(System.in);
	        System.out.println("Enter two words ");
	        String input = scan.nextLine();
        String str1 = "";        int i;
	        for ( i = 0; i <=input.length()-1; i++) {
	        	if(input.charAt(i)== ' ') {
				System.out.println(i);
				str1 = input.substring(1,i);
			    str1 += input.substring(i+2);
			    System.out.println(str1);
			        
			      scan .close();
				}
	        	
	        
//	        int space = input.indexOf(' ');
//	        System.out.println(input.substring(1,space) + input.substring(space+2));
//		
	        	
	            
			
			
	        }
	    //    System.out.println(i);
	    //    str1 = input.substring(1,i);System.out.println(str1);
	      //  str1 += input.substring(i+2);
	    //    System.out.println(str1);
	
	
	//Another answer
	        
	        String word1 = "Apple";
	        String word2 = "Banana";
	        
	        System.out.println(word1.substring(1));
	        System.out.println(word2.substring(1));
	
	
	        String word3 = word1.substring(1).concat(word2.substring(1));
	       //or
	      //  String word4 = word1.substring(1)+word2.substring(1);
	        
	        System.out.println(word3);
	
	
	
	
	
	}}    
	        
	        
	        
	        
	        
	        
	        
	        
		
		
		
		
		
	



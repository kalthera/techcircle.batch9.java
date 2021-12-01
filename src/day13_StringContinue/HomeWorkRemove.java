package day13_StringContinue;

import java.util.Iterator;
import java.util.Scanner;

public class HomeWorkRemove {

	public static void main(String[] args) {
		
		/*
         * Write an efficient program in Java to remove all occurrences of a 
         * given character in Java. For example, 
         * 
         * if the given String is "Programming" 
         * and the given character to remove is "m" then your 
         * function should return "Prograing".
         * 
         * */ 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Word");
		String word = scan.nextLine();
		
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter Charactoers");
		String name = scan.nextLine();
		
		
		for (int i = 0; i < word.length()-1; i++) {
			
			word = word.replace(name,"");
		}
		System.out.println(word);
		}
		
//	//or
//	 String word = "Java";
//     
//     String targetChar = "a";
//     
//     String word2 = word.replace(targetChar, "");
//     
//     System.out.println(word2);
//     
//		
		
	}




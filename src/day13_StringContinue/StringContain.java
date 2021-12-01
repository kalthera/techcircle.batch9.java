package day13_StringContinue;

public class StringContain {

	public static void main(String[] args) {
 //          contain will look for string means "", cannot ues ''
//                     0123456789

		String name = "President George Washington";
	
		System.out.println(name.contains("Washington"));//true
		
		System.out.println(name.contains("washington"));//false
		
		System.out.println(name.toUpperCase());
		System.out.println("washington".toUpperCase());
		
		System.out.println(name.toUpperCase().contains("washington".toUpperCase()));
		
		String str = "Techcircle";
		System.out.println(str.contains("Tech"));
		
		System.out.println(str.contains("QA"));
		
		
		if (str.contains("Tech")) {
				str = str.toUpperCase();
		
		}
		System.out.println(str);
	
		
		if (str.indexOf("TECH")>-1) { //if you want to use indexof the result will be number
			str = str.toLowerCase();//so we have to put >-1
			
		}
		System.out.println(str);
		
		System.out.println(str.contains("s"));
		
		System.out.println(str.contains("t"));
		
		
	}

}

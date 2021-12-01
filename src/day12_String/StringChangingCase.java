package day12_String;

public class StringChangingCase {

	public static void main(String[] args) {
		
		String word = "JaVa";
		
		System.out.println(word.toLowerCase());
		
		System.out.println(word);
		
		word = word.toLowerCase();
		System.out.println(word);
		
		
		String str1 = "techcircle";
		
		String str2 = "Techcircle";
		
        boolean result = str1.equals(str2);//false
        		
       boolean result2 = str1.equals(str2.toLowerCase());
       
       System.out.println(result);
       System.out.println(result2);
	}

}

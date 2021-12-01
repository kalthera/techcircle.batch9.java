package day12_String;

public class StringTrimMethod {

	public static void main(String[] args) {
		
		String str = "Hello Java        ";
		System.out.println(str);
		System.out.println(str.length());
		
		str = str.trim();
		
		System.out.println(str.length());

		System.out.println(str);
		
		
		String str2 = "         Techcircle";
		System.out.println(str2);
		System.out.println(str2.length());
		System.out.println(str2.trim());
	    
		System.out.println(str2);//print space TechCircle because we did not assign trim yet
		
		str2 = str2.trim();
		System.out.println(str2);
		
		
		
		String str3 = "      Hello       techcircle     ";
		System.out.println(str3.length());
		System.out.println(str3.trim());
		
		str3 = str3.trim(); // trim only front and back
		System.out.println(str3.length());
		
		
		
		
	}

}

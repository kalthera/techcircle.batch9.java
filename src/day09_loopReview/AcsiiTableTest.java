package day09_loopReview;

public class AcsiiTableTest {

	public static void main(String[] args) {
		
		char variableA = 65;
		
		char variableH = 72;
		
		System.out.println(variableH);
		
		for (int i = 65; i <= 90; i++) {
			char charValue = (char) i; //force java to add char
			
			System.out.println(charValue);
			
		}
		
	//or use char	
		for (char i = 97; i <=122; i++) {
			System.out.println(i);
		}
		
    //reverse
		String str = "A1b2c3";
        
        char a = 'a';
        int valueOfa = a;
        System.out.println(valueOfa);//97
        
        char z = 'z';
        int valueOfz = z;
        System.out.println(valueOfz);//97
        
        
        for (int i = valueOfa; i <= valueOfz; i++) {
        	System.out.println((char)i);
        	System.out.println(i);
		}
        
        
        
        
	}

}

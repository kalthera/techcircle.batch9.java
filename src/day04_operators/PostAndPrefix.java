package day04_operators;

public class PostAndPrefix {

	public static void main(String[] args) {
		
		int numA = 10;
		numA++;
		System.out.println(numA); //11
		System.out.println(numA++);//11 value will add next line
		System.out.println(numA);//12
		
		
		System.out.println(numA--);//12
		
		System.out.println(numA); // 11
		
		   // prefix --> before the variable name;
		
		int a = 10;
		
		++a;
		
		System.out.println(a);//11
		
		System.out.println(++a);//12
		
		System.out.println(--a);//11
		
		System.out.println(a);//11
		
		System.out.println(a--);//11
		
		System.out.println(a);//10
		
		// prefix = same line
		// post fix = next line
		
		
	}

}

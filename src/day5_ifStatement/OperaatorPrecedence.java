package day5_ifStatement;

public class OperaatorPrecedence {

	public static void main(String[] args) {
		
		int a = 10 + 3 - 5;
		
		System.out.println(a);//8
		
		int b = 10 + 3 * 5;
		
		System.out.println(b);//25 if there is * or / , Java will calculate * or / first
		
		int c = 10 - 20 * (3-5);//50
		System.out.println(c);
		
		int t = 8 + 2 + 3 + 5 - 2 - 1 - 0 + 1 * 2;
		System.out.println(t);//17
		
		
		
		
		
		
		

	}

}

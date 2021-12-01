package day11_nestTest;

public class HomworkReview {

	public static void main(String[] args) {
		//Task 4:
			//
//						Write a program that asks the user to input an integer 
//					    and then outputs the number with the digits reversed. 
//						For example, 
//						if the input is 34567, the 
//						output should be 76543.
//					
		        int num = 34567;
        int output = 76543;
        int result = 0;
        
        while (num != 0) {
            
            int remainder = num % 10;
            
            result = result * 10 + remainder;
            
            num = num / 10;
        }
        
        System.out.println(result);
        
        
        if (result == output) {
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        } 
		
	}

}

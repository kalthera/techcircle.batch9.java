package homeWork;

public class Hw1_Time {

	public static void main(String[] args) {
		
	//	1,Write a Java Program using if statement. 
    //    Note: Create a variable time as int and assign value between 0 to 24.
    //    And print below messages: 
     //       if time is between 5 to 12 print good morning.
    //        if time is between 12 to 17 print good Afternoon.
    //        if time is between 17 to 5 print good Evening.

		int time = 18;
		
		
		if (time >= 5 && time <= 12) {
			
			System.out.println("good Morning");
		}
		
		else if (time >= 12 && time <= 17) {
		
		   System.out.println("good Afternoon");
		   
		   
		} else { 
		
		System.out.println("good Evening");
		
		
		} 
	}

}

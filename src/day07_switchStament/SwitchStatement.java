package day07_switchStament;

public class SwitchStatement {

	public static void main(String[] args) {
		
		int day = 2;
		
		switch (day) {
		
		case 1:
			
		   System.out.println("Monday");
	       break;
	       
		case 2:
			System.out.println("Tuesday");
			break;
		
		case 3:
			System.out.println("Wednesday");
			break;
			
		case 4:
			System.out.println("Thursdau");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Saturday");
			break;
			
		case 7:
			System.out.println("Sunday");
			break;
			
		default:
			System.out.println("Invalid Input");
			
		
		
		
		}
		
		
		String name = "Monday";
		
		switch (name) {
		case "Monday":
			System.out.println(1);
			break;
         
			case "Tuesday":
				System.out.println(2);
				break;	
			
			
		default:
			System.out.println("Invalid Input");
			break;
		}
				
		
		

	}

}

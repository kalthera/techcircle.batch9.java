package homeWork;

public class Hw5_NumberOfDaysInMonth {

	public static void main(String[] args) {
//		
//		5, rite a program that can find the number of days in a month
//	 	(Assume that Feb has 28 days)
//	 		Ex:
//	 			month = 2
//	 			output:
//	 				28 days
// 				month = 9
// 				output:
// 					30 days
//		28 days: 2
//		30 days: 4, 6, 9, 11
//		31 days: 1, 3, 5, 7,8,10, 12

		int month = 2;
		
		if (month == 2){
			System.out.println("28 days");
			
		}
				
		else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("30 days");
		}
		
		else {
			System.out.println("31 days");
		}
		
	}

}

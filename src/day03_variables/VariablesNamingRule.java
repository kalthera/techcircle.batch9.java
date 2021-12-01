package day03_variables;

public class VariablesNamingRule {

	public static void main(String[] args) {
		
		//Variable must start with $ or _ or alphabet letter lower case
		
		//DataType variableName = value;
		
		String salary;
		String $alary;
		String _salary;
		
		//No space on variablesName
		//No special character inside variablesName
		//Need to be different variablesName in the same class
		
		
		int a1;
		//java is case sensitive
		int speed = 60;
		int SPEED = 60;
		int Speed = 35;
		
		System.out.println(speed);
		
		speed = 55;
		
		System.out.println(speed);

		final int DAYS_IN_WEEK = 7;
		System.out.println(DAYS_IN_WEEK);
		
		//DAYS_IN WEEK = 17; 
		//put final in front of int so that valiables cannot be change
		//use meaningful name
		
		
		
		
		
		
		
		
		
	}

}

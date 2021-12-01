package day03_variables;

public class PrimitiveDataTypeWholeNumbers {

	public static void main(String[] args) {
		
		//byte, short, int, long
		
		
		byte day = 7;
		
		byte month = 8;
		
		short page = 254;
		
		int distance = 268;
		
		long phoneNumber = 703_459_1234L;
		
	    long phoneNumber2 = 7034591234L;
	    
	    System.out.println(phoneNumber);
	    
	    System.out.println(phoneNumber2);
	    
	    System.out.println(Byte.MIN_VALUE);
	    System.out.println(Byte.MAX_VALUE);
	    
	    //or you can do
	    
	    byte page3 = (byte)254;
	    // force java to do byte but it will print different value
	    
	    System.out.println(page3);
	    
	   int phone2 = (int)7031231234L; 
	   System.out.println(phone2);
	    
	   //converting
	   
	   byte valueA = 50;
	   
	   short valueB = valueA;
	   
	   long valueC = valueB;
	   
	   System.out.println(valueB);
	   
	   System.out.println(valueC);
	   
	   
	   long valueL = 30;
	   
	   int valueI = (int)valueL;
	   
	   System.out.println(valueI);
	   
	   
	   float taxRate = 0.3F;
	   
	   double price = 9.99;
	   
	   double balance = 100.35;
	  
	   
	   int priceInt = (int)price;
	   
	   System.out.println(price);//9.99
	   System.out.println(priceInt);
	   
	   
	   System.out.println("Value of variable price is "+ price);//9.99
	   System.out.println("Value of variable priceInt is " +priceInt);
	   
	   
	   
	   String email = "k_chuinklin@yahoo.com";
	   String firstName = "kalthera";
	   String lastName = "chuinklin";
	   
	   long phoneNumber5 = 7036281658L;
	   String passWord = "t56789";
	   
	   System.out.println(email);
	   System.out.println(firstName);
	   System.out.println(lastName);
	   System.out.println(phoneNumber5);
	   System.out.println(passWord);
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		//for example byte page = 254 will give you an error
		
				
		
		

	}

}

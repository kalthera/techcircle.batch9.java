package day13_StringContinue;

public class String_SubString {

	public static void main(String[] args) {
//                     0123456789
		String word = "television";
		
		String word2 = word.substring(2,5);
		System.out.println(word2);
		
		System.out.println(word.substring(4));
		
		
		System.out.println(word.substring(4,word.length()));
		
		//write a program to find the domain name of the following emails
		
//		String email = "Irfan.tursun@techcircleSolutions.org";
		
		String email2 = "test@gmail.com";
		
		String email3 = "test@yahoo.com";
		
		String email4 = "test@outlook.com";
		
		String email5 = "test@github.com";
		
		
		System.out.println(email2.substring(5,10));        //don't want to include @, so +1
		System.out.println(email2.substring(email2.indexOf('@')+1,email2.indexOf('.')));
		System.out.println(email2.indexOf('@'));
		
		int startPosition = email2.indexOf('@')+1;
		
		int endPosition = email2.indexOf(".");
		
		System.out.println(email2.substring(startPosition,endPosition));
		
		              //0123456789
		String email = "Irfan.tursun@techcircleSolutions.org";
		
		int b = email.indexOf('@')+1;
		int c = email.indexOf('.',b);
        int lastPosition = email.lastIndexOf ('.');
		String domainName = email.substring(b,c);
		
		System.out.println(domainName);

         String domain2 = email.substring(b,lastPosition);
         System.out.println(domain2);
       
// write a  program to find first and last name of given email
         String email7 = "Shafkat.ali@techcirclesolutions.org";

         int endFirstName = email7.indexOf('.');
         int beginLastName = email7.indexOf('.')+1;
         int endLastName = email.indexOf('@')-1;

         String FirstName = email7.substring(0,endFirstName);
         String LastName = email7.substring(beginLastName,endLastName);

         System.out.println(FirstName);
         System.out.println(LastName);

         System.out.println("=================");
         String email8 = "Shafkat.ali@techcirclesolutions.org";
  //       int n1 = email8.indexOf('.');
 //        int n2 = email8.indexOf('@');
         
         String name = email8.substring(0,7);
  //       String lname = email8.substring(n1+1,n2);
         
         System.out.println("Name " + name);
  //       System.out.println("Last name "+ lname);
         
         
         
//		System.out.println(email3.substring(5,10));
//		
//		
//		System.out.println(email4.substring(5,12));
//		
//		System.out.println(email5.substring(5,11));
		
		
		
		
		
		
		
		
		
		
		
	}

}

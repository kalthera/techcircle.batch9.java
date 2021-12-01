package homeWork;

public class AccountBalance {

	public static void main(String[] args) {
		// if balance  > 1000  and account type == "saving"
		// code to calculate interest
		
		double balance = 1200;
		
		double interest = 0.4;
		
		String type = "saving";
		
		
		if (balance > 1000 && type == "saving") {
			System.out.println((balance * interest)/12);
		}else {
			System.out.println("Invalid");
		}
		
		//if cartTotal  > 100 OR memberType == Premium
		
		int cartTotal = 90;
		int shippingCost = 0;
		String memberType = "Premium";
		
		
		if (cartTotal > 100 || memberType == "Premium") {
			System.out.println("You qualify for free shipping!");
		}else {
			System.out.println("Shipping Cost $ " + shippingCost);
		}
		
	}

}

package homeWork;

public class MultipleBranches {

	public static void main(String[] args) {
		//if supermarket has full-fat milk, buy full-fat milk
		//else
		//if supermarket has 2% milk,buy 2% milk
		//else buy skimmed milk

		
		boolean wholeMilk = false;
		boolean notWholeMilk = true;
		
		if (wholeMilk == true) {
			System.out.println("Buy full-fat milk");
			
		} else {
			if (notWholeMilk == true) {
			System.out.println("Buy 2 % milk");	
			}else {
			System.out.println("Buy skimmed milk");	
		
			}
		}
		
		
		
		
	}

}

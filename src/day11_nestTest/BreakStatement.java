package day11_nestTest;

public class BreakStatement {

	public static void main(String[] args) {
		
		
		for (int j = 1 ; j < 6 ; j++) {
            for (int i = 1 ; i < 11; i++) {
                
                System.out.print(i+" ");
                
                if (i == 5) {
                    break;
                }
                
            }
            
            System.out.println();
        }
        
		}
	}



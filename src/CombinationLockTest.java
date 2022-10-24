import java.util.Scanner;

public class CombinationLockTest {

	public static void main(String[] args) {
		
		
		
		CombinationLock myLock = new CombinationLock("11-22-33");
		
		//menu
		int choice = 0;
		
		while (choice != 6) {
			printMenu();
			
			System.out.print("Enter Choice: ");
			choice = getChoice();
		
			System.out.println();
			
			switch (choice) {
			case 1:
				if (myLock.isLocked()) System.out.println("Lock is closed."); 
				else System.out.println("Lock is open."); 
				break; 
				
			case 2: 
				myLock.open(); 
				break; 
			
			case 3: 
				myLock.close(); 
				System.out.println("Lock is Closed"); 
				break; 
				
			case 5: 
				myLock.setCombination(); 
				break; 
				
			case 4: 
				System.out.println(myLock.getCombination()); 
				break; 
				
			case 6: 
				break; 
				
			default: 
				System.out.println("Not a recognized selection");
			
			}
		
		}
		
		System.out.println("\nGood Bye!");
		
	}
	
	
	
	public static int getChoice() {
		int choice = 0;
		
		Scanner inKey = new Scanner(System.in);
		String input = inKey.nextLine(); //scan whatever they put
		
		try {
			choice = Integer.valueOf(input);  //change it to an integer
		}
		catch (Exception e) {
			choice = 0; //if they didn't put in an integer
		}
		
		return choice;  //return choice
	}
	
	
		
		
	public static void printMenu() {
		System.out.println("\n Menu");
		System.out.println("--------------------------"); 
		System.out.println(" 1 - Check Lock"); 
		System.out.println(" 2 - Unlock"); 
		System.out.println(" 3 - Lock"); 
		System.out.println(" 4 - Check Combination"); 
		System.out.println(" 5 - Change Combination"); 
		System.out.println(" 6 - Quit");
	}
		
		
		
	
}

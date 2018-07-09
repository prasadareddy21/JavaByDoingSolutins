import java.util.Scanner;

class KeyChains{
	
	public static void main(String[] args){
		
		
		System.out.println("Welcome to old keychain shop");
		Scanner keyboard = new Scanner(System.in);
		int option = 0;
		
		
		while(option != 4){
			
		System.out.println("1. Add keychains to order");
		System.out.println("2. Remove Keychains from Order");
		System.out.println("3. View Current Order");
		System.out.println("4. Checkout");
		
		System.out.println("Enter your choice: ");
		option = keyboard.nextInt();
		}
	}
}



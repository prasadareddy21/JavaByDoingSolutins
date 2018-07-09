import java.util.Scanner;

class KeyChainsReal{
	
	public static void main(String[] args){
		
		
		System.out.println("Welcome to old keychain shop");
		Scanner keyboard = new Scanner(System.in);
		int option = 0;
		int numberOfKeyChains = 0;
		
		
		while(option != 4){
		
			
		System.out.println("1. Add keychains to order");
		System.out.println("2. Remove Keychains from Order");
		System.out.println("3. View Current Order");
		System.out.println("4. Checkout");
		
		System.out.println("Enter your choice: ");
		option = keyboard.nextInt();
		
		if (option == 1){
			
		} else if if (option == 2){
			System.out.println("You have "+ numberOfKeyChains+ " key chains. How many do you want to add?");
			numberOfKeyChains = numberOfKeyChains - keyboard.nextInt();
			System.out.println("you now have "+ numberOfKeyChains + " keychains");
		}
		
		}
		
		System.out.println("CHECKOUT");
		
		System.out.println("What is your name? ");
		String name = keyboard.nextLine();
		
		
	
}


	public static int add_keychains(int a){
		System.out.println("You have "+ numberOfKeyChains+ " key chains. How many do you want to add?");
			numberOfKeyChains = numberOfKeyChains + keyboard.nextInt();
			System.out.println("you now have "+ numberOfKeyChains + " keychains");
	}

}
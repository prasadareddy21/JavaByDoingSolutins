import java.util.Scanner;

public class EnterPIN
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;
		
		System.out.println("WELCOME TO THE BANK OF SIVA");
		System.out.println("Enter your pin: ");
		int entry = keyboard.nextInt();
		
		while ( entry != pin )
		{
			System.out.println("\n INCORRECT PIN. Try Again.");
			System.out.println("Enter your pin: ");
			entry = keyboard.nextInt();
		}
		
		System.out.println("\nPin Accepted. You now have access to your account.");
	}
}
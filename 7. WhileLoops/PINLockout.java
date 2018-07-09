import java.util.Scanner;

public class PINLockout
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int pin = 12345;
		int tries = 0;
		int max_tries = 4;
		
		System.out.println("Welcome To The Bank Of Siva");
		System.out.print("Enter your PIN: ");
		int entry = keyboard.nextInt();
		tries++;
		
		while ( entry != pin && tries < max_tries )
		{
			System.out.println("\n Incorrect PIN. Try Again.");
			System.out.print("Enter your PIN: ");
			entry = keyboard.nextInt();
			tries++;
		}
		
		if ( entry == pin)
			System.out.println("\n PIN ACCCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT");
		else if (tries >= max_tries)
			System.out.println("\n You have run out of Tries. Account is locked.");
	}
}
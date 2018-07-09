import java.util.Scanner;

public class CountingWhile
{
	public static void main(String[] args)
	{
		Scanner keyboard =  new Scanner(System.in);
		
		System.out.println(" Type in a message, and I will display it for number of times that you tell me.");
		System.out.print("Message: ");
		
		
		String message = keyboard.nextLine();
		System.out.println(" How many times do you want to print? ");
		int times = keyboard.nextInt();
		int counter = 0;
		while (  counter < times )
		{
			System.out.println( (10 * (counter+1)) + ". " + message);
			counter++;
		}
	}
}
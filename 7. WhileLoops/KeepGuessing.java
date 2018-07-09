import java.util.Scanner;
import java.util.Random;

public class KeepGuessing
{
		public static void main(String[] args)
		{
			Scanner keyboard = new Scanner(System.in);
			Random number = new Random();
			
			int answer, guess;
			
			answer = 1 + number.nextInt(10);
			
			System.out.println(" Take a wild guess of the number (1 - 10): ");
			guess = keyboard.nextInt();
			
			while ( guess != answer )
			{
				System.out.println ("Sorry, try another one: ");
				guess = keyboard.nextInt();
			}
			System.out.println("Congrats! You got it right!");
			
		}
}
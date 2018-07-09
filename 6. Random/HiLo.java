import java.util.Scanner;
import java.util.Random;

public class HiLo
{
	public static void main(String [] args)
	{
		Random number = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		int answer, guess;
		
		answer = 1 + number.nextInt(100);
		
		System.out.println("I am thinking of a number between 1- 100. Try to guess it.");
		guess = keyboard.nextInt();
		
		if (guess == answer){
			System.out.println ("You guessed it right! ");
			
		}else if ( guess > answer){
			System.out.println ("too high");
		}else if ( guess < answer){
			System.out.println ("too low");
		}
	}
}
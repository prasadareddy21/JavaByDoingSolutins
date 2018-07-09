import java.util.Scanner;
import java.util.Random;

public class HiLoTries
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random number = new Random();
		
		int answer = 1 + number.nextInt(100);
		int counter = 0;
		
		System.out.println("I am thinking of a number between 1-100. You have 7 guesses.");
		int guess = keyboard.nextInt();
		counter++;
		
		while ( guess != answer && counter < 7 )
		{
			if (guess < answer)
			{	System.out.println("Sorry, you are too low");
				guess = keyboard.nextInt();
		
			}else if (guess > answer)
			{
				System.out.println("Sorry, you are too high");
				guess = keyboard.nextInt();
			}
			counter++;
		}
		
		if (guess == answer){
			System.out.println("You guessed it right! What are the odds? and you used " + counter +" number of tries.");
		} else if (guess != answer && counter == 7){
			System.out.println("You did not get it in 7 times.");
		}
		
	
	}
}
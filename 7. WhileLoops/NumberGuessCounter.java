import java.util.Scanner;
import java.util.Random;

public class NumberGuessCounter
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random number = new Random();
		
		int answer = 1 + number.nextInt(10);
		int counter = 0;
		
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		int guess = keyboard.nextInt();
		counter++;
		
		
		while ( guess != answer ){
			System.out.println("That is incorrect! Try again: ");
			guess = keyboard.nextInt();
			counter++;
		}
		
		if (guess == answer){
			System.out.println(" Thats right! You are a good guesser and it took you " + counter + " tries to get it right!");
		}
		
		
	}
}
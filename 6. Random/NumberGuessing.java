import java.util.Scanner;
import java.util.Random;

public class NumberGuessing
{
	public static void main(String[] args)
	{
		Random number = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		int response, answer;
		
		answer = 1 + number.nextInt(10);
		
		System.out.println("I am thinking of a number from 1 to 10.");
		System.out.println("Enter your guess: ");
		response = keyboard.nextInt();
		
		if (response == answer){
			System.out.println("Congrats, you were right!!!");
		}else {
			System.out.println("Sorry, but I was really thinking of " + answer);
		}
		
	}
}
import java.util.Scanner;

public class WorstGuess
{
	public static void main(String[] args)
	{
		int answer = 6;
		int response;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("The worst guessing came ever!!!");
		System.out.println("I am thinking a number from 1 to 10. try to guess the number!");
		response = keyboard.nextInt();
		if (response == answer){
			System.out.println("Wow!!! You got it right!!!");
			
		}else {
			System.out.println("LOL! you got it wrong. It was " + answer);
		}	
	
	}
}
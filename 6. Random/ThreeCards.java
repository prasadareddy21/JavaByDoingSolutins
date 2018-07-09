import java.util.Scanner;
import java.util.Random;

public class ThreeCards
{
	public static void main(String [] args)
	{
		int answer, chosen;
		
		Scanner keyboard = new Scanner(System.in);
		Random guess = new Random();
		
		answer = 1 + guess.nextInt(3);
		
		System.out.println("Guess one of the following cards? 1) ## 2)## 3## :");

		chosen = keyboard.nextInt();
		
		if (chosen == answer){
			System.out.println("You chose right!!!");
			
		}else {
			System.out.println("You chose poorly");
		}
	}	
	
}
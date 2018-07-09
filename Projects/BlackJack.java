import java.util.Scanner;
import java.util.Random;

public class BlackJack
{
	public static void main(String[] args)
	{
		Random number = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		int playerCount, dealerCount, p1, p2, hit, d1, d2, stay ;
		String choice;
		
		stay = 0;
		p1 = 2 + number.nextInt(9);
		p2 = 2 + number.nextInt(9);
		d1 = 2 + number.nextInt(9);
		d2 = 2 + number.nextInt(9);
		
		playerCount = p1 + p2;
		dealerCount = d1 + d2;
		
		System.out.println("Welcome to Siva's BlackJack Program!");
		System.out.println(" You get a " + p1 + " and a " + p2 + ".");
		System.out.println("Your total is " + playerCount );
		
		System.out.println("The dealer has a " + d1 + " and a hidden card. His total is also hidden.");
		System.out.println(" Would you like to hit or stay?");
		choice = keyboard.next();
		
		while ( choice.equals("hit") ){
			hit = 2 + number.nextInt(9);
			playerCount += hit ;
			System.out.println("You drew " + hit + " and your total is " + playerCount);
			
			if (playerCount > 21)
			{
				System.out.println(" You got busted! You lost!");
				System.exit(0);
			}
			System.out.println("Would you like to hit or stay?");
			choice = keyboard.next();
		}
		
		System.out.println("Okay, its dealers turn. His hidden card was " + d2 + " and his total was " + dealerCount );
		
		while (dealerCount <= 16){
			System.out.println("Dealer chooses to hit");
			hit = 2 + number.nextInt(9);
			dealerCount += hit ;
			System.out.println(" The dealer drew " + hit + " and his total is " +dealerCount);
			
			if (dealerCount > 21)
			{
				System.out.println(" Dealer got busted! You Won!");
				System.exit(0);
			}
		}
		
		System.out.println(" Dealer stays.");
		
		System.out.println(" Dealer total is " + dealerCount + " and your total is " + playerCount);
		
		if ( playerCount > dealerCount)
		{
			System.out.println("You win");
		}else {
			System.out.println("You Lost!");
		}
	
		
		
		
		
		
	}
}
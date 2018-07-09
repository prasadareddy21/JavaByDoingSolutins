import java.util.Scanner;
import java.util.Random;

public class BabyBlackJack
{
	public static void main(String[] args)
	{
		Random number = new Random();
		
		System.out.println("Baby BlackJack");
		
		int p1, p2, d1, d2;
		
		p1 = 1 + number.nextInt(10);
		p2 = 1 + number.nextInt(10);
		d1 = 1 + number.nextInt(10);
		d2 = 1 + number.nextInt(10);
		
		System.out.println(" You drew " + p1 + " and " + p2 + " and your total is "+ (p1+ p2));
		System.out.println(" Dealer drew " + d1 + " and " + d2 + " and dealer\'s total is "+ (d1+ d2));
		
		if ( ( d1 + d2 ) > ( p1 + p2) )
		{
			System.out.println(" You lose!");
		} else if (( d1 + d2) < (p1 + p2)) 
		{
			System.out.println(" You win!");
		}else 
		{
			System.out.println(" Its Draw!");
		}
		
	}
}
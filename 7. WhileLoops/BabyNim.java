import java.util.Scanner;
import java.util.Random;

public class BabyNim
{
	public static void main(String[] args)
	{
		int deck1, deck2, deck3;
		String player1, player2, playerInPlay;
		String choice;
		int pick;
		Scanner keyboard = new Scanner(System.in);
		Random number = new Random();
		System.out.println(" Enter name of player 1: ");
		player1 = keyboard.next();
		System.out.println(" Enter name of player 2: ");
		player2 = keyboard.next();
		
		playerInPlay = player1;
		
		deck1 = 3 + number.nextInt(4);
		deck2 = 3 + number.nextInt(3);
		deck3 = 3 + number.nextInt(5);
		
	
		
		System.out.println(" A: " + deck1 + "    B: " + deck2 + "    C: " + deck3 );
		
		
		
		
		while ( deck1 >= 0 && deck2 >= 0 && deck3 >= 0 && (deck1+ deck2 + deck3 > 1))
		{
			System.out.println(playerInPlay + " choose a pile: ");
			choice = keyboard.next();
			System.out.println("How many you want to remove from pile " + choice);
			pick = keyboard.nextInt();
			if ( choice.equalsIgnoreCase("A")){
				deck1 = deck1 - pick;
				if( deck1 < 0 ){
					System.out.println("Invalid Move. Try Again");
					deck1 = deck1 + pick;
					
				}else{
					if (playerInPlay.equals(player1)){
						playerInPlay = player2;
					}else if (playerInPlay.equals(player2)){
						playerInPlay = player1;
					}
				}
				
			}else if ( choice.equalsIgnoreCase("B")){
				deck2 = deck2 - pick;
				if( deck2 < 0 ){
					System.out.println("Invalid Move. Try Again");
					deck2 = deck2 + pick;
				}else{
					if (playerInPlay.equals(player1)){
						playerInPlay = player2;
					}else if (playerInPlay.equals(player2)){
						playerInPlay = player1;
					}
				}
			}else if ( choice.equalsIgnoreCase("C")){
				deck3 = deck3 - pick;
				if( deck3 < 0 ){
					System.out.println("Invalid Move. Try Again");
					deck3 += pick;
				}else{
					if (playerInPlay.equals(player1)){
						playerInPlay = player2;
					}else if (playerInPlay.equals(player2)){
						playerInPlay = player1;
					}
				}
			}else{
				System.out.println("Error. Wrong pile chosen.. Choose again");
			
			}
			System.out.println(" A: " + deck1 + "    B: " + deck2 + "    C: " + deck3 );
			
		}
			
		if (playerInPlay.equals(player1) && ( deck1+deck2+deck3 != 0 ))
		{
				
				System.out.println("Game Over");
				System.out.println("Winner is " + player2);
				System.exit(0);
		}else if (playerInPlay.equals(player2) && ( deck1+deck2+deck3 != 0 ))
		{
				System.out.println("Game Over");
				System.out.println("Winner is " + player1);
				System.exit(0);
				
		} else if (playerInPlay.equals(player1) && ( deck1+deck2+deck3 == 0 ))
		{
				
				System.out.println("Game Over");
				System.out.println("Winner is " + player1);
				System.exit(0);
		}else if (playerInPlay.equals(player2) && ( deck1+deck2+deck3 == 0 ))
		{
				System.out.println("Game Over");
				System.out.println("Winner is " + player2);
		}		System.exit(0);
		
	}
}
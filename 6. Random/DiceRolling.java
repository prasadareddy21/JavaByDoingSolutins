import java.util.Random;

public class DiceRolling
{
	public static void main(String[] args)
	{
		int roll1, roll2;
		Random number = new Random();
		
		roll1 = 1 + number.nextInt(6);
		roll2 = 1 + number.nextInt(6);
		
		System.out.println("HERE COMES THE DICE");
		System.out.println("Roll #1 : " + roll1);
		System.out.println("Roll #2 : " + roll2);
		System.out.println("The total is " + (roll1 + roll2) + "!"); 
	}
}

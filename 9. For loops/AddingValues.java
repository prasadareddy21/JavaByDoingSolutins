import java.util.Scanner;

public class AddingValues
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Give your number: ");
		int number = keyboard.nextInt();
		int total = 0;
		
		for (int i = 1 ; i <= number ; i++)
		{
			System.out.print(i + " ");
			total += i ;
		}
		
		System.out.println("\n The sum of all the numbers is " + total);
	}
}
import java.util.Scanner;

public class AddWhileLoop
{
	public static void main(String[] args)
	{
		System.out.println("I will add the numbers that you give me till you give me a zero");
		
		Scanner keyboard = new Scanner(System.in);
		
		int sum, entry;
		sum = 0;
		
		System.out.println("Enter your number: ");
		entry = keyboard.nextInt();
		sum = sum + entry ;
		System.out.println("The total so far is " + sum);
		
		
		while (entry != 0){
			System.out.println(" Enter your next number: ");
			entry = keyboard.nextInt();
			sum = sum + entry ;
			System.out.println("The total so far is " + sum);
			
		}
		
		if (entry == 0){
			System.out.println(" The total is "+ sum);
		}
		
	}
}
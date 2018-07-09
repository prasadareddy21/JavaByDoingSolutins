import java.util.Scanner;

public class CollatzSequence
{
	public static void main(String[] args)
	{
		long number, largest_number;
		int counter = 0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the starting number: ");
		number = keyboard.nextLong();
		largest_number = number;
		
		while (number != 1 )
		{
			if (number % 2 == 0){
				number = number / 2 ;
				System.out.println(number);
				counter++;
			}else{
				number = 3 * number + 1;
				System.out.println(number);
				if (largest_number < number){
					largest_number = number;
				}
				counter++;
			}
		}
		 
		System.out.println("It was terminated at " + counter + "steps and largest number along the process is " + largest_number );
	}
}
import java.util.Scanner;

public class SafeSqRt
{
	public static void main(String[] args)
	{
		Scanner keyword = new Scanner(System.in);
		double number;
		
		System.out.println("SQUARE ROOT");
		System.out.println("Enter your number: ");
		number = keyword.nextDouble();
		 
		 while (number < 0){
			 System.out.println("You cant take the square root of a negative number, silly.");
			 System.out.print("Try Again: ");
			 number = keyword.nextDouble();
		 }
		 
		 System.out.println("The square root of " + number + " is " + Math.sqrt(number) );
		
	}	
}
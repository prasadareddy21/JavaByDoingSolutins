import java.util.Scanner;

public class CountingFor
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Type the message and I will print it for 10 times: ");
		System.out.print("Message: ");
		String message = keyboard.nextLine();
		
		for ( int n = 1 /*Initializing a local variable for loop counting */ ; n <= 10 ; n+=1 /* performs increment operation*/){
			System.out.println( 2 * n + ". " + message ); 
		}
	}
}
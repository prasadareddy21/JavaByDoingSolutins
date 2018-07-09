import java.util.Scanner;

public class TwoMore
{
	public static void main(String[] args)
	{
		String response1;
		String response2;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Two more questions baby");
		System.out.println("Think of something and I will try to guess!");
		
		System.out.println("Question1: Does it stay inside or outside or both?");
		response1 = keyboard.next();
		
		System.out.println("Question 2: Is it a living thing? say yes/ no");
		response2 = keyboard.next();
		
		if ((response1).equals("outside") && (response2).equals("yes"))
		{
			System.out.println("The answer could be bison");
		}
		if ((response1).equals("outside") && (response2).equals("no"))
		{
			System.out.println("The answer could be billboard");
		}
		if ((response1).equals("inside") && (response2).equals("yes"))
		{
			System.out.println("The answer could be houseplant");
		}
		if ((response1).equals("inside") && (response2).equals("no"))
		{
			System.out.println("The answer could be shower curtain");
		}
		if ((response1).equals("both") && (response2).equals("yes"))
		{
			System.out.println("The answer could be dog");
		}
		if ((response1).equals("both") && (response2).equals("no"))
		{
			System.out.println("The answer could be cell phone");
		}
		
		System.out.println("Thanks for playing");
	}
}
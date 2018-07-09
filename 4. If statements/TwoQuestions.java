import java.util.Scanner;

public class TwoQuestions
{
	public static void main (String [] args)
	{
		String response;
		
		System.out.println ("Two Qwestions!");
		System.out.println ("Think of an object, and I will try to guess it!");
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Question 1: Which category does it belong to? animal, vegetable or mineral?");
		response = keyboard.next();
		
		if ((response).equals("animal"))
			{	System.out.println("Question 2: Is it bigger than a bread box? say yes or no.");
				response = keyboard.next();
				if ((response).equals( "yes")){
				System.out.println(" My guess is that you are thinking of a squirrel.");
				}else if ((response).equals("no")){
				System.out.println(" My guess is that you are thinking of a mouse.");
				}else {
				System.out.println ("Error wrong choice");
			}
		} else if ((response).equals( "vegetable" )){
			System.out.println("Question 2: Is it bigger than a bread box? say yes or no.");
			response = keyboard.next();
			if ((response).equals("yes")){
				System.out.println(" My guess is that you are thinking of a watermelon.");
			}else if ((response).equals( "no")){
				System.out.println(" My guess is that you are thinking of a carrot.");
			}else {
				System.out.println ("Error wrong choice");
			}
		}else if ((response).equals("mineral")){
			System.out.println("Question 2: Is it bigger than a bread box? say yes or no.");
			response = keyboard.next();
			if ((response).equals("yes")){
				System.out.println(" My guess is that you are thinking of a Camaro.");
			}else if ((response).equals("no")){
				System.out.println(" My guess is that you are thinking of a paper-clip.");
			}else {
				System.out.println ("Error wrong choice");
			}	
		}else {
			System.out.println ("Wrong choice3453");
		}
		
		System.out.println(" I would ask if I was right but I really dont care!");
		
	}
}
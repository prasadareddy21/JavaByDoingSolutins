import java.util.Scanner;


public class AdventureGame
{
	public static void main(String [] args)
	{
		System.out.println("WELCOME TO SIVA'S TINY ADVENTURE ");
		String response;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("You are in a creepy house! Would you like to go \"upstairs\" or into the \"kitchen\"?");
		response = keyboard.next();
		
		if ((response).equals("kitchen"))
		{
			System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side there is, as you'd expect, a refrigerator.");
			System.out.println("You may open the \"refrigerator\"or look in a \"cabinet\".");
			response = keyboard.next();
			if((response).equals("refrigerator"))
			{
				System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty. Would you like to eat some of the food? (\"yes\" or \"no\")");
				response = keyboard.next();
				if((response).equals("yes"))
				{
					System.out.println(" You die of Sickness... eventually!");
				}else if ((response).equals("no"))
				{
					System.out.println(" You die of Starvation... eventually!");
				}else 
				{
					System.out.println("Wrong choice 1");
				}
			}else if ((response).equals("cabinet"))
			{
				System.out.println("Inside the cabinet you see dried fruits.  It looks pretty nasty. Would you like to eat some of the food? (\"yes\" or \"no\")");
				response = keyboard.next();
				if((response).equals("yes"))
				{
					System.out.println(" You gain strength to get out of the house ... eventually!");
				}else if ((response).equals("no"))
				{
					System.out.println(" You die of Starvation... eventually!");
				}else 
				{
					System.out.println("Wrong choice 1");
				}
			}else {
				System.out.println("Wrong choice 2");
			}
		}else if ((response).equals("upstairs"))
		{
			System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master\"bedroom\".  There is also a \"bathroom\" off the hallway.");
			System.out.println("  Where would you like to go?");
			response = keyboard.next();
			if((response).equals("bedroom"))
			{
				System.out.println("Blah blah blah(\"yes\" or \"no\")");
				response = keyboard.next();
				if((response).equals("yes"))
				{
					System.out.println(" You die of blah blah... eventually!");
				}else if ((response).equals("no"))
				{
					System.out.println(" You die of blah... eventually!");
				}else 
				{
					System.out.println("Wrong choice 1");
				}
			}else if ((response).equals("bathroom"))
			{
				System.out.println("muhaha muhahaha muhahaha? (\"yes\" or \"no\")");
				response = keyboard.next();
				if((response).equals("yes"))
				{
					System.out.println(" You gain key to get out of the house ... eventually!");
				}else if ((response).equals("no"))
				{
					System.out.println(" You die muhahaha... eventually!");
				}else 
				{
					System.out.println("Wrong choice 1");
				}
			}else {
				System.out.println("Wrong choice 2");
			}
		}else 
		{
			System.out.println(" Wrong choice 3");
		}
	
		
	}
	
}
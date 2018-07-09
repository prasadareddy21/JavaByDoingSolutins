public class WhatIf
	{
		public static void main(String[] args)
		{	int people = 20;
			int cats = 20;
			int dogs = 15;
			// if statement is used to execute statements if the case of the scenario in the parenthesis is true
			if (people < cats)
			{	System.out.println("Too many cats"); 
			}// the curly braces contain the code that needs to be executed when the parenthesis condition becomes true 
			if (people > cats)
			{	System.out.println(" Not many cats!");
			}
			if (people <dogs)
			{	System.out.println(" The world is drooled on!");
			}
			if (people > dogs)
			{	System.out.println("The world is dry");
			}
			
			dogs += 5;
			
			if ( people >= dogs)
			{	System.out.println(" People are greater than or equal to dogs");
			}
			
			if ( people <= dogs)
			{	System.out.println(" People are less than or equal to dogs");
			}
			if (people == dogs)
			{	System.out.println("People are dogs.");
			}
		}
	}
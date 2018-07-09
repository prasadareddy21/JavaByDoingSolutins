import java.util.Scanner;

public class Salary
{	public static void main(String[] args)
	{	
		Scanner stuff = new Scanner(System.in);
		String name;
		int age;
		double salary;
		
		
		System.out.println(" Hello. What is your name? ");
		
		name = stuff.next();
		
		System.out.println (" Hi, " + name + "! How old are you" );
		
		age = stuff.nextInt();
		
		System.out.println (" So you are " + age + ", eh? That's not old at all!");
		
		System.out.println( " How much do you make, " + name + "?" );
		salary = stuff.nextDouble();
		
		System.out.println ( salary + "! I hope that's per hour and not per year! LOL!");
		
		
	}

}
import java.util.Scanner;

public class OldSpec{
	public static void main(String[] args)
	{
		int age;
		String name;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println(" Hello there. Whats your name?");
		name = keyboard.next();
		
		System.out.println("Ok," + name + ", how old are you?" );
		age = keyboard.nextInt();
		
		if (age < 16){
			System.out.println("You cant drive " + name); 
		} else if ( age < 18 ) {
			System.out.println("You can drive but not vote " + name);
		} else if (age < 25 ) {
			System.out.println("You can vote but not rent a car " + name);
		}else {
			System.out.println("You can do pretty much anything legal " + name);
		} 
	}
} 
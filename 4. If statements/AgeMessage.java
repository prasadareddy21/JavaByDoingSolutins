import java.util.Scanner;

public class AgeMessage
{
	public static void main(String[] args)
	{
		Scanner keyword = new Scanner(System.in);
		String name;
		int age;
		
		System.out.println("Whats your name?");
		name =  keyword.next();
		
		System.out.println("Whats your age?");
		age = keyword.nextInt();
		
		if (age < 16)
		{
			System.out.println("Your name: " +name );
			System.out.println("Your age: " + age);
			System.out.println("You cant Drive");
		}
		if (16 <= age && age <= 17){
			System.out.println("Your name: " +name );
			System.out.println("Your age: " + age);
			System.out.println("You can drive but not vote");
		}
		if (18<= age && age <= 24){
			System.out.println("Your name: " +name );
			System.out.println("Your age: " + age);
			System.out.println("You can vote but not rent a car.");
		}
		if (25 <= age){
			System.out.println("Your name: " +name );
			System.out.println("Your age: " + age);
			System.out.println("You can pretty much do anything legal");
		}
	}
}
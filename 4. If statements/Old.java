import java.util.Scanner;

public class Old
{	public static void main(String[] args)
	{	Scanner keyword = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print(" Hey there, Whats your name? ");
		name = keyword.next();
		
		System.out.print(" Alright " + name + ". How old are you?");
		age = keyword.nextInt();
		
		if (age < 16){
		System.out.println(" You cant drive");
		}
		if (age < 18){
		System.out.println(" You cant vote");
		}
		if (age < 25){
		System.out.println(" You cant rent a car");
		}
		if (age >= 25){
		System.out.println("You can do anything thats legal");
		}
	}
}
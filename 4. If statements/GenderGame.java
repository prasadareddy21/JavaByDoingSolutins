import java.util.Scanner;

public class GenderGame
{
	public static void main(String[] args)
	{
		char gender;
		String firstName;
		String lastName;
		int age;
		char relationship;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your gender? (M or F):");
		gender = keyboard.next().trim().charAt(0);
		
		System.out.println("What is your first name?");
		firstName = keyboard.next();
		
		System.out.println("What is your last name?");
		lastName = keyboard.next();
		
		System.out.println("Enter you age:");
		age = keyboard.nextInt();
		
		if (gender == 'M' && age > 20){
			System.out.println("Then I shall call you Mr. " + lastName);
		}
		if (gender == 'M' && age < 20){
			System.out.println("Then I shall call you " + firstName + " "+ lastName);
		}
		if (gender == 'F'){
			if (age < 20){
				System.out.println(" Then I shall call you " + firstName + " " + lastName);
			}else if (age > 20){
				System.out.println(" Are you married? (Y or N)");
				relationship = keyboard.next().trim().charAt(0);
				
				if (relationship == 'Y'){
					System.out.println("I am going to call you Mrs. "+ lastName);
				}else if (relationship == 'N'){
					System.out.println("I am going to call you Ms. "+ lastName);
				}
			}
		}	
	}
}
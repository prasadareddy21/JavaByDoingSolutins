import java.util.Scanner;

public class User
{	public static void main(String[] args)
	{		
			Scanner keyboard = new Scanner(System.in);
			
			String firstName;
			String lastName;
			int grade;
			long student_id;
			String userName;
			double GPA;
			
			System.out.println(" Please enter the following, so that I can sell for profit!");
			
			System.out.print(" First Name: ");
			firstName = keyboard.next();
			
			System.out.print(" Last Name: ");
			lastName = keyboard.next();
			
			System.out.print( " Grade (9-12): ");
			grade = keyboard.nextInt();
			
			System.out.print (" Student ID: ");
			student_id = keyboard.nextLong();
			
			System.out.print (" Login: ");
			userName = keyboard.next();
			
			System.out.print (" GPA (0.0 - 4.0): ");
			GPA = keyboard.nextDouble();
			System.out.println("");
			
			System.out.println(" Your information: ");
			System.out.println(" Login: " + userName );
			System.out.println(" ID: " + student_id );
			System.out.println(" Name: " + lastName + ", " + firstName);
			System.out.println(" GPA: " + GPA);
			System.out.println(" Grade: " + grade);
			
			
			
	}
}
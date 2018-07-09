import java.util.Scanner;

public class AreaCalculator
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to area calculator applicaton");
		
		System.out.println("Choose one of the following shape ..... 1) Triangle  2) Rectangle	3) Square		4) Circle 		5) Quit");
		
		Scanner keyboard = new Scanner(System.in);
		int choice;
		
		
		
		do 
		{
			System.out.println("Which shape.... give the number : ");
		
			choice = keyboard.nextInt();
			if (choice == 1)
			{
				System.out.println(" Base : ");
				double base = keyboard.nextDouble();
				System.out.println(" Height : ");
				double height = keyboard.nextDouble();
				
				double area = (base*height)/2 ;
				System.out.println(" The area is : " + area);
			
			
			}else if  (choice == 2)
			{
				System.out.println(" Length: ");
				double length = keyboard.nextDouble();
				System.out.println(" Width : ");
				double width = keyboard.nextDouble();
				
				double area = (width*length);
				System.out.println(" The area is : " + area);
			
			
			} else if  (choice == 3)
			{
				System.out.println(" Length of side: ");
				double side = keyboard.nextDouble();
								
				double area = side * side ;
				System.out.println(" The area is : " + area);
			
			
			}else if  (choice == 4)
			{
				System.out.println(" Radius : ");
				double radius = keyboard.nextDouble();
				
				
				double area = ( Math.PI * radius * radius ) ;
				System.out.println(" The area is : " + area);
			
			}else if (choice == 5)
			{
				System.out.println ("Good Bye");
			
			}else
			{
				System.out.println("Wrong Choice ");
			}
		}while ( choice != 5 );
		
		
	}
}
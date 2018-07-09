import java.util.Scanner;

public class RightTriangle
{
	public static void main (String [] args)
	{
		int side1, side2, side3;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the three integers");
		System.out.println("Side 1: ");
		side1 = keyboard.nextInt();
		
		while (side1 <= 0){
			System.out.println("The side of a triangle must be greater than zero dummy. Try again:");
			side1 = keyboard.nextInt();
		}
		
		System.out.println("Enter the second integer: ");
		side2 = keyboard.nextInt();
		
		while (side1 > side2){
			System.out.println("the 2nd side should not be smaller than side-1. Try again: ");
			side2 = keyboard.nextInt();
		}
		System.out.println("Enter the third integer: ");
		side3 = keyboard.nextInt();
		
		while (side2 > side3){
			System.out.println("the 3rd side should not be smaller than side-2. Try again: ");
			side3 = keyboard.nextInt();
		}
		System.out.println("Your three sides are " + side1 + " " + side2 + " " + side3 );
		
		if ( ( side1 * side1 ) + ( side2 * side2 ) == ( side3 * side3 )){
			System.out.println("It is a right angle triangle");
		}else {
			System.out.println("It is not a right triangle");
		}
	}
}
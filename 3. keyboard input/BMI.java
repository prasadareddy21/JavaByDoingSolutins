import java.util.Scanner;

public class BMI
{	public static void main(String[] args)
	{	
		double BMI, height_feet, height_inches, weight_pounds, height_metre, weight_kg;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print ( " Your height ( feet only) :");
		height_feet = keyboard.nextDouble();
		
		System.out.print ( " Your height ( inches only) :");
		height_inches = keyboard.nextDouble();
		
		System.out.print (" Your weight in pounds:" );
		weight_pounds = keyboard.nextDouble();
		
		height_metre = (height_feet * 30.48 + height_inches * 2.54)/100;
		weight_kg = weight_pounds * 0.453592 ;
		
		BMI =  weight_kg / (height_metre * height_metre);
		
		System.out.println(" Your BMI is : " + BMI );
		System.out.println("Your BMI category is:");
		
		if (BMI <= 15.0){
			System.out.println(" Very severely underweight."); 
		} else if (BMI <= 16.0){
			System.out.println(" severely underweight");
		} else if (BMI <= 18.4) {
			System.out.println("underweight");
		} else if (BMI <= 24.9) {
			System.out.println("normal weight");
		} else if (BMI <= 29.9) {
			System.out.println("over weight");
		} else if (BMI <= 34.9) {
			System.out.println("moderately obese");
		} else if (BMI <= 39.9) {
			System.out.println(" severely obese");
		} else {
			System.out.println( " very severely or morbidly obese");
		}
		
		
	}
}
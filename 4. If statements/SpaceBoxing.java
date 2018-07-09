import java.util.Scanner;

public class SpaceBoxing{
	
	public static void main(String[] args)
	{
		double earthWeight;
		int planet;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println(" Hello Julio. Welcome to the weight check program.");
		
		System.out.print ("Please enter your current earth weight in pounds: ");
		
		earthWeight = keyboard.nextDouble();
		
		System.out.println (" I have information relating to the following planets.");
		System.out.println ( " 1. Venus   2. Mars   3. Jupiter   4. Saturn   5. Uranus   6. Neptune");
		System.out.println (" Please choose the number of the planet you are visiting");
		
		planet = keyboard.nextInt();
		
		if (planet == 1){
			System.out.println("Your weight would be " + 0.78 * earthWeight + " pounds on Venus.");
		}else if (planet == 2) {
			System.out.println(" Your weight would be " + 0.39 * earthWeight + " pounds on Mars.");
		}else if (planet ==3) {
			System.out.println("Your weight would be " + 2.65 * earthWeight + " pounds on Jupiter.");
		}else if (planet == 4) {
			System.out.println("Your weight would be " + 1.17 * earthWeight + " pounds on Saturn.");
		}else if (planet == 5) {
			System.out.println("Your weight would be " + 1.05 * earthWeight + " pounds on Uranus.");
		}else if (planet == 6) {
			System.out.println("Your weight would be " + 1.23 * earthWeight + " pounds on Neptune.");
		}else {
			System.out.println(" Error. Wrong choice entered");
		}
		
	}
}
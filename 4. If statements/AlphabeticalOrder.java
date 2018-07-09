import java.util.Scanner;

public class AlphabeticalOrder
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String lastName;
		System.out.println("Enter your last name: ");
		lastName = keyboard.next();
		
		
		if ("Carswell".compareTo(lastName) >= 0){
			System.out.println("You dont have to wait long");
		}else if ("Jones".compareTo(lastName) >= 0){
			System.out.println("thats not bad");
		}else if ("Smith".compareTo(lastName) >= 0){
			System.out.println("looks like a bit of a wait");
		}else if ("Young".compareTo(lastName) >= 0){
			System.out.println("its gonna take a while");
		}else if ("Young".compareTo(lastName) < 0){
			System.out.println("not going anywhere for a while?");
		}
	}
}

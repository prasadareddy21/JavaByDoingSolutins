import java.util.Scanner;

public class DisplayingSomeMultiples{
	
	public static void main(String[] args){
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Choose a number:" );
		
		int number =  keyboard.nextInt();
		
		for (int i = 1; i < 13; i++){
			
			System.out.println( number + " * " + i + " = " + i*number);
		}
		
	}
}
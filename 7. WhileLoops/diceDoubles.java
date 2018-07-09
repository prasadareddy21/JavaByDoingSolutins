import java.util.Scanner;
import java.util.Random;
public class diceDoubles{
	
	public static void main(String[] args){
	
	Random number = new Random();
	int one = 0;
	int two  = 1;
	
	while(one != two){
	one = 1 + number.nextInt(6);
	System.out.println("the first roll is "+ one);
	
	two = 1 + number.nextInt(6);
	System.out.println("the second roll is "+ two);
	
	System.out.println("the total is " + (one + two));
	};
	
	
	
}
}
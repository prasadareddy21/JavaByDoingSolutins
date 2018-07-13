import java.util.*;

public class GettingIndividualDigits{
	
	public static void main(String[] args){
		
		int digit10 = 0;
		int digit1 = 0;
		
		for (int i = 10; i <100; i++){
			
			digit10 = i / 10;
			digit1 = i % 10;
			
			System.out.println(i + ", " + digit10 + " + " + digit1 + " = " + (digit10 + digit1));
			
		}
	}
}
import java.util.*;

public class ArmstrongNumbers{
	
	public static void main(String[] args){
		
		
		for (int i =100; i< 1000; i++){
			
			int digit1 = i% 10;
			int digit10 = (i / 10) % 10;
			int digit100 = i /100;
			
			if ( Math.pow(digit1, 3) + Math.pow(digit10, 3) + Math.pow(digit100, 3) == i){
				System.out.println(i);
			}
		}
	}
}
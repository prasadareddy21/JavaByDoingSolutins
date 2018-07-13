import java.util.*;

public class NumberPuzzle1{
	
	public static void main(String[] args){
		
		for (int i = 0; i <= 60; i++){
			
			for(int j = 0; j <i; j++){
				
				if ( i-j == 14){
					System.out.print(" ("+i+","+j+") ");
				} 
			}
		}
	}
}

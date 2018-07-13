import java.util.*;

public class MultiplicationTable{
	
	public static void main(String[] args){
		
		for (int i = 0 ; i < 14 ; i++){
			
			for (int j = 0; j < 14; j++){
				
				if (i ==0 && j ==0 ){
					System.out.print("X ");
				}else if (i == 1 && j == 1){
					System.out.print(" + ");
				}else if ( j == 1){
					System.out.print(" | ");
				}else if (i == 1){
					System.out.print(" = ");
				}else if (i == 0){
				System.out.print( " "+ (j-1) + " " );
				}else if (j == 0){
					System.out.print(" " + (i-1) + " ");
				}else {
					System.out.print( " "+(i-1)*(j-1)+ " " );
				}
			}
			System.out.println("");
		}
	}
}
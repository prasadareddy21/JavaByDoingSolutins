import java.util.*;


public class NewHope{
	
	public static void main(String[] args){
		
		for (int i = 0 ; i < 45; i ++){
			int A = i;
			int B = A + 4;
			int C = (A + 2)/2;
			int D = (A + 2) * 2;
			
			if ( (A + B + C + D) == 45){
				System.out.println(A + " , "+ B + " , "+ C +  " , "+ D);
			} 
			
		} 
	}
}
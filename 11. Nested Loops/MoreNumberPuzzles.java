import java.util.*;

public class MoreNumberPuzzles{
	
	public static void main(String[] args){
		int option = 0;
		Scanner keyboard = new Scanner(System.in);
		
		do{
			System.out.println("1) Find two digit numbers <= 56 with sums of digits > 10");
			System.out.println("2) Find two digit number minus number reversed which equals sum of digits");
			System.out.println("3) Quit");
			
			option = keyboard.nextInt();
			
			if(option == 1){
				function1();
			}else if(option == 2){
				function2();
			}
		}while(option !=3);
	}
	
	private  static void function1(){
		int digit1 = 0;
		int digit10 = 0;
		for (int i =10 ; i < 56; i ++){
			digit1 = i% 10;
			digit10 = i / 10;
			if ( digit1+digit10 > 10){
			System.out.print(i+ "  " );
			}
		}
		System.out.println("");
	}
	private static void function2(){
		int digit1 = 0;
		int digit10 = 0;
		int rev = 0;
		for (int i = 10 ; i < 100; i++){
			digit1 = i % 10;
			digit10 = i / 10;
			rev = digit1 * 10 + digit10 ;
			if ( (i - rev) == (digit1 + digit10) || (rev - i) == (digit1 + digit10)){
				System.out.print( i + "   " );
			}
		}
		System.out.println("");
	}
}
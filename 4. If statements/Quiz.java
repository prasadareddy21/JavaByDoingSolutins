import java.util.Scanner;
//I am also stack using stack overflow to use some concepts like exit method and taking char as input
//It is not yet discussed in the book learn java the hard way till this chapter. I am not sure if its done ahead.
//I am just learning as I go

public class Quiz
{
	
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		
		String game;
		char c;
		int option;
		int score = 0;
		
		System.out.println("Are you ready for the quiz? Y/N : ");
		c = key.next().charAt(0);
		
		if (c == 'N')
		{
			System.exit(0);
		}else if(c == 'Y'){
			
			System.out.println(" Okay, here it comes!");
			
			System.out.println(" Q1) What is the capital of Alaska? Enter the option number");
			System.out.println(" 1) Melbourne  2) Anchorage  3) Juneau ");
			option = key.nextInt();
			if (option == 3){
				System.out.println("Thats correct! Here comes the next one..");
				score = score +1;
			} else {
				System.out.println(" Sorry, the capital of Alaska is Juneau. Here comes the next one ...");
			}
			
			System.out.println(" Q2) Can you store the value of \"cat\" in a variable type of int? Enter the option number");
			System.out.println(" 1) YES  2) NO");
			option = key.nextInt();
			if (option == 2){
				System.out.println("Thats correct! Here comes the next one..");
				score = score +1;
			} else {
				System.out.println(" Sorry, \"cat\" is a string. ints can only store numbers. Here comes the next one ...");
			}
			
			System.out.println(" Q3) What is the result of 9+6/3? Enter the option number");
			System.out.println(" 1) 5  2) 11  3) 15/3 ");
			option = key.nextInt();
			if (option == 2){
				System.out.println("Thats correct! ");
				score = score +1;
			} else {
				System.out.println(" Sorry, the correct answer is 11 (use pemdas rule).");
			}
			
			System.out.println(" Overall you got " + score + " out of 3 correct.");
			System.out.println(" Thanks for playing");
		} else {
			System.out.println (" Error. Wrong Choice!");
		}
	}
}
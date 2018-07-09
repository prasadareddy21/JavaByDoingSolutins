import java.util.Scanner;

public class LinkShorting
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the number you want to change:");
		
		int input = keyboard.nextInt();
		
		char[] x = { '0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f','g','h','i','j','a','k','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		String last = "" ;
		while ( input > 62)
		{
			last = last + x[input%62];
			input = input/62 ;
		}
		
		System.out.println(last);
		
	}
}
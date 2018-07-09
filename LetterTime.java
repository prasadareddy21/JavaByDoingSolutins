import java.util.Scanner;

public class LetterTime
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your message? ");
		String message = keyboard.nextLine();
		int numberAs = 0;
		
		System.out.println("Your message is " + message.length() + " characters long.");
		System.out.println("The first character is at postion 0 and is '" + message.charAt(0) + "'.");
		int lastChar =  message.length() - 1;
		System.out.println("The last character is at position " + lastChar + " and is '" + message.charAt(lastChar) + "'.");
		System.out.println("Here are all the characters, one at a time:");
		
		for (int i = 0; i < message.length() ; i++)// Array index out of bounds exception occurs for first question.
		{
			System.out.println(i + " - '" + message.charAt(i) + "'");
			
			char alphabet = message.charAt(i);
			
			if (alphabet == 'a' || alphabet == 'A' || alphabet == 'e'  || alphabet == 'E' || alphabet == 'i' || alphabet == 'I' || alphabet == 'o' || alphabet == 'O' || alphabet == 'u' || alphabet == 'U')
			{
				numberAs++ ;
			}
		}
		
		System.out.println("Your message contains the vowel letters " + numberAs + " times. Isn't that interesting?");
	}
}
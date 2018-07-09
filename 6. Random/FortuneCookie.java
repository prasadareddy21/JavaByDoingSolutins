import java.util.Random;

public class FortuneCookie
{
	public static void main (String[] args)
	{
		Random number = new Random();

		
		int cookieNumber, number1, number2, number3, number4, number5, number6;
		
		cookieNumber = 1 + number.nextInt(6);
		number1 = 1 + number.nextInt(54);
		number2 = 1 + number.nextInt(54);
		number3 = 1 + number.nextInt(54);
		number4 = 1 + number.nextInt(54);
		number5 = 1 + number.nextInt(54);
		number6 = 1 + number.nextInt(54);
		
		if (cookieNumber == 1){
			System.out.println("Stick with your wife!!!");
		}else if (cookieNumber == 2){
			System.out.println("You will be happy!!!");
		}else if (cookieNumber == 3){
			System.out.println("Satisfaction is yours!!!");
		}else if (cookieNumber == 4){
			System.out.println("Cryptic is the new epic!!!");
		}else if (cookieNumber == 5){
			System.out.println("Building is your happiness!!!");
		}else if (cookieNumber == 6){
			System.out.println("Time is on your side!!!");
		}
		System.out.println(number1 + " - " + number2 + " - " + number3 + " - " + number4 + " - " + number5 + " - " + number6);
	}
}
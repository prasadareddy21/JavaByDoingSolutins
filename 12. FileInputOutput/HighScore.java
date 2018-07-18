import java.io.*;
import java.lang.*;
import java.util.*;

public class HighScore{
	
	public static void main(String[] args) throws FileNotFoundException{
		Scanner keyboard = new Scanner(System.in);
		Formatter f = new Formatter("HighScores.txt");
		System.out.println("You got High Sore");
		
		
		String name = "";
		double score = 0;
		
		System.out.println("Enter your name: ");
		name = keyboard.next();
		System.out.println("Enter your Score: ");
		score = keyboard.nextDouble();
		String scoreString = Double.toString(score);
		
		try{
			f.format(name);
			f.format(scoreString);
			System.out.println("Data Stored into score.txt");
		}catch(Exception e){
			System.out.println("Something went wrong");
		}finally{
			keyboard.close();
			f.close();
		}
		
		
	}
}
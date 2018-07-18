import java.util.*;
import java.io.*;
import java.lang.*;

public class LetterRevisited{
	public static void main(String[] args) throws FileNotFoundException{
		
		Formatter f;
		f = new Formatter("letter.txt");
		try{
			
			System.out.println("You created a file");
			f.format("+--------------------------------------------------+");
			f.format("|                                           ####   |");
			f.format("|                                           ####   |");
			f.format("|                                           ####   |");
			f.format("|                                                  |");
			f.format("|                                                  |");
			f.format("|                                 Siva Prasad      |");
			f.format("|                                 116 Talisman Ave |");
			f.format("|                                 Vancouver, BC    |");
			f.format("|                                 Canada           |");
			f.format("|                                                  |");
			f.format("+--------------------------------------------------+");
		
			f.close();
			
		}catch (Exception e){
			System.out.println("You got an error");
			f.close();
		}
		
	}

}
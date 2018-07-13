import java.util.Scanner;

public class OdometerLoops
{
	public static void main( String[] args ) throws Exception
	{
		
		Scanner number = new Scanner(System.in);
		System.out.println("What base do you want (2-10):");
		int key = number.nextInt();
		
		for ( int thous=0; thous<key; thous++ )
		
			for ( int hund=0; hund<key; hund++ )
			
				for ( int tens=0; tens<key; tens++ )
				
					for ( int ones=0; ones<key; ones++ )
					{
						System.out.print( " " + thous + "" + hund + "" + tens + "" + ones + "\r" );
						Thread.sleep(50);
					}//it still works even if we remove the braces
				
			
		

		System.out.println();
	}
}

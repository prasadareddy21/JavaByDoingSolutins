public class NestingLoops
{
	public static void main( String[] args )
	{
		// this is #1 - I'll call it "CN"
		for ( int n=1; n <= 3; n++ )
		{
			
			for ( char c='A'; c <= 'E'; c++ )
			{
				System.out.println( c + " " + n );
			}//n changes faster.
			//by changng order, the oder in which things are printed change.
		}

		System.out.println("\n");

		// this is #2 - I'll call it "AB"
		for ( int a=1; a <= 3; a++ )
		{
			for ( int b=1; b <= 3; b++ )
			{
				System.out.print( a + "-" + b + " " );// if changed to println, every inner loop print will go to next line
			}
			// * You will add a line of code here.
			//System.out.println(""); when this is added, every outer loop iteration is stated in next line
			
		}

		System.out.println("\n");

	}
}

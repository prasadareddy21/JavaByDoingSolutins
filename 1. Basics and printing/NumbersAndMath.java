public class NumbersAndMath
{
	public static void main( String[] args )
	{
	\\prints the statemet
		System.out.println( "I will now count my chickens:" );
	\\does the arithematic operation for hens
		System.out.println( "Hens " + ( 25f + 30f / 6f ) );
	\\does the arithematic operation for hens
		System.out.println( "Roosters " + ( 100f - 25f * 3f % 4f ) );
	\\prints the statement below
		System.out.println( "Now I will count the eggs:" );
	\\does the arithematic considering the numbers after the decimal point

		System.out.println( 3f + 2f + 1f - 5f + 4f % 2f - 1f / 4f + 6f );
	\\prints true
		System.out.println( "Is it true that 3 + 2 < 5 - 7?" );
	\\prints false
		System.out.println( 3 + 2 < 5 - 7 );

		System.out.println( "What is 3 + 2? " + ( 3 + 2 ) );
		System.out.println( "What is 5 - 7? " + ( 5 - 7 ) );

		System.out.println( "Oh, that's why it's false." );

		System.out.println( "How about some more." );

		System.out.println( "Is it greater? " + ( 5 > -2 ) );
		System.out.println( "Is it greater or equal? " + ( 5 >= -2 ) );
		System.out.println( "Is it less or equal? " + ( 5 <= -2 ) );
}
}
public class XandY
{
	public static void main(String[] args)
	{
		for (double x = -10; x <= 10 ; x += 0.5)
		{
			double y = x * x;
			
			System.out.println ( x + "    " + y );
		}
	}
}
public class StarImage
{
	public static void main(String[] args)
	{
		for (int i= 7;  i >= -7;  i-- )
		{	
			for ( int j = -7; j <= 7 ; j++ )
			{
				if(((i * i) + (j * j)) <= 49)
				{
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println("");
		}
	}
}
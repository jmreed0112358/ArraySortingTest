package utilities;

public class ArrayPrint
{

	public ArrayPrint( )
	{
	}
	
	public void Print( int[] array )
	{
		System.out.print( "[" );
		
		for ( int i = 0 ; i < array.length ; ++i )
		{
			if ( i == array.length - 1 )
			{
				System.out.print( array[i] );
			}
			else
			{
				System.out.print( array[i] + ", " );
			}
		}
		
		System.out.print( "]" );
	}

}

package utilities;

import execptions.InvalidRangeException;

public class ArrayPrint
{

	public ArrayPrint( )
	{
	}

	public void Print( int[] array )
	{
		System.out.print( "[" );

		for( int i = 0 ; i < array.length ; ++i )
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

	/**
	 * Prints a range of an given int[] array. Inclusive range.
	 * 
	 * @param array
	 *            The full array.
	 * @param start
	 *            Starting index (0 indexed)
	 * @param end
	 *            Ending index (0 indexed)
	 */
	public void PrintRange( int[] array, int start, int end )
			throws InvalidRangeException
	{
		//System.out.println( "start: " + start );
		//System.out.println( "end:   " + end );
		//this.Print( array );
		//System.out.println( " " );

		// Error checks.
		if ( start < 0 || end >= array.length || end < start )
		{
			throw new InvalidRangeException( );
		}
		else
		{
			System.out.print( "[" );

			for( int i = start ; i <= end ; ++i )
			{
				if ( i == end )
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

}

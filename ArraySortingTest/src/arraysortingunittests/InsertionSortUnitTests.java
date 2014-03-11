package arraysortingunittests;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import arraysortingtest.InsertionSort;

public class InsertionSortUnitTests
{
	@Test
	public void testSort( )
	{
		InsertionSort insertionSort = new InsertionSort( );

		int[] testArray = { 50, 1, 0, -20, 123, 3, 434, 2, 3, 4, 5, 2, 556,
				432, 4, 56 };

		try
		{
			int[] result = insertionSort.Sort( testArray );

			Assert.assertEquals( true, IsSorted( result ) );
		}
		catch( NullPointerException e )
		{
			System.out.println( "Caught an unexpected NullPointerException" );

			fail( "Caught an unexpected NullPointer Exception" );
		}
	}

	@Test
	public void testSortNullArray( )
	{
		InsertionSort insertionSort = new InsertionSort( );

		int[] testArray = null;

		try
		{
			int[] result = insertionSort.Sort( testArray );

			Assert.assertEquals( true, IsSorted( result ) );
		}
		catch( NullPointerException e )
		{
			System.out.println( "Caught an expected NullPointerException" );

			// Bullshit code.
			boolean result = true;
			Assert.assertEquals( true, result );
		}
	}

	private boolean IsSorted( int[] array ) throws NullPointerException
	{
		if ( array == null )
		{
			throw new NullPointerException();
		}

		for( int i = 0 ; i < ( array.length - 1 ) ; ++i )
		{
			if ( !( array[i] <= array[i + 1] ) )
			{
				return false;
			}
		}
		return true;
	}

}

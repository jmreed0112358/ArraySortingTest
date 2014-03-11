package arraysortingunittests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import utilities.ArrayUtilities;

import arraysortingtest.MergeSort;

public class MergeSortUnitTests
{

	@Test
	public void testSort( )
	{
		MergeSort mergeSort = new MergeSort( );

		int[] testArray = { 50, 1, 0, -20, 123, 3, 434, 2, 3, 4, 5, 2, 556,
				432, 4, 56 };

		int[] result = mergeSort.Sort( testArray );

		Assert.assertEquals( true, IsSorted( result ) );
	}

	@Test
	public void testMergeEqual( )
	{
		MergeSort mergeSort = new MergeSort( );
		ArrayUtilities arrayUtils = new ArrayUtilities( );

		int[] arrayOne = { 0, 3, 5 };
		int[] arrayTwo = { 1, 2, 4 };

		int[] expected = { 0, 1, 2, 3, 4, 5 };

		try
		{
			Assert.assertArrayEquals( expected,
					mergeSort.Merge( arrayOne, arrayTwo ) );
		}
		catch( NullPointerException e )
		{
			System.out.println( "WTF?  Caught NullPointerException, "
					+ "even though our args are not null??  "
					+ "Somewhere, someone fucked us." );
		}
	}

	@Test
	public void testMergeJaggedOne( )
	{
		MergeSort mergeSort = new MergeSort( );
		ArrayUtilities arrayUtils = new ArrayUtilities( );

		int[] arrayOne = { 0, 3, 5, 6, 7 };
		int[] arrayTwo = { 1, 2, 4 };

		int[] expected = { 0, 1, 2, 3, 4, 5, 6, 7 };

		try
		{
			Assert.assertArrayEquals( expected,
					mergeSort.Merge( arrayOne, arrayTwo ) );
		}
		catch( NullPointerException e )
		{
			System.out.println( "WTF?  Caught NullPointerException, "
					+ "even though our args are not null??  "
					+ "Somewhere, someone fucked us." );
		}

	}

	@Test
	public void testMergeJaggedTwo( )
	{
		MergeSort mergeSort = new MergeSort( );
		ArrayUtilities arrayUtils = new ArrayUtilities( );

		int[] arrayOne = { 0, 3, 5, 8, 9, 10, 11, 12 };
		int[] arrayTwo = { 1, 2, 4, 6, 7 };

		int[] expected = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

		try
		{
			Assert.assertArrayEquals( expected,
					mergeSort.Merge( arrayOne, arrayTwo ) );
		}
		catch( NullPointerException e )
		{
			System.out.println( "WTF?  Caught NullPointerException, "
					+ "even though our args are not null??  "
					+ "Somewhere, someone fucked us." );
		}

	}

	@Test
	public void testMergeArrayOneNull( )
	{
		MergeSort mergeSort = new MergeSort( );

		int[] arrayOne = null;
		int[] arrayTwo = { 0, 3, 5, 8, 9, 10, 11, 12 };

		int[] sorted;

		try
		{
			sorted = mergeSort.Merge( arrayOne, arrayTwo );
		}
		catch( NullPointerException e )
		{
			System.out.println( "Caught an expected NullPointerException!" );

			// Bullshit code.
			boolean result = true;
			Assert.assertEquals( true, result );
		}

	}

	@Test
	public void testMergeArrayTwoNull( )
	{
		MergeSort mergeSort = new MergeSort( );

		int[] arrayOne = { 0, 3, 5, 8, 9, 10, 11, 12 };
		int[] arrayTwo = null;

		int[] sorted;

		try
		{
			sorted = mergeSort.Merge( arrayOne, arrayTwo );
		}
		catch( NullPointerException e )
		{
			System.out.println( "Caught an expected NullPointerException!" );

			// Bullshit code.
			boolean result = true;
			Assert.assertEquals( true, result );
		}
	}

	@Test
	public void testMergeBothNulls( )
	{
		MergeSort mergeSort = new MergeSort( );

		int[] arrayOne = null;
		int[] arrayTwo = null;

		int[] sorted;

		try
		{
			sorted = mergeSort.Merge( arrayOne, arrayTwo );
		}
		catch( NullPointerException e )
		{
			System.out.println( "Caught an expected NullPointerException!" );

			// Bullshit code.
			boolean result = true;
			Assert.assertEquals( true, result );
		}
	}

	private boolean IsSorted( int[] array )
	{
		if ( array == null )
		{
			return false;
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

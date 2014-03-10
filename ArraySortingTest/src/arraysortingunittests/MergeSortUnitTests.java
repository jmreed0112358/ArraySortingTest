package arraysortingunittests;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import utilities.ArrayPrint;

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
		ArrayPrint arrayUtils = new ArrayPrint( );

		int[] arrayOne = { 0, 3, 5 };
		int[] arrayTwo = { 1, 2, 4 };

		int[] expected = { 0, 1, 2, 3, 4, 5 };

		System.out.print( "expected: " );
		arrayUtils.Print( expected );
		System.out.println( "" );
		
		Assert.assertEquals(
				true,
				AreArraysEqual( expected, mergeSort.Merge( arrayOne, arrayTwo ) ) );

	}
	
	@Test
	public void testMergeJaggedOne( )
	{
		MergeSort mergeSort = new MergeSort( );
		ArrayPrint arrayUtils = new ArrayPrint( );

		int[] arrayOne = { 0, 3, 5, 6, 7 };
		int[] arrayTwo = { 1, 2, 4 };

		int[] expected = { 0, 1, 2, 3, 4, 5, 6, 7 };

		System.out.print( "expected: " );
		arrayUtils.Print( expected );
		System.out.println( "" );
		
		Assert.assertEquals(
				true,
				AreArraysEqual( expected, mergeSort.Merge( arrayOne, arrayTwo ) ) );

	}
	
	@Test
	public void testMergeJaggedTwo( )
	{
		MergeSort mergeSort = new MergeSort( );
		ArrayPrint arrayUtils = new ArrayPrint( );

		int[] arrayOne = { 0, 3, 5, 8, 9, 10, 11, 12 };
		int[] arrayTwo = { 1, 2, 4, 6, 7 };

		int[] expected = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12  };

		System.out.print( "expected: " );
		arrayUtils.Print( expected );
		System.out.println( "" );
		
		Assert.assertEquals(
				true,
				AreArraysEqual( expected, mergeSort.Merge( arrayOne, arrayTwo ) ) );

	}
	
	@Test
	public void testMergeNulls( )
	{
		MergeSort mergeSort = new MergeSort( );
		ArrayPrint arrayUtils = new ArrayPrint( );

		int[] arrayOne = { 0, 3, 5, 8, 9, 10, 11, 12 };
		int[] arrayTwo = null;

		
		Assert.assertEquals(
				null,
				mergeSort.Merge( arrayOne, arrayTwo ) );
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

	private boolean AreArraysEqual( int[] arrayOne, int[] arrayTwo )
	{
		if ( arrayOne == null || arrayTwo == null )
		{
			return false;
		}

		if ( arrayOne.length != arrayTwo.length )
		{
			return false;
		}

		for( int i = 0 ; i < arrayOne.length ; ++i )
		{
			if ( arrayOne[i] != arrayTwo[i] )
			{
				return false;
			}
		}
		return true;
	}
}

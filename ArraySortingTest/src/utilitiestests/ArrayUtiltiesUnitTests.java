package utilitiestests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import utilities.ArrayUtilities;

public class ArrayUtiltiesUnitTests
{

	@Test
	public void testShiftRight( )
	{
		ArrayUtilities arrayUtils = new ArrayUtilities( );

		int[] testArray = { 0, 1, 2, 3, 4, 5 };
		int startIndex = 2;

		int[] expected = { 0, 1, 2, 2, 3, 4 };

		Assert.assertArrayEquals( expected,
				arrayUtils.ShiftRight( testArray, startIndex ) );
	}

	@Test
	public void testShiftLeft( )
	{
		ArrayUtilities arrayUtils = new ArrayUtilities( );

		int[] testArray = { 0, 1, 2, 3, 4, 5 };
		int startIndex = 2;

		int[] expected = { 1, 2, 2, 3, 4, 5 };

		Assert.assertArrayEquals( expected,
				arrayUtils.ShiftLeft( testArray, startIndex ) );
	}

	@Test
	public void TestAreArraysEqual( )
	{
		ArrayUtilities arrayUtils = new ArrayUtilities( );

		int[] testArrayOne = { 0, 1, 2, 3, 4, 5 };
		int[] testArrayTwo = { 0, 1, 2, 3, 4, 5 };

		Assert.assertEquals( true,
				arrayUtils.AreArraysEqual( testArrayOne, testArrayTwo ) );
	}

	@Test
	public void TestAreArraysEqualNotReallyEqualButSameLength( )
	{
		ArrayUtilities arrayUtils = new ArrayUtilities( );

		int[] testArrayOne = { 0, 1, 2, 3, 4, 5 };
		int[] testArrayTwo = { 0, 1, 2, 3, 4, 2 };

		Assert.assertEquals( false,
				arrayUtils.AreArraysEqual( testArrayOne, testArrayTwo ) );
	}
	
	@Test
	public void TestAreArraysEqualNotReallyEqualAndDifferentLengths( )
	{
		ArrayUtilities arrayUtils = new ArrayUtilities( );

		int[] testArrayOne = { 0, 1, 2, 3, 4, 5 };
		int[] testArrayTwo = { 0, 1, 2, 3, 4, 2, 4, 58 };

		Assert.assertEquals( false,
				arrayUtils.AreArraysEqual( testArrayOne, testArrayTwo ) );
	}
	
	@Test
	public void TestAreArraysEqualArrayOneNullReference( )
	{
		ArrayUtilities arrayUtils = new ArrayUtilities( );

		int[] testArrayOne = null;
		int[] testArrayTwo = { 0, 1, 2, 3, 4, 2, 4, 58 };
		
		try
		{
			arrayUtils.AreArraysEqual( testArrayOne, testArrayTwo );
			
			// If we didn't catch the exception, vomit.
			fail( "Didn't catch NullPointerException!" );
		}
		catch ( NullPointerException e)
		{
			System.out.println( "Caught NullPointerException" );
			
			// Bullshit code.  We caught the exception, so we're cool.
			boolean result = true;
			Assert.assertEquals( true, result );
		}
	}
	
	@Test
	public void TestAreArraysEqualArrayTwoNullReference( )
	{
		ArrayUtilities arrayUtils = new ArrayUtilities( );

		int[] testArrayOne = { 0, 1, 2, 3, 4, 2, 4, 58 };
		int[] testArrayTwo = null;
		
		try
		{
			arrayUtils.AreArraysEqual( testArrayOne, testArrayTwo );
			
			// If we didn't catch the exception, vomit.
			fail( "Didn't catch NullPointerException!" );
		}
		catch ( NullPointerException e)
		{
			System.out.println( "Caught NullPointerException" );
			
			// Bullshit code.  We caught the exception, so we're cool.
			boolean result = true;
			Assert.assertEquals( true, result );
		}
	}
	
	@Test
	public void TestAreArraysEqualTwoNullReferences( )
	{
		ArrayUtilities arrayUtils = new ArrayUtilities( );

		int[] testArrayOne = null;
		int[] testArrayTwo = null;
		
		try
		{
			arrayUtils.AreArraysEqual( testArrayOne, testArrayTwo );
			
			// If we didn't catch the exception, vomit.
			fail( "Didn't catch NullPointerException!" );
		}
		catch ( NullPointerException e)
		{
			System.out.println( "Caught NullPointerException" );
			
			// Bullshit code.  We caught the exception, so we're cool.
			boolean result = true;
			Assert.assertEquals( true, result );
		}
	}
	

}

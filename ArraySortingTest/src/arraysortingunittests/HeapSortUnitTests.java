package arraysortingunittests;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import arraysortingtest.HeapSort;

public class HeapSortUnitTests
{

	@Test
	public void testSort( )
	{
		HeapSort heapSort = new HeapSort( );

		int[] testArray = { 50, 1, 0, -20, 123, 3, 434, 2, 3, 4, 5, 2, 556,
				432, 4, 56 };

		int[] result = heapSort.Sort( testArray );

		Assert.assertEquals( true, IsSorted( result ) );
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

package arraysortingtest;

public class InsertionSort
{

	public InsertionSort( )
	{
	}

	public int[] Sort( int[] unsorted )
	{
		int[] sorted = new int[unsorted.length];

		int temp = 0;

		int insertIndex = 0;

		// Do whatever is required for insertion sort.
		for( int unsortedBaseIndex = 1 ; unsortedBaseIndex < unsorted.length ; ++unsortedBaseIndex )
		{
			temp = unsorted[unsortedBaseIndex];

			// Find insertIndex.
			for( insertIndex = 0 ; insertIndex < unsortedBaseIndex ; ++insertIndex )
			{
				if ( temp < unsorted[insertIndex] )
				{
					// Found the place to insert!
					break;
				}
			}
			
			// Check to be sure we don't have to do anything fancy.
			if ( insertIndex != unsortedBaseIndex )
			{
				for ( int j = unsortedBaseIndex - 1 ; j >= insertIndex ; --j )
				{
					unsorted[j+1] = unsorted[j];
				}
				unsorted[insertIndex] = temp;
			}
		}

		return unsorted;
	}
}

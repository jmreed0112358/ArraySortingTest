package arraysortingtest;

public class SelectionSort
{

	public SelectionSort( )
	{
	}

	public int[] Sort( int[] unsorted )
	{
		int[] sorted = new int[unsorted.length];

		int index = unsorted.length - 1;
		
		for( int i = index ; i != -1 ; --i )
		{
			// Search the array for the largest item.
			for( int j = 0 ; j <= i ; ++j )
			{
				if ( unsorted[j] >= unsorted[index] )
				{
					index = j;
				}
			}
			sorted[i] = unsorted[index];
		}
		return sorted;
	}
}

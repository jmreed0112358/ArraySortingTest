package arraysortingtest;

import execptions.InvalidRangeException;
import utilities.ArrayUtilities;

public class QuickSort {

    public QuickSort() {
    }

    public int[] Sort(int[] unsorted) throws NullPointerException {
	if (unsorted == null) {
	    throw new NullPointerException();
	}

	try {
	    if (unsorted.length != 1) {
		// Call partition
		Partition(unsorted, 0, unsorted.length - 1);
	    }
	} catch (NullPointerException e) {
	    System.out.println("Caught NullPointerException from Partition( )");

	    // Last rethrow...
	    throw e;
	}

	return unsorted;
    }

    // Naive pivot selection function.
    public int PickNaivePivot(int start, int end) {
	return start;
    }

    // Should be private, but unit tests..
    // This is an optional function to be used to select the best pivot.
    // This is an O(n) algorithm, with respect to the number of elements in the
    // array.
    public int PickBestPivot(int[] array) {
	int pivotIndex = 0;

	// Find the median.
	for (int i = 0; i < array.length; ++i) {

	}

	return pivotIndex;
    }

    // Should be private, but unit tests..
    // This is an optional function to be used to select a random pivot.
    // According to "Data Structures & other objects using C++" randomly picking
    // three pivots give you a higher chance
    // of picking a good pivot.
    public int PickRandomPivot(int[] array) {
	int[] pivotIndices = new int[3];
	int finalPivot = 0;

	for (int i = 0; i < 3; ++i) {
	    // Select a random number from 0 -> array.length - 1
	}

	return finalPivot;
    }

    // partition function.
    // This picks our pivot, and rearranges the array accordingly.
    public void Partition(int[] array, int start, int end)
	    throws NullPointerException {
	if (array == null) {
	    throw new NullPointerException();
	}

	ArrayUtilities arrayUtils = new ArrayUtilities();

	// We only do anything here, if portion we're working on is > 1 element.
	// Stopping case falls right through.
	if (start != end) {
	    // Find pivotIndex.
	    int pivotIndex = PickNaivePivot(start, end);

	    // Save pivot.
	    int pivotValue = array[pivotIndex];

	    // Initialize pointers.
	    int tooBigIndex = start + 1;
	    int tooSmallIndex = end;

	    // Run loop while our pointers haven't crossed.
	    // Rethink this loop.
	    while (tooSmallIndex > tooBigIndex) {
		int temp = 0;

		// Advance tooBigInded forward until we find a value that is too
		// big.
		while (array[tooBigIndex] < pivotValue && tooBigIndex <= end) {
		    ++tooBigIndex;
		}

		while (array[tooSmallIndex] > pivotValue
			&& tooSmallIndex >= start + 1) {
		    --tooSmallIndex;
		}

		// Did the pointers cross?
		if (tooBigIndex < tooSmallIndex) {
		    // Swap.
		    temp = array[tooBigIndex];
		    array[tooBigIndex] = array[tooSmallIndex];
		    array[tooSmallIndex] = temp;
		}
	    }

	    // At this point, tooSmallIndex should be pointing to the place
	    // where we should be inserting the pivot.

	    // Shift everything over.
	    for (int i = start + 1; i <= tooSmallIndex; ++i) {
		array[i - 1] = array[i];
	    }

	    // Finally, place the pivot. We're ready to recurse.
	    array[tooSmallIndex] = pivotValue;

	    // Recurse time!
	    // Check for degenerate cases, i.e. pivot at start/end.

	    try {
		if (tooSmallIndex == start) {
		    Partition(array, tooSmallIndex + 1, end);
		} else if (tooSmallIndex == end) {
		    Partition(array, start, tooSmallIndex - 1);
		} else {
		    Partition(array, start, tooSmallIndex - 1);
		    Partition(array, tooSmallIndex + 1, end);
		}
	    } catch (NullPointerException e) {
		System.out.println("Partition: Caught NullPointerException.");

		// Rethrow.
		throw e;
	    }
	}
    }
}

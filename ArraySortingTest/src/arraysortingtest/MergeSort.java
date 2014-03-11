package arraysortingtest;

import utilities.ArrayUtilities;

public class MergeSort {

    public MergeSort() {
    }

    public int[] Sort(int[] unsorted) {
	int[] sorted = new int[unsorted.length];

	if (unsorted.length == 1) {
	    // Stopping case.

	    return unsorted;
	} else {
	    // Recursive case.

	    // Break up array.

	    int cutPoint = unsorted.length / 2;

	    int[] chunk1 = new int[cutPoint];
	    int[] chunk2 = new int[unsorted.length - cutPoint];

	    // Call Merge( Sort(chunk1), Sort(chunk2) );
	    // Where Merge() is a function that merges the two chunks returned
	    // by
	    // the calls to Sort( ).
	    return (Merge(Sort(chunk1), Sort(chunk2)));
	}
    }

    // Should really be private, but unit tests...
    // UUGGLLYY. But unit test say this function works pretty well.
    public int[] Merge(int[] chunk1, int[] chunk2) throws NullPointerException {

	if (chunk1 == null || chunk2 == null) {
	    throw new NullPointerException();
	}

	ArrayUtilities arrayUtils = new ArrayUtilities();

	int[] mergedArray = new int[chunk1.length + chunk2.length];

	// Indices for the chunks.
	int chunk1Index = 0;
	int chunk2Index = 0;

	int test1 = 0;
	int test2 = 0;

	// For each space in the final array, pick and choose from the two
	// chunks.
	for (int index = 0; index < (mergedArray.length); ++index) {
	    // Check first index.
	    if (chunk1Index < chunk1.length && chunk2Index < chunk2.length) {
		// Both chunks are not exhausted yet.
		test1 = chunk1[chunk1Index];
	    } else if (chunk1Index < chunk1.length
		    && chunk2Index == chunk2.length) {
		// Chunk1 isn't exhausted, but chunk2 is. No need to compare.
		// We can just do a arraycopy, and be done.
		System.arraycopy(chunk1, chunk1Index, mergedArray, index,
			mergedArray.length - index);

		return (mergedArray);
	    }

	    // Check second index.
	    if (chunk2Index < chunk2.length && chunk1Index < chunk1.length) {
		// Both chunks are not exhausted.
		test2 = chunk2[chunk2Index];
	    } else if (chunk2Index < chunk2Index
		    && chunk1Index == chunk1.length) {
		// Chunk2 isn't exhausted, but chunk1 is. No need to compare.
		// arraycopy.
		System.arraycopy(chunk2, chunk2Index, mergedArray, index,
			mergedArray.length - index);

		return (mergedArray);
	    }

	    if (test1 < test2) {
		// We're moving test1.
		mergedArray[index] = test1;
		++chunk1Index;
	    } else {
		// We're moving test2.
		mergedArray[index] = test2;
		++chunk2Index;
	    }
	}

	return mergedArray;
    }
}

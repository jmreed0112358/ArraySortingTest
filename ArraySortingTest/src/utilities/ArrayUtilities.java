package utilities;

import execptions.InvalidRangeException;

public class ArrayUtilities {

    public ArrayUtilities() {
    }

    /**
     * Straightforward print of array contents to System.out.print(). Keep in
     * mind that this does not print a newline character
     * 
     * @param array
     */
    public void Print(int[] array) {
	System.out.print("[");

	for (int i = 0; i < array.length; ++i) {
	    if (i == array.length - 1) {
		System.out.print(array[i]);
	    } else {
		System.out.print(array[i] + ", ");
	    }
	}

	System.out.print("]");
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
    public void PrintRange(int[] array, int start, int end)
	    throws InvalidRangeException {
	// Error checks.
	if (start < 0 || end >= array.length || end < start) {
	    throw new InvalidRangeException();
	} else {
	    System.out.print("[");

	    for (int i = start; i <= end; ++i) {
		if (i == end) {
		    System.out.print(array[i]);
		} else {
		    System.out.print(array[i] + ", ");
		}
	    }

	    System.out.print("]");
	}
    }

    /**
     * Moves array elements to the right, starting at index start.
     * 
     * @param array
     * @param start
     */
    public int[] ShiftRight(int[] array, int start) {
	// If array.length == 1, we don't need to do anything.
	if (array.length != 1) {
	    for (int i = array.length - 2; i >= start; --i) {
		array[i + 1] = array[i];
	    }
	}

	return array;
    }

    /**
     * Moves array elements to the left, starting at index start.
     * 
     * @param array
     * @param start
     * @return
     */
    public int[] ShiftLeft(int[] array, int start) {
	// If array.length == 1, we don't need to do anything.
	if (array.length != 1) {
	    for (int i = 1; i <= start; ++i) {
		array[i - 1] = array[i];
	    }
	}

	return array;
    }

    /**
     * Equality test.
     * 
     * @param arrayOne
     * @param arrayTwo
     * @return
     */
    public boolean AreArraysEqual(int[] arrayOne, int[] arrayTwo)
	    throws NullPointerException {
	if (arrayOne == null || arrayTwo == null) {
	    throw new NullPointerException();
	}

	if (arrayOne.length != arrayTwo.length) {
	    return false;
	}

	for (int i = 0; i < arrayOne.length; ++i) {
	    if (arrayOne[i] != arrayTwo[i]) {
		return false;
	    }
	}
	return true;
    }
}

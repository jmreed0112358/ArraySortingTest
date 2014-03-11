package arraysortingunittests;

import static org.junit.Assert.*;
import org.junit.Assert;

import org.junit.Test;

import arraysortingtest.QuickSort;

public class QuickSortUnitTests {

    @Test
    public void testSort() {
	QuickSort quickSort = new QuickSort();

	int[] testArray = { 50, 1, 0, -20, 123, 3, 434, 2, 3, 4, 5, 2, 556,
		432, 4, 56 };

	try {
	    int[] result = quickSort.Sort(testArray);

	    Assert.assertEquals(true, IsSorted(result));
	} catch (NullPointerException e) {
	    System.out.println("Caught an unexpected NullPointerException!");
	    fail("Caught NullPointerException");
	}
    }

    @Test
    public void testSortNullArray() {
	QuickSort quickSort = new QuickSort();

	int[] testArray = null;

	try {
	    int[] result = quickSort.Sort(testArray);

	    fail("Didn't catch the NullPointerException");
	} catch (NullPointerException e) {
	    System.out.println("Caught an expected NullPointerException");

	    // Bullshit code.
	    boolean result = true;
	    Assert.assertEquals(true, result);
	}
    }

    private boolean IsSorted(int[] array) {
	if (array == null) {
	    return false;
	}

	for (int i = 0; i < (array.length - 1); ++i) {
	    if (!(array[i] <= array[i + 1])) {
		return false;
	    }
	}
	return true;
    }
}

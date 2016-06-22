import static org.junit.Assert.*;

import org.junit.Test;

public class InsertionSortTest {

	@Test
	public void test() {
		int[] arr = {9, 8 ,7 ,6 };
		InsertionSort.insertionSort(arr);
		assertEquals("The first is 6", 6, arr[0]);
		assertEquals("The second is 7", 7, arr[1]);
	}

}

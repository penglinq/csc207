import static org.junit.Assert.*;

import org.junit.Test;

public class BSearchTest {

	@Test
	public void test() {
		int[] arr1 = {7, 5, 3};
		assertEquals("below arr[0]", false, BSearch.bSearch(arr1, 1));
		assertEquals("above arr[last]", false, BSearch.bSearch(arr1, 9));
		assertEquals("in between but not found", false, BSearch.bSearch(arr1,4));
		assertEquals("found at start", true, BSearch.bSearch(arr1, 3));
		assertEquals("found at end", true, BSearch.bSearch(arr1, 7));
		assertEquals("found in the middle", true, BSearch.bSearch(arr1, 5));
	}

}

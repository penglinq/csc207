import static org.junit.Assert.*;

import org.junit.Test;

public class ThirdGreatestTest {

	@Test
	public void test() {
		int[] arr1 = {1};
		assertEquals("3rdmax is 1", 1, ThirdGreatest.thirdGreatest(arr1));
		int[] arr2 = {1,2};
		assertEquals("3rdmax is 1", 1, ThirdGreatest.thirdGreatest(arr2));
		int[] arr3 = {1,3,2};
		assertEquals("3rdmax is 1", 1, ThirdGreatest.thirdGreatest(arr3));
		int[] arr4 = {3, 1, 2};
		assertEquals("3rdmax is 1", 1, ThirdGreatest.thirdGreatest(arr4));
		int[] arr5 = {2,4,0,1};
		assertEquals("3rdmax is 1", 1, ThirdGreatest.thirdGreatest(arr5));
	}

}

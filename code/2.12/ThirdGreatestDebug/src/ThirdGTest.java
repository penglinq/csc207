import static org.junit.Assert.*;

import org.junit.Test;

public class ThirdGTest {

	@Test
	public void test() {
		int[] arr1 = {1};
		assertEquals("1#3rdmax is 1", 1, ThirdG.thirdGreatest(arr1));
		int[] arr2 = {1,2};
		assertEquals("2#3rdmax is 1", 1, ThirdG.thirdGreatest(arr2));
		int[] arr3 = {1,3,2};
		assertEquals("3#3rdmax is 1", 1, ThirdG.thirdGreatest(arr3));
		int[] arr4 = {3, 1, 2};
		assertEquals("4#3rdmax is 1", 1, ThirdG.thirdGreatest(arr4));
		int[] arr5 = {2,4,0,1};
		assertEquals("5#3rdmax is 1", 1, ThirdG.thirdGreatest(arr5));
	}

}

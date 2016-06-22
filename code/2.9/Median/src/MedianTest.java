import static org.junit.Assert.*;

import org.junit.Test;

public class MedianTest {

	@Test
	public void treeTest() {
		int[] arr = {1,3,8,5,2,7,4};
		Tree tr = new Tree(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			Node x = new Node(arr[i]);
			tr.insert(x);
		}
		assertEquals("first node's right has 6 under it", 6, tr.firstNode.right.numUnder);
	}
	
	@Test
	public void test() {
		int[] arr = {9, 2, 6, 1,8, 3,4, 5, 7,0};//{1,3,8,5,2,7,4};
		assertEquals("median is 4", 4, Median.median(arr));
	}
	
}


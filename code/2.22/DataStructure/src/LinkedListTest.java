import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void test() {
		int[] arr = {3, 2, 1, 0};
		LinkedList l = new LinkedList();
		for (int i = 0; i < arr.length; i++) {
			l.push(new Node(arr[i]));
		}
		assertEquals("toString", "[0, 1, 2, 3]", l.toString());
	}

}

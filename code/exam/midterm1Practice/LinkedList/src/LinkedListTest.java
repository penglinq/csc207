import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void test() {
		LinkedList<Character> l = new LinkedList<Character>();
		char[] arr = {'a', 'b', 'c', 'd', 'e', 'f'};
		for (int i = 0; i < arr.length; i++) {
			l.add(arr[i]);
		}
		l.removeEvery(2);
		assertEquals("After removal", "[a, c, e]", l.toString());
	}

}

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayListTest {

	@Test
	public void test() {
		List<Character>l = new ArrayList<Character>();
		char[] arr = {'a', 'b', 'c', 'd', 'e', 'f'};
		for (int i = 0; i < arr.length; i++) {
			l.add(arr[i]);
		}
		assertEquals("Size of the list is 6", 6,l.size());
		assertEquals("The list contains 'c'", true,l.contains('c'));
		char c =l.get(4);
		assertEquals("The fourth element is 'd'", 'd', c);
		assertEquals("The list doesn't contain 'z'", false,l.contains('z'));
		l.clear();
		assertEquals("The size becomes 0 after clearing", 0,l.size());
	}

}

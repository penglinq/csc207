import static org.junit.Assert.*;

import org.junit.Test;

public class CTreeTest {

	@Test
	public void test() {
		CTree<Character> ct = new CTree<Character>();
		char[] s = {'a', 'b', 'c', 'd', 'e', 'f'};
		for(char c: s) {
			ct.add(c);
		}
		assertEquals("size", 6, ct.size());
		assertEquals("contains c", true, ct.contains('c'));
		assertEquals("not contains g", false, ct.contains('g'));
		assertEquals("remove c", true, ct.remove('c'));
		assertEquals("toString after removal", "[e,b,f,a,d]", ct.toString());
	}

}

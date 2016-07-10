import static org.junit.Assert.*;

import org.junit.Test;

public class PriorityQueueTest {

	@Test
	public void test() {
		PriorityQueue<Character> ct = new PriorityQueue<Character>();
		char[] s = {'a', 'b', 'c', 'd', 'e', 'f'};
		for(char c: s) {
			ct.add(c);
		}
		assertEquals("size", 6, ct.size);
		assertEquals("peek", 'f', (char) ct.peek());
		ct.add('g');
		assertEquals("peek after adding g", 'g',(char) ct.peek());
		for (int i = ct.size; i > 0; i--) {
			System.out.print(ct.poll() + " ");
		}
	}
}

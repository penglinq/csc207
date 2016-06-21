import static org.junit.Assert.*;

import org.junit.Test;

public class Counter1Test {

	@Test
	public void testIncrement() {
		Counter1 c1 = new Counter1();
		assertEquals("c1.value=0", 0, c1.value);
		c1.value = 2;
		c1.increment(7);
		assertEquals("c1.value=2", 2, c1.value);
	}

}

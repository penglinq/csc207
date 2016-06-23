import static org.junit.Assert.*;

import org.junit.Test;

public class FastExpTest {

	@Test
	public void test() {
		assertEquals("exp(2,5) is 32", 32, FastExp.fastExp(2, 5));
		assertEquals("exp(3,0) is 1", 1, FastExp.fastExp(3, 0));
		
	}

}

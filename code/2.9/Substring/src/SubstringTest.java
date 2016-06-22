import static org.junit.Assert.*;

import org.junit.Test;

public class SubstringTest {

	@Test
	public void test() {
		assertEquals("first match as 2", 2, Substring.substring("01012345", "012"));
	}

}

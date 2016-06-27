import static org.junit.Assert.*;

import org.junit.Test;

public class DonationTrackerTest {

	@Test
	public void test() {
		String[] n = {"a", "b", "c"};
		int[] x = {1, 2, 3};
		DonationTracker don = new DonationTracker();
		for (int i = 0; i < n.length; i++) {
			don.add(n[i], x[i]);
		}
		assertEquals("sum is 6", 6, don.sum());
		don.printAll();
		
		
	
	}

}

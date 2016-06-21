import static org.junit.Assert.*;

import org.junit.Test;

public class Point2DTest {

	@Test
	public void testAdd() {
		Point2D p1 = new Point2D();
		Point2D p2 = p1.add(3, 5);
		assertEquals("p2.x = 3", 3, p2.x);
		assertEquals("p2.y = 5", 5, p2.y);
	}
	
	@Test
	public void testTranslate() {
		Point2D p1 = new Point2D();
		Point2D p2 = new Point2D(3, 5);
		p1.translate(p2);
		assertEquals("p1.x = 3", 3, p1.x);
		assertEquals("p1.y = 5", 5, p1.y);
	}
	
	@Test
	public void testDistance() {
		Point2D p1 = new Point2D();
		assertEquals("p2.x = 5.0", 5.0, p1.distance(3, 4), 0.001);
	}
	
	@Test 
	public void testToString() {
		Point2D p1 = new Point2D(2, 3);
		assertEquals("(2, 3)", p1.toString());
	}

}

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class MappingTest {

	@Test
	public void assocMapTest() {
		Map<String, Integer> m = new AssociationList<String, Integer>();
		m.put("dog", 5);
		assertEquals("size#1", 1, m.size());
		assertEquals("contains \"dog\"", true, m.containsKey("dog"));
		assertEquals("value of \"dog\"", 5,(int) m.get("dog"));
		m.put("doghouse", 8);
		m.put("cat", 3);
		assertEquals("size#2", 3, m.size());
		assertEquals("contains \"doghouse\"", true, m.containsKey("doghouse"));
		assertEquals("value of \"doghouse\"", 8,(int) m.get("doghouse"));
		assertEquals("contains \"cat\"", true, m.containsKey("cat"));
		assertEquals("value of \"cat\"", 3,(int) m.get("cat"));
		m.put("dog", 3);
		assertEquals("size#3", 3, m.size());
		assertEquals("value of \"dog\"", 3,(int) m.get("dog"));
		m.remove("cat");
		assertEquals("size#4", 2, m.size());
		assertEquals("not contains \"cat\"", false, m.containsKey("cat"));
		List<String> key = m.keys();
		List<Integer> value = m.values();
		assertEquals("key#1", "dog", key.get(0));
		assertEquals("key#2", "doghouse", key.get(1));
		assertEquals("value#1", 3, (int) value.get(0));
		assertEquals("value#2", 8, (int) value.get(1));
	}
	
	@Test
	public void treeMapTest() {
		Map<String, Integer> m = new TreeMap<String, Integer>();
		m.put("dog", 5);
		assertEquals("size#1", 1, m.size());
		assertEquals("contains \"dog\"", true, m.containsKey("dog"));
		assertEquals("value of \"dog\"", 5,(int) m.get("dog"));
		m.put("doghouse", 8);
		m.put("cat", 3);
		assertEquals("size#2", 3, m.size());
		assertEquals("contains \"doghouse\"", true, m.containsKey("doghouse"));
		assertEquals("value of \"doghouse\"", 8,(int) m.get("doghouse"));
		assertEquals("contains \"cat\"", true, m.containsKey("cat"));
		assertEquals("value of \"cat\"", 3,(int) m.get("cat"));
		m.put("dog", 3);
		assertEquals("size#3", 3, m.size());
		assertEquals("value of \"dog\"", 3,(int) m.get("dog"));
		m.remove("cat");
		assertEquals("size#4", 2, m.size());
		assertEquals("not contains \"cat\"", false, m.containsKey("cat"));
		List<String> key = m.keys();
		List<Integer> value = m.values();
		assertEquals("key#1", "dog", key.get(0));
		assertEquals("key#2", "doghouse", key.get(1));
		assertEquals("value#1", 3, (int) value.get(0));
		assertEquals("value#2", 8, (int) value.get(1));
	}

}

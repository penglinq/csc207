import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTreeTest {

	@Test
	public void test() {
		Integer[] arr = {1, 5, 2, 9, 6, 3, 0, 4};
		BinarySearchTree<Integer> t = new BinarySearchTree<>();
		assertEquals("initial size", 0, t.size());
		assertEquals("initial size counted by the non-recursive function", 0, t.sizeNonRec());
		for (Integer i : arr) {
			t.insert(i);
		}
		assertEquals("size after adding", 8, t.size());
		assertEquals("size after adding counted by the non-recursive function", 8, t.size());
	}
	
	@Test
	public void traversalTest() {
		Integer[] arr = {1, 5, 2, 9, 6, 3, 0, 4};
		BinarySearchTree<Integer> t = new BinarySearchTree<>();
		for (Integer i : arr) {
			t.insert(i);
		}
		t.preorderToString();
		t.inorderToString();
		t.postorderToString();
	}
	
	@Test
	public void deletionTest() {
		Integer[] arr = {1, 5, 2, 9, 6, 3, 0, 4};
		BinarySearchTree<Integer> t = new BinarySearchTree<>();
		for (Integer i : arr) {
			t.insert(i);
		}
		assertEquals("7 is not contained", false, t.remove(7));
		assertEquals("1 is contained", true, t.remove(1));
		t.inorderToString();
		assertEquals("5 is contained", true, t.remove(5));
		t.inorderToString();
		assertEquals("3 is contained", true, t.remove(3));
		t.inorderToString();
		assertEquals("4 is contained", true, t.remove(4));
		t.inorderToString();
	}

}

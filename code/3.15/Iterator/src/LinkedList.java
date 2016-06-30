
public class LinkedList<T> implements List<T> {

	Node<T> headPointer;
	
	public LinkedList() {
		headPointer = null;
	}
	
	public int size() {
		int x = 0;
		Node<T> n = headPointer;
		while (n != null) {
			x++;
			n = n.next;
		}
		return x;
	}
	
	public void add(T v) {
		Node<T> n = headPointer;
		if (headPointer == null) { headPointer = new Node<T>(v); }
		else {
			while (n.next != null) { n = n.next; }
			n.next = new Node<T>(v);
		}
		return;
	}
	
	public boolean contains(T v) {
		Node<T> n = headPointer;
		while (n != null) {
			if (n.value == v) { return true;}
			n = n.next;
		}
		return false;
	}
	
	public T get(int i){
		Node<T> n = headPointer;
		for (int j = 0; j < i - 1; j++) {
			if (n == null) { throw new IllegalArgumentException(); }
			n = n.next;
		}
		return n.value;
	}
	
	public void clear() {
		headPointer = null;
	}
	
	public String toString() {
		String s;
		if (headPointer == null) {
			s = "[]";
		} else {
			s = "[" + headPointer.value.toString();
		}
		Node<T> n = headPointer.next;
		while (n != null) {
			s = s + ", " + n.value.toString();
			n = n.next;
		}
		return s + "]";
	}
	
}


public class LinkedList<T> {
	private Node<T> first;
	
	public LinkedList() {
		first = null;
	}
	
	public void add(T v) {
		Node<T> n = first;
		if (first == null) { first = new Node<T>(v, null); }
		else {
			while (n.next != null) { n = n.next; }
			n.next = new Node<T>(v, null);
		}
		return;
	}
	
	public void removeEvery(int n) {
		int i = 0;
		Node<T> x = first;
		if (first == null) return;
		if (n == 1) first = null;
		while (x.next != null) {
			i++;
			if (i % n == n - 1) {
				if (x.next.next == null) {
					x.next = null;
					break;
				} else {
				x.next = x.next.next;
				i++;
				}
			} 
			x = x.next;
		}
		return;
	}
	
	public String toString() {
		String s;
		if (first == null) {
			s = "[]";
		} else {
			s = "[" + first.value.toString();
		}
		Node<T> n = first.next;
		while (n != null) {
			s = s + ", " + n.value.toString();
			n = n.next;
		}
		return s + "]";
	}

}

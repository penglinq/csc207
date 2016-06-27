
public class LinkedList {

	Node headPointer;
	
	public LinkedList() {
		headPointer = null;
	}
	
	public void push(Node n) {
		n.next = headPointer;
		headPointer = n;
	}
	
	public String toString() {
		String s;
		if (headPointer == null) {
			s = "[]";
		} else {
			s = "[" + Integer.toString(headPointer.value);
		}
		Node n = headPointer.next;
		while (n != null) {
			s = s + ", " + Integer.toString(n.value);
			n = n.next;
		}
		return s + "]";
	}
	
}

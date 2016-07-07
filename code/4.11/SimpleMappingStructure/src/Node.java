
public class Node<T, U> {
	public Pair<T, U> value;
	public Node<T, U> left, right;
	public Node(T t, U u) {
		value = new Pair<T, U>(t, u);
		left = null;
		right = null;
	}
	public Node(Pair<T, U> p, Node<T, U> l, Node<T, U> r) {
		value = p;
		left = l;
		right = r;
	}
}

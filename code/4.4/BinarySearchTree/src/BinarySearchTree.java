import java.util.LinkedList;

public class BinarySearchTree<T extends Comparable<T>> {
	
	public Node root;

	public class Node {
		public T value;
		public Node left, right;
		
		public Node(T v) {
			value = v;
		}
		
		public Node(T v, Node l, Node r) {
			value = v;
			left = l;
			right = r;
		}
	}
	
	public BinarySearchTree() {
		root = null;
	}
	
	public int sizeH(Node n) {
		if (n == null) { return 0;}
		else {
			return 1 + sizeH(n.left) + sizeH(n.right);
		}
	}
	
	public int size() {
		return sizeH(root);
	}
	
	public int sizeNonRec() {
		LinkedList<Node> l = new LinkedList<>();
		int size = 0;
		if (root == null) return 0;
		l.add(root);
		Node n;
		while (l.size() > 0) {
			size++;
			n = l.getFirst();
			l.removeFirst();
			if (n.left != null) l.add(n.left);
			if (n.right != null) l.add(n.right);
		}
		return size;
	}
	
	public Node insertH(T v, Node n) {
		if (n == null) { return new Node(v);}
		else {
			if (v.compareTo(n.value) < 0) n.left = insertH(v, n.left);
			else n.right = insertH(v, n.right);
			return n;
		}
	}
	
	public void insert(T v) {
		root = insertH(v, root);
	}
	

	public void preorderToString(Node n) {
		if (n == null) return;
		System.out.print(" " + n.value);
		preorderToString(n.left);
		preorderToString(n.right);
		return;
	}
	
	public void preorderToString() {
		if (root == null) return;
		System.out.print(" " + root.value);
		preorderToString(root.left);
		preorderToString(root.right);
		System.out.println();
		return;
	}
	
	public void inorderToString(Node n) {
		if (n == null) return;
		inorderToString(n.left);
		System.out.print(" " + n.value);
		inorderToString(n.right);
		return;
	}
	
	public void inorderToString() {
		if (root == null) return;
		inorderToString(root.left);
		System.out.print(" " + root.value);
		inorderToString(root.right);
		System.out.println();
		return;
	}
	
	public void postorderToString(Node n) {
		if (n == null) return;
		postorderToString(n.left);
		postorderToString(n.right);
		System.out.print(" " + n.value);
		return;
	}
	
	public void postorderToString() {
		if (root == null) return;
		postorderToString(root.left);
		postorderToString(root.right);
		System.out.print(" " + root.value);
		System.out.println();
		return;
	}
	
	public boolean remove(T v) {
		if (root == null) { return false;}
		Node current = root, parent = root;
		if (root.value == v) {
			if (root.left == null || root.right == null) {
				root = (root.left != null)? root.left : root.right;
			} else {
				current = root.right;
				while (current.left != null) {
					parent = current;
					current = current.left;
				}
				root.value = current.value;
				parent.left = current.right;
			}
		}
		else {
			boolean isLeftChild = true;
			while (current.value != v) {
				if (current.value.compareTo(v) > 0 && current.left != null) {
					parent = current;
					current = current.left;}
				else {
					if (current.value.compareTo(v) <= 0 && current.right != null) { 
						parent = current;
						current = current.right;
						isLeftChild = false; }
					else return false;
				}
			}
			if (current.left == null || current.right == null) {
				if (isLeftChild) { parent.left = (current.left != null)? current.left : current.right;}
				else { parent.right = (current.left != null)? current.left : current.right;}
			} else {
				Node current2 = current.right, parent2 = current;
				while (current2.left != null) {
					parent2 = current2;
					current2 = current2.left;
				}
				current.value = current2.value;
				parent2.left = current2.right;
			}
		}
		return true;
	}
	
	
	
	
}


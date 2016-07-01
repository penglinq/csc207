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
		Node n = root, npre = root;
		if (root.value == v) {
			if (root.left == null || root.right == null) {
				if (root.left == null) { root = root.right;}
				else { root = root.left;}
			} else {
				Node n2 = root.right, npre2 = root;
				while (n2.left != null) {
					npre2 = n2;
					n2 = n2.left;
				}
				root.value = n2.value;
				npre2.left = n2.right;
			}
		}
		else {
			while (n.value != v) {
				if (n.value.compareTo(v) > 0 && n.left != null) {
					npre = n;
					n = n.left;}
				else {
					if (n.value.compareTo(v) <= 0 && n.right != null) { 
						npre = n;
						n = n.right;}
					else return false;
				}
			}
			if (n.left == null) {
				if (n.right == null) {
					if (npre.left == n) { npre.left = null;}
					else { npre.right = null;}
				} else {
					if (npre.left == n) { npre.left = n.right;}
					else { npre.right = n.right;}
				}
			} else if (n.right == null) {
				if (npre.left == n) { npre.left = n.left;}
				else {npre.right = n.left;}
			} else {
				Node n2 = n.right, npre2 = n;
				while (n2.left != null) {
					npre2 = n2;
					n2 = n2.left;
				}
				n.value = n2.value;
				npre2.left = n2.right;
			}
		}
		return true;
	}
	
	
}


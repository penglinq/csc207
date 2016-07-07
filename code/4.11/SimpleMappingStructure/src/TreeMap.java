import java.util.*;

public class TreeMap<K extends Comparable<K>, V> implements Map<K, V> {

		public Node<K, V> root;
		
		public TreeMap() {
			root = null;
		}
		
		public TreeMap(Node<K, V> r) {
			root = r;
		}
		
		public Node<K, V> putH(K k, V v, Node<K, V> n) {
			if (n == null) { return new Node<K, V>(k, v);}
			if (n.value.fst.compareTo(k) == 0) {
				n.value.snd = v;
			} else if (n.value.fst.compareTo(k) < 0) {
				n.right = putH(k, v, n.right);
			} else {
				n.left = putH(k, v, n.left);
			}
			return n;
		}
		
		public void put(K k, V v) {
			root = putH(k, v, root);
		}
		
		public V remove(K k) {
			if (root == null) { throw new IllegalArgumentException();}
			Node<K, V> current = root, parent = root;
			if (root.value.fst.equals(k)) {
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
				return root.value.snd;
			}
			else {
				boolean isLeftChild = true;
				while (!current.value.fst.equals(k)) {
					if (current.value.fst.compareTo(k) > 0 && current.left != null) {
						parent = current;
						current = current.left;}
					else {
						if (current.value.fst.compareTo(k) <= 0 && current.right != null) { 
							parent = current;
							current = current.right;
							isLeftChild = false; }
						else throw new IllegalArgumentException();
					}
				}
				if (current.left == null || current.right == null) {
					if (isLeftChild) { parent.left = (current.left != null)? current.left : current.right;}
					else { parent.right = (current.left != null)? current.left : current.right;}
				} else {
					Node<K, V> current2 = current.right, parent2 = current;
					while (current2.left != null) {
						parent2 = current2;
						current2 = current2.left;
					}
					current.value = current2.value;
					parent2.left = current2.right;
				}
				return current.value.snd;
			}
		}
	
		public int size() {
			return sizeH(root);
		}
		
		public int sizeH(Node<K, V> node) {
			if (node == null) return 0;
			return 1 + sizeH(node.left) + sizeH(node.right);
		}
		
		public boolean containsKey(K k) {
			Node<K, V> node = root;
			while (node != null) {
				if (node.value.fst.equals(k)) return true;
				if (node.value.fst.compareTo(k) < 0) { node = node.right;}
				else { node = node.left;}
			}
			return false;
		}
		
		public V get(K k) {
			Node<K, V> node = root;
			while (node != null) {
				if (node.value.fst.equals(k)) return node.value.snd;
				if (node.value.fst.compareTo(k) < 0) { node = node.right;}
				else { node = node.left;}
			}
			throw new IllegalArgumentException();
		}
		
		public List<K> keys() {
			return keys(root);
		}
		
		public List<K> keys(Node<K, V> node) {
			if (node == null) return new LinkedList<K>();
			List<K> list = new LinkedList<K>();
			list.addAll(keys(node.left));
			list.add(node.value.fst);
			list.addAll(keys(node.right));
			return list;
		}
		
		public List<V> values() {
			return values(root);
		}
		
		public List<V> values(Node<K, V> node) {
			if (node == null) return new LinkedList<V>();
			List<V> list = new LinkedList<V>();
			list.addAll(values(node.left));
			list.add(node.value.snd);
			list.addAll(values(node.right));
			return list;
		}
}

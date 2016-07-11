
public class InternalNode implements Node {
	public Node left, right;
	public int value;
	
	public InternalNode(int value) {
		this.value = value;
		left = null;
		right = null;
	}
	
	public InternalNode(int value, Node left, Node right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}
	
	public boolean isLeaf() {
		return false;
	}
	
	public Integer compareValue() {
		return value;
	}
	
	public String toString() {
		return "[" + value + "]";
	}
}


public class LitNode implements ExpressionNode<Integer> {
	public int value;
	
	public LitNode(int v) {
		value = v;
	}
	
	public Integer evaluate() {
		return value;
	}
	
	public String toString() {
		return Integer.toString(value);
	}
}

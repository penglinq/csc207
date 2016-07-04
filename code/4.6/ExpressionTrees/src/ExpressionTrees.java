
public class ExpressionTrees<T> {

	public ExpressionNode<T> root;
	
	public ExpressionTrees() {
		root = null;
	}
	
	public ExpressionTrees(ExpressionNode<T> r) {
		root = r;
	}
	
	public T evaluate() {
		return root.evaluate();
	}
	
	public String toString() {
		return root.toString();
	}
	
	public static void main(String[] args) {
		ExpressionTrees<Boolean> t = new ExpressionTrees<Boolean>(new CompareNode(new LitNode(3), new LitNode(3)));
		System.out.println(t.toString()+"="+t.evaluate());
		return;
	}
}

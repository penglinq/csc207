
public class SubNode implements ExpressionNode<Integer> {
	public ExpressionNode<Integer> lhs, rhs;
	
	public SubNode() {
		lhs = null;
		rhs = null;
	}
	
	public SubNode(ExpressionNode<Integer> l, ExpressionNode<Integer> r) {
		lhs = l;
		rhs = r;
	}
	
	public Integer evaluate() {
		return lhs.evaluate() - rhs.evaluate();
	}
	
	public String toString() {
		return "(" + lhs.toString() + "-" + rhs.toString() + ")";
	}
}

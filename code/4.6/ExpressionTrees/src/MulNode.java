
public class MulNode implements ExpressionNode<Integer> {
	public ExpressionNode<Integer> lhs, rhs;
	
	public MulNode() {
		lhs = null;
		rhs = null;
	}
	
	public MulNode(ExpressionNode<Integer> l, ExpressionNode<Integer> r) {
		lhs = l;
		rhs = r;
	}
	
	public Integer evaluate() {
		return lhs.evaluate() * rhs.evaluate();
	}
	
	public String toString() {
		return "(" + lhs.toString() + "*" + rhs.toString() + ")";
	}
}

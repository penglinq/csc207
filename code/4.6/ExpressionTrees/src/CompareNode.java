
public class CompareNode implements ExpressionNode<Boolean> {
	
	public ExpressionNode<Integer> lhs, rhs;
	
	public CompareNode() {
		lhs = null;
		rhs = null;
	}
	
	public CompareNode(ExpressionNode<Integer> l, ExpressionNode<Integer> r) {
		lhs = l;
		rhs = r;
	}
	
	public Boolean evaluate() {
		return lhs.evaluate() <= rhs.evaluate();
	}
	
	public String toString() {
		return "(" + lhs.toString() + "<=" + rhs.toString() + ")";
	} 
}

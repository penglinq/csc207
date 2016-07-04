
public class AddNode implements ExpressionNode<Integer> {
	
	public ExpressionNode<Integer> lhs, rhs;
	
	public AddNode() {
		lhs = null;
		rhs = null;
	}
	
	public AddNode(ExpressionNode<Integer> l, ExpressionNode<Integer> r) {
		lhs = l;
		rhs = r;
	}
	
	public Integer evaluate() {
		return lhs.evaluate() + rhs.evaluate();
	}
	
	public String toString() {
		return "(" + lhs.toString() + "+" + rhs.toString() + ")";
	} 
	
}

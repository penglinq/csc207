
public class TrueFalseNode implements ExpressionNode<Boolean> {

	public boolean value;
	
	public TrueFalseNode(boolean v) {
		value = v;
	}
	
	public Boolean evaluate() {
		return value;
	}
	
	public String toString() {
		return Boolean.toString(value);
	}
}

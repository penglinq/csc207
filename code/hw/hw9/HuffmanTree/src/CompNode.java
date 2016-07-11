import java.util.Comparator;

public class CompNode implements Comparator<Node> {
	public CompNode() {
		
	}
	public int compare(Node n1, Node n2) {
		return n1.compareValue().compareTo(n2.compareValue());
	}
}

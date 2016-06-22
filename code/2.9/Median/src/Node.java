

public class Node {
		public int value, numUnder;
		public Node left, right;
		
		public Node(int x) {
			value = x; 
			numUnder = 1; //include itself
			left = null;
			right = null;
		}
	}
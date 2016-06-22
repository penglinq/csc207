

public class Tree {
		public Node firstNode;
		
		public Tree (int x){
			firstNode = new Node(x);
		}
		
		public void insert(Node x) {
			Node n = firstNode;
			while (true) {
				n.numUnder++;
				if (x.value < n.value) {
					if (n.left == null)  {
						n.left = x;
						break;
					} else {
						n = n.left;
					}
				} else {
					if (n.right == null)  {
						n.right = x;
						break;
					} else {
						n = n.right;
					}
				}
			}
			return;
		}
		
		public int kth(int k) {
			Node n = firstNode;
			int sofar = 0;
			while (true) {
				if (n.left == null) {
					if (sofar + 1 == k) {
						return n.value;
					} else {
						sofar = sofar + 1;
						n = n.right;
					}
				} else 
					if (sofar + n.left.numUnder >= k) {
						n = n.left;
					} else if (sofar + n.left.numUnder + 1 == k){
						return n.value;
					} else {
						sofar = sofar + 1 + n.left.numUnder;
						n = n.right;
					}
			}
		}
	}

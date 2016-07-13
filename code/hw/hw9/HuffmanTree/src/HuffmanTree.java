import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class HuffmanTree {

	public Node root;
	public HashMap<Integer, String> map;
	
	public HuffmanTree(Map<Short, Integer> m) {
		PriorityQueue<Node> queue = new PriorityQueue<Node>(new CompNode());
		for(Map.Entry<Short, Integer> entry: m.entrySet()) {
			queue.add(new LeafNode(entry.getKey(), entry.getValue()));
		}
		queue.add(new LeafNode((short)256, 1));
		Node n1, n2;
		while (queue.size() > 1) {
			n1 = queue.poll();
			n2 = queue.poll();
			InternalNode iNode = new InternalNode(n1.compareValue() + n2.compareValue(), n1, n2);
			queue.add(iNode);
		}
		root = queue.poll();
		this.map = new HashMap<Integer, String>();
		addToMap(root, "");
	}
	
	private void addToMap(Node n, String s) {
		if(n.isLeaf()) {
			LeafNode ln = (LeafNode) n;
			map.put((int)ln.value.fst, s);
		} else {
			InternalNode in = (InternalNode) n;
			addToMap(in.left, s.concat("0"));
			addToMap(in.right, s.concat("1"));
		}
		return;
	}
	
	public void encode(BitInputStream in, BitOutputStream out) {
		int x;
		String s;
		while (in.hasBits()) {
			 x = in.readBits(8);
			 s = map.get(x);
			 for (int i = 0; i < s.length(); i++) {
				out.writeBit(new Integer(s.substring(i, i+1)));
			 }
		}
		s = map.get(256);
		for (int i = 0; i < s.length(); i++) {
			out.writeBit(new Integer(s.substring(i, i+1)));
		}
		out.close();
		return;
	}
	
	public void decode(BitInputStream in, BitOutputStream out) {
		Node current = root;
		int x;
		while (in.hasBits()) {
			x = in.readBit();
			if (x == 0) current = ((InternalNode)current).left;
			else current = ((InternalNode)current).right;
			if (current.isLeaf()) {
				if (((LeafNode)current).value.fst != 256) {
					out.writeBits(((LeafNode)current).value.fst, 8);
				} else break;
				current = root;
			}
		}
		out.close();
	}
	
}

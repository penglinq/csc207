import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class HuffmanTreeTest {

	public void preOrder(Node n) {
		if(n.isLeaf()) System.out.print(n.toString());
		else {
			System.out.print(n.toString());
			preOrder(((InternalNode)n).left);
			preOrder(((InternalNode)n).right);
		}
		return;
	}
	@Test
	public void Test() throws IOException {
		Map<Short, Integer> m = new HashMap<Short, Integer>();
		m.put((short)97, 3);
		m.put((short)32, 2);
		m.put((short)98, 2);
		m.put((short)122, 1);
		m.put((short)10, 1);
		HuffmanTree huff = new HuffmanTree(m);
		preOrder(huff.root);
		BitInputStream in = new BitInputStream("input1.txt");
		BitOutputStream midout = new BitOutputStream("midput1.txt");
		huff.encode(in, midout);
		BitInputStream midin = new BitInputStream("midput1.txt");
		BitOutputStream out = new BitOutputStream("output1.txt");
		huff.decode(midin, out);
	}
}

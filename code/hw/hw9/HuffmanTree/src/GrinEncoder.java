import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class GrinEncoder {
	
	public static Map<Short, Integer> map;
	public static HuffmanTree huff;

	
	public static Map<Short, Integer> createFrequencyMap(String file) throws IOException {
		Map<Short, Integer> map = new HashMap<Short, Integer>();
		BitInputStream in = new BitInputStream(file);
		LetterCounter result = LetterCounter.count(in, 50);
		for (Object object: result.arr) {
			@SuppressWarnings("unchecked")
			Optional<LetterCounter.Pair<Character, Integer>> o = (Optional<LetterCounter.Pair<Character, Integer>>) object;
			if (o != null && o.isPresent()) {
				LetterCounter.Pair<Character, Integer> p = o.get();
				map.put((short)(int)p.fst, p.snd);
			}
		}
		in.close();
		return map;
	}
	
	public static void header(BitOutputStream out) {
		out.writeBits(0x736, 32);
		out.writeBits(map.size(), 32);
		for(Map.Entry<Short, Integer> entry: map.entrySet()) {
			out.writeBits(entry.getKey(), 16);
			out.writeBits(entry.getValue(), 32);
		}
	}
	
	public static void encode(String infile, String outfile) throws IOException {
		map = createFrequencyMap(infile);
		BitInputStream in = new BitInputStream(infile);
		BitOutputStream out = new BitOutputStream(outfile);
		header(out);
		huff = new HuffmanTree(map);
		preOrder(huff.root);
		huff.encode(in, out);
	}
	
	public static void preOrder(Node n) {
		if(n.isLeaf()) System.out.print(n.toString());
		else {
			System.out.print(n.toString());
			preOrder(((InternalNode)n).left);
			preOrder(((InternalNode)n).right);
		}
		return;
	}
}
//encode huffman-example.txt huffman-example-en.txt
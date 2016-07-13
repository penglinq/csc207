import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GrinDecoder {

	public static Map<Short, Integer> map;
	public static HuffmanTree huff;
	
	public static void header(BitInputStream in) {
		int magicNumber = in.readBits(32);
		if(magicNumber != 0x736) throw new IllegalArgumentException();
		int numOfCode = in.readBits(32);
		short value;
		int occurrence;
		for (int i = 0; i < numOfCode; i++) {
			value = (short) in.readBits(16);
			occurrence = in.readBits(32);
			map.put(value, occurrence);
		}
	}
	
	public static void decode(String infile, String outfile) throws IOException {
		BitInputStream in = new BitInputStream(infile);
		BitOutputStream out = new BitOutputStream(outfile);
		map = new HashMap<Short, Integer>();
		header(in);
		huff = new HuffmanTree(map);
		huff.decode(in, out);
	}
	
}

import java.io.IOException;
import java.util.Scanner;

public class Grin {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		String[] s = new String[3];
		for(int i = 0; i < 3; i++) {
			if (!in.hasNext()) throw new IllegalArgumentException();
			s[i] = in.next();
		}
		if (s[0].equals("encode")) {
			GrinEncoder.encode(s[1], s[2]);
		} else if (s[0].equals("decode")) {
			GrinDecoder.decode(s[1], s[2]);
		} else throw new IllegalArgumentException();
	}

}

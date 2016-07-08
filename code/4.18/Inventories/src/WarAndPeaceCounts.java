import java.util.*;
import java.io.*;

public class WarAndPeaceCounts {

	public static int[] count(Scanner in, int size) {
		String s;
		char c;
		int[] result = new int[size];
		while (in.hasNext()) {
			s = in.next();
			for (int i = 0; i < s.length(); i++) {
				c = s.charAt(i);
				c = Character.toUpperCase(c);
				if ((int) c > 64 && (int) c < 91)  {
					result[(int) c - 65]++;
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("WarAndPeace.txt"));
		int[] result = count(in, 26);
		for (int i = 0; i < result.length; i++) {
			System.out.println((char)(i + 65) + " " + result[i]);
		}
		return;
	}

}

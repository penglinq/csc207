import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CountChars {
	public static TreeSet<Pair<Character, Integer>> count(Scanner in) {
		String s;
		Character c;
		TreeSet<Pair<Character, Integer>> result = new TreeSet<Pair<Character, Integer>>(new Comp());
		while (in.hasNext()) {
			s = in.next();
			for (int i = 0; i < s.length(); i++) {
				c = s.charAt(i);
				Pair<Character, Integer> p = result.floor(new Pair<Character, Integer>(c,0));
				if (p != null && p.fst.equals(c)) { 
					result.remove(p);
					result.add(new Pair<Character, Integer>(c, p.snd + 1));
				} else result.add(new Pair<Character, Integer>(c, 1));
			}
		}
		return result;
	}
	
	
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("WarAndPeace.txt"));
		TreeSet<Pair<Character, Integer>> set = count(in);
		for (Pair<Character, Integer> p : set) {
			System.out.print(p.fst + " " + p.snd + " ");
		}
		System.out.println();
		return;
	}

}

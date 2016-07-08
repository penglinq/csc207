import java.util.Comparator;

public class Comp implements Comparator<Pair<Character, Integer>> {
		public Comp() {
			return;
		}
		public int compare(Pair<Character, Integer> p1, Pair<Character, Integer> p2) {
			return p1.fst.compareTo(p2.fst);
		}
		
	}
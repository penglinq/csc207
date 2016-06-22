
public class Substring {

	/* loop invariant
	 * Any substring in s that begins with a letter posited 
	 * before head is not t. --first layer of the loop
	 * The substring from position head to tail (exclusive) matches completely 
	 * with the beginning of t.  --second layer of the loop
	 */
	public static int substring(String s, String t) {
		int head = 0, tail = 0;
		if (s == null || t == null) throw new IllegalArgumentException();
		for (; head <= s.length() - t.length(); head++) {
			for (tail = head; tail < head + t.length(); tail++) {
				if (s.charAt(tail) != t.charAt(tail-head)) {
					break;
				}
			}
			if (tail == head + t.length()) return head;
		}
		return -1;
	}
	
}

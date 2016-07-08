import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class LetterCounter {
	public Object[] arr;
	public int length;
	
	public LetterCounter(int size) {
		arr = new Object[size];
		length = size;
	}
	
	public boolean hasKey(char ch) {
		int code = (int) ch % length, codeFix = code;
		while (arr[code] != null) {
			@SuppressWarnings("unchecked")
			Optional<Pair<Character, Integer>> o = (Optional<Pair<Character, Integer>>) arr[code];
			if (o.isPresent()) {
				Pair<Character, Integer> p = o.get();
				if (p.fst.equals(ch)) return true;
			}
			code++;
			if (code >= length) code-=length;
			else if (code == codeFix) break;
		}
		return false;
	}
	
	public void expandCapacity() {
		length *= 2;
		arr = Arrays.copyOf(arr, length);
		for (int i= 0; i < length / 2; i++) {
			@SuppressWarnings("unchecked")
			Optional<Pair<Character, Integer>> op = (Optional<Pair<Character, Integer>>) arr[i];
			if (op.isPresent()) {
				Pair<Character, Integer> p = op.get();
				if ((int)p.fst % length > length / 2) {
					this.put(p.fst, p.snd);
					arr[i] = Optional.empty();
				}
			}
		}
	}
	
	public void put(char ch, int v) {
		int code = (int) ch % length, codeFix = code;
		if (hasKey(ch)) {
			while (arr[code] != null) {
				@SuppressWarnings("unchecked")
				Optional<Pair<Character, Integer>> o = (Optional<Pair<Character, Integer>>) arr[code];
				if (o.isPresent()) {
					Pair<Character, Integer> p = o.get();
					if (p.fst.equals(ch)) { 
						p.snd = v;
						return;
					}
				}
				code++;
				if (code >= length) code-=length;
			}
		} else {
			while (arr[code] != null) {
				@SuppressWarnings("unchecked")
				Optional<Pair<Character, Integer>> o = (Optional<Pair<Character, Integer>>) arr[code];
				if (!o.isPresent()) {
					arr[code] = Optional.of(new Pair<Character, Integer>(ch, v));
					return;
				}
				code++;
				if (code >= length) code-=length;
				else if (code == codeFix) expandCapacity();
			}
			arr[code] = Optional.of(new Pair<Character, Integer>(ch, v));
		}
	}
	
	public int get(char ch) {
		int code = (int) ch % length, codeFix = code;
		while (arr[code] != null) {
			@SuppressWarnings("unchecked")
			Optional<Pair<Character, Integer>> o = (Optional<Pair<Character, Integer>>) arr[code];
			if (o.isPresent()) {
				Pair<Character, Integer> p = o.get();
				if (p.fst.equals(ch)) return p.snd;
			}
			code++;
			if (code >= length) code-=length;
			else if (code == codeFix) break;
		}
		throw new IllegalArgumentException();
	}
	
	public static LetterCounter count(Scanner in, int size) {
		String s;
		Character c;
		LetterCounter result = new LetterCounter(size);
		while (in.hasNext()) {
			s = in.next();
			for (int i = 0; i < s.length(); i++) {
				c = s.charAt(i);
				if (result.hasKey(c)) { result.put(c, result.get(c) + 1);}
				else { result.put(c, 1);}
			}
		}
		return result;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("Republic.txt"));
		for(int i = 0; i < 2; i++) {
			LetterCounter result = count(in, 50);
			for (Object object: result.arr) {
				@SuppressWarnings("unchecked")
				Optional<Pair<Character, Integer>> o = (Optional<Pair<Character, Integer>>) object;
				if (o != null && o.isPresent()) {
					Pair<Character, Integer> p = o.get();
					System.out.print(p.toString() + "  ");
				}
			}
			System.out.println();
			in = new Scanner(new File("WarAndPeace.txt"));
		}
		in.close();
	}

}

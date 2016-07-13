import java.util.Arrays;
import java.util.Optional;

public class LetterCounter {
	public Object[] arr;
	public int length;
	
	public class Pair<T, U> {
		public T fst;
		public U snd;
		public Pair(T fst, U snd) {
			this.fst = fst;
			this.snd = snd;
		}
	}

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
	
	public static LetterCounter count(BitInputStream in, int size) {
		Character c;
		LetterCounter result = new LetterCounter(size);
		while (in.hasBits()) {
			c = (char) in.readBits(8);
			if (result.hasKey(c)) { result.put(c, result.get(c) + 1);}
			else { result.put(c, 1);}
		}
		return result;
	}
}

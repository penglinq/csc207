
public class Pair<T, U> {
	public T fst;
	public U snd;
	public Pair(T fst, U snd) {
		this.fst = fst;
		this.snd = snd;
	}
	public T getFst() {
		return fst;
	}
	public U getSnd() {
		return snd;
	}
}

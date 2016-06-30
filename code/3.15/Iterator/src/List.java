
public interface List<T> {
	public int size();
	public void add(T v);
	boolean contains(T v);
	T get(int i);
	void clear();
}

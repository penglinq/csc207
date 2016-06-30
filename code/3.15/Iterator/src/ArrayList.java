import java.util.Arrays;
import java.util.*;

public class ArrayList<T> implements List<T>, Iterable<T> {
	
	public Object[] data;
	public int last;
	
	public ArrayList() {
		data = new Object[2];
		last = 0;
	}
	
	public int size() {
		return last;
	}
	
	public void ensureCapacity() {
		if (last >= data.length) {
			data = Arrays.copyOf(data, data.length * 2);
		}
	}
	
	public void add(T v) {
		ensureCapacity();
		data[last++] = v;
	}
	
	public boolean contains(T v) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == v) { return true;}
		}
		return false;
	}
	
	public T get(int i) {
		if (i >= data.length) { throw new IllegalArgumentException();}
		@SuppressWarnings("unchecked")
		T ret = (T) data[i-1];
		return ret;
	}
	
	public void clear() {
		last = 0;
	}
	
	public Iterator<T> iterator() {
		Iterator<T> iter = new ArrayListIterator<T>(data, last);
		return iter;
	}
	
}

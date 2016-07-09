import java.util.Arrays;

public class CTree<T> {
	public Object[] arr;
	public int size;
	
	public CTree() {
		arr = new Object[5];
		size = 0;
	}
	
	public void add(T v) {
		ensureCapacity();
		arr[size++] = v;
		return;
	}
	
	public void ensureCapacity() {
		if (arr.length == size) { arr = Arrays.copyOf(arr, arr.length * 2);}
	}
	
	public int size() {
		return size;
	}
	
	public boolean contains(T v) {
		for (int i = 0; i < size; i++) {
			if (arr[i].equals(v)) return true;
		}
		return false;
	}
	
	public boolean remove(T v) {
		for (int i = 0; i < size; i++) {
			if (arr[i].equals(v)) {
				size--;
				for (int j = i; j < size; j++) {
					arr[j] = arr[j + 1];
				}
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return "[" + toString(0).substring(1) + "]";
	}
	
	public String toString(int n) {
		if (n >= size) return "";
		return toString(n * 2 + 1) + "," + arr[n].toString() + toString(n * 2 + 2);
	}
	
}

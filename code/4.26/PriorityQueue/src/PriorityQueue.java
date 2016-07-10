import java.util.Arrays;

public class PriorityQueue<T extends Comparable<T>> {
	public Object[] arr;
	public int size;
	
	public PriorityQueue() {
		arr = new Object[5];
		size = 0;
	}
	
	@SuppressWarnings("unchecked")
	public T peek() {
		if (size == 0) return null;
		return (T) arr[0];
	}
	
	public void add(T v) {
		ensureCapacity();
		arr[size++] = v;
		siftUp(size - 1);
		return;
	}
	
	@SuppressWarnings("unchecked")
	private void siftUp(int n) {
		if (n == 0) return;
		T parent = (T) arr[(n - 1) / 2], self = (T) arr[n];
		if (parent.compareTo(self) >= 0) return;
		T temp = parent;
		arr[(n - 1) / 2] = arr[n];
		arr[n] = temp;
		siftUp((n - 1) / 2);
		return;
	}
	
	private void ensureCapacity() {
		if (arr.length == size) { arr = Arrays.copyOf(arr, arr.length * 2);}
	}

	public T poll() {
		if (size == 0) return null;
		@SuppressWarnings("unchecked")
		T oldRoot = (T) arr[0];
		arr[0] = arr[--size];
		siftDown(0);
		return oldRoot;
	}
	
	@SuppressWarnings("unchecked")
	public void siftDown(int n)	{
		if (n >= size / 2) return;
		T child1 = (T) arr[n * 2 + 1], child2 = (T) arr[n * 2 + 2];
		T self = (T) arr[n];
		if (self.compareTo(child1) > 0 && self.compareTo(child2) > 0) return;
		int x;
		if (self.compareTo(child1) <= 0 && self.compareTo(child2) <= 0) {
			x = child1.compareTo(child2) > 0 ? n * 2 + 1 : n * 2 + 2;
		} else {
			x = self.compareTo(child1) > 0 ? n * 2 + 2 : n * 2 + 1;
		}
		T temp = self;
		arr[n] = arr[x];
		arr[x] = temp;
		siftDown(x);
		return;
	}
	
}

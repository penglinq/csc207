import java.util.Iterator;

public class ArrayListIterator<T> implements Iterator<T> {
	public static int curIndex;
	public Object[] arr;
	public static int size;
	
	public ArrayListIterator(Object[] arr, int last) {
		this.arr = arr;
		curIndex = 0;
		size = last;
	}
	
	public boolean hasNext() {
		if (curIndex < size) return true;
		return false;
	}
	
	public T next() {
		@SuppressWarnings("unchecked")
		T ret = (T) arr[curIndex++];
		return ret;
	}

}

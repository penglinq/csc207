package edu.grinnell.sortingvisualizer.events;

import java.util.ArrayList;
import java.util.List;

public class SwapEvent<T extends Comparable<T>> implements SortEvent<T> {

	int index1, index2;
	
	public SwapEvent(int a, int b) {
		index1 = a;
		index2 = b;
	}
	
	public void apply(T[] arr) {
		T temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		return;
	}
	
	public List<Integer> getAffectedIndices() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(index1);
		l.add(index2);
		return l;
	}
	
	public boolean isEmphasized() {
		return true;
	}
	

}

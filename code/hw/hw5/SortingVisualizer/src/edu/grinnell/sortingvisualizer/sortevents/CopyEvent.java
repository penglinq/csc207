package edu.grinnell.sortingvisualizer.sortevents;

import java.util.ArrayList;
import java.util.List;

public class CopyEvent<T extends Comparable<T>> implements SortEvent<T> {

	int index;
	T element;
	
	public CopyEvent(T e, int a) {
		index = a;
		element = e;
	}
	
	public void apply(T[] arr) {
		arr[index] = element;
		return;
	}
	
	public List<Integer> getAffectedIndices() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(index);
		return l;
	}
	
	public boolean isEmphasized() {
		return true;
	}
	
}

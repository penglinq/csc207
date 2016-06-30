package edu.grinnell.sortingvisualizer.sortevents;

import java.util.*;

public class CompareEvent<T extends Comparable<T>> implements SortEvent<T> {

	int index1, index2;
	
	public CompareEvent(int a, int b) {
		index1 = a;
		index2 = b;
	}
	
	public void apply(T[] arr) {
		return;
	}
	
	public List<Integer> getAffectedIndices() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(index1);
		l.add(index2);
		return l;
	}
	
	public boolean isEmphasized() {
		return false;
	}
	

}

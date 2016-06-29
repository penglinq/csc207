package edu.grinnell.sortingvisualizer.sorts;
import java.util.*;

import edu.grinnell.sortingvisualizer.events.*;

public class SortsWithLog {

	public static <T extends Comparable<T>> void swap(T[] arr, int i, int j) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return;
	}
	
	public static <T extends Comparable<T>> LinkedList<SortEvent<T>> selectionSort(T[] arr) {
		int minIndex;
		LinkedList<SortEvent<T>> l = new LinkedList<SortEvent<T>>();
		for (int i = 0; i < arr.length; i++) {
			minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				l.add(new CompareEvent<T>(minIndex, j));
				if 	(arr[minIndex].compareTo(arr[j]) > 0) {
					minIndex = j;
				}
			}
			l.add(new SwapEvent<T>(i, minIndex));
			swap(arr, i, minIndex);
		}
		return l;
	}
	
	public static <T extends Comparable<T>> LinkedList<SortEvent<T>> insertionSort(T[] arr) {
		LinkedList<SortEvent<T>> l = new LinkedList<SortEvent<T>>();
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				l.add(new CompareEvent<T>(i, j));
				if (arr[i].compareTo(arr[j]) < 0) { 
					l.add(new SwapEvent<T>(i, j));
					swap(arr, i, j);}
			}
		}
		return l;
	}
	
	public static <T extends Comparable<T>> LinkedList<SortEvent<T>> bubbleSort(T[] arr) {
		boolean f;
		LinkedList<SortEvent<T>> l = new LinkedList<SortEvent<T>>();
		for (int i = 0; i < arr.length; i++) {
			f = true;
			for (int j = arr.length - 1; j > i; j--) {
				l.add(new CompareEvent<T>(i, j));
				if (arr[j].compareTo(arr[j-1]) < 0) { 
					l.add(new SwapEvent<T>(j, j-1));
					swap(arr, j, j-1);
					f = false;
				}
			}
			if (f)	break;
		}
		return l;
	}
	
	public static <T extends Comparable<T>> LinkedList<SortEvent<T>> mergeSort(T[] arr, int low, int high) {
		LinkedList<SortEvent<T>> l = new LinkedList<SortEvent<T>>();
		if (high - low < 2) return l;
		l.addAll(mergeSort(arr, low, (low + high) / 2));
		l.addAll(mergeSort(arr, (low + high) / 2, high));
		Object[] temp = new Object[high - low];
		int left = low, right = (low + high) / 2, front = 0;
		while ((left != (low + high) / 2) && (right != high)) {
			l.add(new CompareEvent<T>(left, right));
			if (arr[left].compareTo(arr[right]) > 0) {
				//l.add(new CopyEvent<T>(arr[right], front));
				temp[front++] = arr[right++];
			} else { temp[front++] = arr[left++]; }
		}
		if (left != (low + high) / 2) {
			for (int i = left; i < (low + high) / 2; i++) {
				//l.add(new CopyEvent<T>(arr[i], front));
				temp[front++] = arr[i];
			}
		} else if (right != high) {
			for (int i = right; i < high; i++) {
				//l.add(new CopyEvent<T>(arr[i], front));
				temp[front++] = arr[i];
			}
		}
		for (int i = 0; i < high - low; i++) {
			@SuppressWarnings("unchecked")
			T k = (T) temp[i];
			l.add(new CopyEvent<T>(k, i + low));
			arr[i + low] = k;
		}
		return l;
	}
	
	public static <T extends Comparable<T>> LinkedList<SortEvent<T>> quickSort(T[] arr, int low, int high) {
		LinkedList<SortEvent<T>> l = new LinkedList<SortEvent<T>>();
		if (high - low < 2) return l;
		int key1 = low, key2 = high - 1, key3 = (low + high) / 2, key;
		if (arr[key1].compareTo(arr[key2]) * arr[key3].compareTo(arr[key1]) >= 0) {
			key = key1;
			l.add(new CompareEvent<T>(key1, key2));
			l.add(new CompareEvent<T>(key3, key1));
		} else if (arr[key2].compareTo(arr[key1]) * arr[key2].compareTo(arr[key3]) >= 0) {
			key = key2;
			l.add(new CompareEvent<T>(key1, key2));
			l.add(new CompareEvent<T>(key3, key1));
			l.add(new CompareEvent<T>(key2, key1));
			l.add(new CompareEvent<T>(key2, key3));
		} else { 
			key = key3; 
			l.add(new CompareEvent<T>(key1, key2));
			l.add(new CompareEvent<T>(key3, key1));
			l.add(new CompareEvent<T>(key2, key1));
			l.add(new CompareEvent<T>(key2, key3));
		}
		T keyValue = arr[key];
		l.add(new SwapEvent<T>(key, high - 1));
		swap(arr, key, high - 1);
		int left = low, right = high - 2;
		while (true) {
			while (left < high - 1 && arr[left].compareTo(keyValue) <= 0) {
				l.add(new CompareEvent<T>(left, high - 1));
				left++;
			}
			if (left < high - 1) { l.add(new CompareEvent<T>(left, high - 1)); }
			while (left < right && arr[right].compareTo(keyValue) > 0) {
				l.add(new CompareEvent<T>(right, high - 1));
				right--;
			}
			if (left < right) { l.add(new CompareEvent<T>(right, high - 1)); }
			if (left < right) { 
				l.add(new SwapEvent<T>(key, high - 1));
				swap(arr, left, right);
			} else { 
				l.add(new SwapEvent<T>(key, high - 1));
				swap(arr, left, high - 1); 
				break;
			}
		}
		l.addAll(quickSort(arr, low, left));
		l.addAll(quickSort(arr, left + 1, high));
		return l;
	}
	
}

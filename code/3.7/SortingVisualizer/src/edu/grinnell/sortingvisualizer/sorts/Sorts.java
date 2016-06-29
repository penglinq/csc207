package edu.grinnell.sortingvisualizer.sorts;
import java.util.Arrays;

public class Sorts {

	public static <T extends Comparable<T>> void swap(T[] arr, int i, int j) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return;
	}
	
	public static <T extends Comparable<T>> void selectionSort(T[] arr) {
		int minIndex;
		for (int i = 0; i < arr.length; i++) {
			minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if 	(arr[minIndex].compareTo(arr[j]) > 0) {
					minIndex = j;
				}
			}
			swap(arr, i, minIndex);
		}
		return;
	}
	
	public static <T extends Comparable<T>> void insertionSort(T[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i].compareTo(arr[j]) < 0) { swap(arr, i, j);}
			}
		}
		return;
	}
	
	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
		boolean f;
		for (int i = 0; i < arr.length; i++) {
			f = true;
			for (int j = arr.length - 1; j > i; j--) {
				if (arr[j].compareTo(arr[j-1]) < 0) { 
					swap(arr, j, j-1);
					f = false;
				}
			}
			if (f)	break;
		}
		return;
	}
	
	public static <T extends Comparable<T>> void mergeSort(T[] arr, int low, int high) {
		if (high - low < 2) return;
		mergeSort(arr, low, (low + high) / 2);
		mergeSort(arr, (low + high) / 2, high);
		Object[] temp = new Object[high - low];
		int left = low, right = (low + high) / 2, front = 0;
		while ((left != (low + high) / 2) && (right != high)) {
			if (arr[left].compareTo(arr[right]) > 0) {
				temp[front++] = arr[right++];
			} else { temp[front++] = arr[left++]; }
		}
		if (left != (low + high) / 2) {
			for (int i = left; i < (low + high) / 2; i++) {
				temp[front++] = arr[i];
			}
		} else if (right != high) {
			for (int i = right; i < high; i++) {
				temp[front++] = arr[i];
			}
		}
		for (int i = 0; i < high - low; i++) {
			@SuppressWarnings("unchecked")
			T k = (T) temp[i];
			arr[i + low] = k;
		}
		return;
	}
	
	public static <T extends Comparable<T>> void quickSort(T[] arr, int low, int high) {
		if (high - low < 2) return;
		int key1 = low, key2 = high - 1, key3 = (low + high) / 2, key;
		if (arr[key1].compareTo(arr[key2]) * arr[key3].compareTo(arr[key1]) >= 0) {
			key = key1;
		} else if (arr[key2].compareTo(arr[key1]) * arr[key2].compareTo(arr[key3]) >= 0) {
			key = key2;
		} else { key = key3; }
		T keyValue = arr[key];
		swap(arr, key, high - 1);
		int left = low, right = high - 2;
		while (true) {
			while (left < high - 1 && arr[left].compareTo(keyValue) <= 0) left++;
			while (left < right && arr[right].compareTo(keyValue) > 0) right--;
			if (left < right) { swap(arr, left, right);}
			else { swap(arr, left, high - 1); break;}
		}
		quickSort(arr, low, left);
		quickSort(arr, left + 1, high);
		return;
	}
	
}

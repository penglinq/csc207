package edu.grinnell.sortingvisualizer.sorts;

import static org.junit.Assert.*;
import java.util.Arrays;

import org.junit.Test;

public class SortsTest {

	@Test
	public void selectionSortTest() {
		Character[] arr1 = {'a','b', 'c', 'd', 'e', 'f'}, arr1cp = Arrays.copyOf(arr1, arr1.length);
		Character[] arr2 = {'f', 'e', 'd', 'c', 'b', 'a'};
		Character[] arr3 = {'f', 'b', 'a', 'd', 'e', 'c'};
		Sorts.selectionSort(arr1);
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr1#"+i, arr1cp[i] , arr1[i]);
		}
		Sorts.selectionSort(arr2);
		for (int i = 0; i < arr2.length; i++)  { 
			assertEquals("arr2#"+i, arr1cp[i] , arr2[i]);
		}
		Sorts.selectionSort(arr3);
		for (int i = 0; i < arr3.length; i++)  { 
			assertEquals("arr3#"+i, arr1cp[i] , arr3[i]);
		}
	}
	
	@Test
	public void insertionSortTest() {
		Character[] arr1 = {'a','b', 'c', 'd', 'e', 'f'}, arr1cp = Arrays.copyOf(arr1, arr1.length);
		Character[] arr2 = {'f', 'e', 'd', 'c', 'b', 'a'};
		Character[] arr3 = {'f', 'b', 'a', 'd', 'e', 'c'};
		Sorts.insertionSort(arr1);
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr1#"+i, arr1cp[i] , arr1[i]);
		}
		Sorts.insertionSort(arr2);
		for (int i = 0; i < arr2.length; i++)  { 
			assertEquals("arr2#"+i, arr1cp[i] , arr2[i]);
		}
		Sorts.insertionSort(arr3);
		for (int i = 0; i < arr3.length; i++)  { 
			assertEquals("arr3#"+i, arr1cp[i] , arr3[i]);
		}
	}

	@Test
	public void bubbleSortTest() {
		Character[] arr1 = {'a','b', 'c', 'd', 'e', 'f'}, arr1cp = Arrays.copyOf(arr1, arr1.length);
		Character[] arr2 = {'f', 'e', 'd', 'c', 'b', 'a'};
		Character[] arr3 = {'f', 'b', 'a', 'd', 'e', 'c'};
		Sorts.bubbleSort(arr1);
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr1#"+i, arr1cp[i] , arr1[i]);
		}
		Sorts.bubbleSort(arr2);
		for (int i = 0; i < arr2.length; i++)  { 
			assertEquals("arr2#"+i, arr1cp[i] , arr2[i]);
		}
		Sorts.bubbleSort(arr3);
		for (int i = 0; i < arr3.length; i++)  { 
			assertEquals("arr3#"+i, arr1cp[i] , arr3[i]);
		}
	}

	@Test
	public void mergeSortTest() {
		Character[] arr1 = {'a','b', 'c', 'd', 'e', 'f'}, arr1cp = Arrays.copyOf(arr1, arr1.length);
		Character[] arr2 = {'f', 'e', 'd', 'c', 'b', 'a'};
		Character[] arr3 = {'f', 'b', 'a', 'd', 'e', 'c'};
		Sorts.mergeSort(arr1, 0, arr1.length);
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr1#"+i, arr1cp[i] , arr1[i]);
		}
		Sorts.mergeSort(arr2, 0, arr2.length);
		for (int i = 0; i < arr2.length; i++)  { 
			assertEquals("arr2#"+i, arr1cp[i] , arr2[i]);
		}
		Sorts.mergeSort(arr3, 0, arr3.length);
		for (int i = 0; i < arr3.length; i++)  { 
			assertEquals("arr3#"+i, arr1cp[i] , arr3[i]);
		}
	}

	@Test
	public void quickSortTest() {
		Character[] arr1 = {'a','b', 'c', 'd', 'e', 'f'}, arr1cp = Arrays.copyOf(arr1, arr1.length);
		Character[] arr2 = {'f', 'e', 'd', 'c', 'b', 'a'};
		Character[] arr3 = {'f', 'b', 'a', 'd', 'e', 'c'};
		Sorts.quickSort(arr1, 0, arr1.length);
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr1#"+i, arr1cp[i] , arr1[i]);
		}
		Sorts.quickSort(arr2, 0, arr2.length);
		for (int i = 0; i < arr2.length; i++)  { 
			assertEquals("arr2#"+i, arr1cp[i] , arr2[i]);
		}
		Sorts.quickSort(arr3, 0, arr3.length);
		for (int i = 0; i < arr3.length; i++)  { 
			assertEquals("arr3#"+i, arr1cp[i] , arr3[i]);
		}
	}
	
	@Test
	public void quickSortMassTest() {
		for (int i = 1; i < 100; i++) {
			Integer[] arr = new Integer[i];
			for (int j = 0; j < i; j++) {
				arr[j] = (int) Math.random()*100;
			}
			Integer[] arrcp = Arrays.copyOf(arr, arr.length);
			Sorts.selectionSort(arr);
			Sorts.quickSort(arrcp, 0, arrcp.length);
			for (int j = 0; j < i; j++){
				assertEquals("#"+i+"#"+j, arr[j], arrcp[j]);
			}
		}
	}
	
	@Test
	public void mergeSortMassTest() {
		for (int i = 1; i < 100; i++) {
			Integer[] arr = new Integer[i];
			for (int j = 0; j < i; j++) {
				arr[j] = (int) Math.random()*100;
			}
			Integer[] arrcp = Arrays.copyOf(arr, arr.length);
			Sorts.selectionSort(arr);
			Sorts.mergeSort(arrcp, 0, arrcp.length);
			for (int j = 0; j < i; j++){
				assertEquals("#"+i+"#"+j, arr[j], arrcp[j]);
			}
		}
	}
	
	@Test
	public void bubbleSortMassTest() {
		for (int i = 1; i < 100; i++) {
			Integer[] arr = new Integer[i];
			for (int j = 0; j < i; j++) {
				arr[j] = (int) Math.random()*100;
			}
			Integer[] arrcp = Arrays.copyOf(arr, arr.length);
			Sorts.selectionSort(arr);
			Sorts.bubbleSort(arrcp);
			for (int j = 0; j < i; j++){
				assertEquals("#"+i+"#"+j, arr[j], arrcp[j]);
			}
		}
	}
	
	@Test
	public void insertionSortMassTest() {
		for (int i = 1; i < 100; i++) {
			Integer[] arr = new Integer[i];
			for (int j = 0; j < i; j++) {
				arr[j] = (int) Math.random()*100;
			}
			Integer[] arrcp = Arrays.copyOf(arr, arr.length);
			Sorts.selectionSort(arr);
			Sorts.insertionSort(arrcp);
			for (int j = 0; j < i; j++){
				assertEquals("#"+i+"#"+j, arr[j], arrcp[j]);
			}
		}
	}

}

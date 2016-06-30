package edu.grinnell.sortingvisualizer.sorts;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

import edu.grinnell.sortingvisualizer.sortevents.SortEvent;

public class SortsTest {

	@Test
	public void selectionSortTest() {
		Character[] arr1 = {'a','b', 'c', 'd', 'e', 'f'}, arr1cp = Arrays.copyOf(arr1, arr1.length);
		Character[] arr2 = {'f', 'e', 'd', 'c', 'b', 'a'}, arr2cp = Arrays.copyOf(arr2, arr2.length);
		Character[] arr3 = {'f', 'b', 'a', 'd', 'e', 'c'}, arr3cp = Arrays.copyOf(arr3, arr3.length);
		LinkedList<SortEvent<Character>> l1 = Sorts.selectionSort(arr1);
		Sorts.eventSort(arr1cp, l1);
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr1#"+i, arr1cp[i] , arr1[i]);
		}
		LinkedList<SortEvent<Character>> l2 = Sorts.selectionSort(arr2);
		Sorts.eventSort(arr2cp, l2);
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr2#"+i, arr2cp[i] , arr2[i]);
		}
		LinkedList<SortEvent<Character>> l3 = Sorts.selectionSort(arr3);
		Sorts.eventSort(arr3cp, l3);
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr3#"+i, arr3cp[i] , arr3[i]);
		}
	}
	
	@Test
	public void insertionSortTest() {
		Character[] arr1 = {'a','b', 'c', 'd', 'e', 'f'}, arr1cp = Arrays.copyOf(arr1, arr1.length);
		Character[] arr2 = {'f', 'e', 'd', 'c', 'b', 'a'}, arr2cp = Arrays.copyOf(arr2, arr2.length);
		Character[] arr3 = {'f', 'b', 'a', 'd', 'e', 'c'}, arr3cp = Arrays.copyOf(arr3, arr3.length);
		LinkedList<SortEvent<Character>> l1 = Sorts.insertionSort(arr1);
		Sorts.eventSort(arr1cp, l1);
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr1#"+i, arr1cp[i] , arr1[i]);
		}
		LinkedList<SortEvent<Character>> l2 = Sorts.insertionSort(arr2);
		Sorts.eventSort(arr2cp, l2);
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr2#"+i, arr2cp[i] , arr2[i]);
		}
		LinkedList<SortEvent<Character>> l3 = Sorts.insertionSort(arr3);
		Sorts.eventSort(arr3cp, l3);
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr3#"+i, arr3cp[i] , arr3[i]);
		}
	}
	
	@Test
	public void bubbleSortTest() {
		Character[] arr1 = {'a','b', 'c', 'd', 'e', 'f'}, arr1cp = Arrays.copyOf(arr1, arr1.length);
		Character[] arr2 = {'f', 'e', 'd', 'c', 'b', 'a'}, arr2cp = Arrays.copyOf(arr2, arr2.length);
		Character[] arr3 = {'f', 'b', 'a', 'd', 'e', 'c'}, arr3cp = Arrays.copyOf(arr3, arr3.length);
		LinkedList<SortEvent<Character>> l1 = Sorts.bubbleSort(arr1);
		Sorts.eventSort(arr1cp, l1);
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr1#"+i, arr1cp[i] , arr1[i]);
		}
		LinkedList<SortEvent<Character>> l2 = Sorts.bubbleSort(arr2);
		Sorts.eventSort(arr2cp, l2);
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr2#"+i, arr2cp[i] , arr2[i]);
		}
		LinkedList<SortEvent<Character>> l3 = Sorts.bubbleSort(arr3);
		Sorts.eventSort(arr3cp, l3);
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr3#"+i, arr3cp[i] , arr3[i]);
		}
	}
	@Test
	public void mergeSortTest() {
		Character[] arr1 = {'a','b', 'c', 'd', 'e', 'f'}, arr1cp = Arrays.copyOf(arr1, arr1.length);
		Character[] arr2 = {'f', 'e', 'd', 'c', 'b', 'a'}, arr2cp = Arrays.copyOf(arr2, arr2.length);
		Character[] arr3 = {'f', 'b', 'a', 'd', 'e', 'c'}, arr3cp = Arrays.copyOf(arr3, arr3.length);
		LinkedList<SortEvent<Character>> l1 = Sorts.mergeSort(arr1, 0, arr1.length);
		Sorts.eventSort(arr1cp, l1);
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr1#"+i, arr1cp[i] , arr1[i]);
		}
		LinkedList<SortEvent<Character>> l2 = Sorts.mergeSort(arr2, 0, arr1.length);
		Sorts.eventSort(arr2cp, l2);
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr2#"+i, arr2cp[i] , arr2[i]);
		}
		LinkedList<SortEvent<Character>> l3 = Sorts.mergeSort(arr3, 0, arr1.length);
		Sorts.eventSort(arr3cp, l3);
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr3#"+i, arr3cp[i] , arr3[i]);
		}
	}
	
	@Test
	public void quickSortTest() {
		Character[] arr1 = {'a','b', 'c', 'd', 'e', 'f'}, arr1cp = Arrays.copyOf(arr1, arr1.length);
		Character[] arr2 = {'f', 'e', 'd', 'c', 'b', 'a'}, arr2cp = Arrays.copyOf(arr2, arr2.length);
		Character[] arr3 = {'f', 'b', 'a', 'd', 'e', 'c'}, arr3cp = Arrays.copyOf(arr3, arr3.length);
		LinkedList<SortEvent<Character>> l1 = Sorts.quickSort(arr1, 0, arr1.length);
		Sorts.eventSort(arr1cp, l1);
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr1#"+i, arr1cp[i] , arr1[i]);
		}
		LinkedList<SortEvent<Character>> l2 = Sorts.quickSort(arr2, 0, arr1.length);
		Sorts.eventSort(arr2cp, l2);
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr2#"+i, arr2cp[i] , arr2[i]);
		}
		LinkedList<SortEvent<Character>> l3 = Sorts.quickSort(arr3, 0, arr1.length);
		Sorts.eventSort(arr3cp, l3);
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr3#"+i, arr3cp[i] , arr3[i]);
		}
	}
	
	@Test
	public void quickSortMassTest() {
		for (int i = 1; i < 100; i++) {
			Integer[] arr = new Integer[i];
			for (int j = 0; j < i; j++) {
				arr[j] = Math.toIntExact(Math.round(Math.random()*100));
			}
			Integer[] arrcp = Arrays.copyOf(arr, arr.length);
			LinkedList<SortEvent<Integer>> l = Sorts.quickSort(arr, 0, arr.length);
			Sorts.eventSort(arrcp, l);
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
				arr[j] = Math.toIntExact(Math.round(Math.random()*100));
			}
			Integer[] arrcp = Arrays.copyOf(arr, arr.length);
			LinkedList<SortEvent<Integer>> l = Sorts.mergeSort(arr, 0, arr.length);
			Sorts.eventSort(arrcp, l);
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
				arr[j] = Math.toIntExact(Math.round(Math.random()*100));
			}
			Integer[] arrcp = Arrays.copyOf(arr, arr.length);
			LinkedList<SortEvent<Integer>> l = Sorts.bubbleSort(arr);
			Sorts.eventSort(arrcp, l);
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
				arr[j] = Math.toIntExact(Math.round(Math.random()*100));
			}
			Integer[] arrcp = Arrays.copyOf(arr, arr.length);
			LinkedList<SortEvent<Integer>> l = Sorts.insertionSort(arr);
			Sorts.eventSort(arrcp, l);
			for (int j = 0; j < i; j++){
				assertEquals("#"+i+"#"+j, arr[j], arrcp[j]);
			}
		}
	}
	
	@Test
	public void selectionSortMassTest() {
		for (int i = 1; i < 100; i++) {
			Integer[] arr = new Integer[i];
			for (int j = 0; j < i; j++) {
				arr[j] = Math.toIntExact(Math.round(Math.random()*100));
			}
			Integer[] arrcp = Arrays.copyOf(arr, arr.length);
			LinkedList<SortEvent<Integer>> l = Sorts.selectionSort(arr);
			Sorts.eventSort(arrcp, l);
			for (int j = 0; j < i; j++){
				assertEquals("#"+i+"#"+j, arr[j], arrcp[j]);
			}
		}
	}
 
}

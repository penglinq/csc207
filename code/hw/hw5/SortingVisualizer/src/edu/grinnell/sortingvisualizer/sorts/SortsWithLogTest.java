package edu.grinnell.sortingvisualizer.sorts;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

import edu.grinnell.sortingvisualizer.events.SortEvent;

public class SortsWithLogTest {

	@Test
	public void selectionSortTest() {
		Character[] arr1 = {'a','b', 'c', 'd', 'e', 'f'}, arr1cp = Arrays.copyOf(arr1, arr1.length);
		Character[] arr2 = {'f', 'e', 'd', 'c', 'b', 'a'}, arr2cp = Arrays.copyOf(arr2, arr2.length);
		Character[] arr3 = {'f', 'b', 'a', 'd', 'e', 'c'}, arr3cp = Arrays.copyOf(arr3, arr3.length);
		LinkedList<SortEvent<Character>> l1 = SortsWithLog.selectionSort(arr1);
		while (l1.size() > 0) {
			l1.getFirst().apply(arr1cp);
			l1.remove();
		}
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr1#"+i, arr1cp[i] , arr1[i]);
		}
		LinkedList<SortEvent<Character>> l2 = SortsWithLog.selectionSort(arr2);
		while (l2.size() > 0) {
			l2.getFirst().apply(arr2cp);
			l2.remove();
		}
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr2#"+i, arr2cp[i] , arr2[i]);
		}
		LinkedList<SortEvent<Character>> l3 = SortsWithLog.selectionSort(arr3);
		while (l3.size() > 0) {
			l3.getFirst().apply(arr3cp);
			l3.remove();
		}
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr3#"+i, arr3cp[i] , arr3[i]);
		}
	}
	
	@Test
	public void insertionSortTest() {
		Character[] arr1 = {'a','b', 'c', 'd', 'e', 'f'}, arr1cp = Arrays.copyOf(arr1, arr1.length);
		Character[] arr2 = {'f', 'e', 'd', 'c', 'b', 'a'}, arr2cp = Arrays.copyOf(arr2, arr2.length);
		Character[] arr3 = {'f', 'b', 'a', 'd', 'e', 'c'}, arr3cp = Arrays.copyOf(arr3, arr3.length);
		LinkedList<SortEvent<Character>> l1 = SortsWithLog.insertionSort(arr1);
		while (l1.size() > 0) {
			l1.getFirst().apply(arr1cp);
			l1.remove();
		}
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr1#"+i, arr1cp[i] , arr1[i]);
		}
		LinkedList<SortEvent<Character>> l2 = SortsWithLog.insertionSort(arr2);
		while (l2.size() > 0) {
			l2.getFirst().apply(arr2cp);
			l2.remove();
		}
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr2#"+i, arr2cp[i] , arr2[i]);
		}
		LinkedList<SortEvent<Character>> l3 = SortsWithLog.insertionSort(arr3);
		while (l3.size() > 0) {
			l3.getFirst().apply(arr3cp);
			l3.remove();
		}
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr3#"+i, arr3cp[i] , arr3[i]);
		}
	}
	
	@Test
	public void bubbleSortTest() {
		Character[] arr1 = {'a','b', 'c', 'd', 'e', 'f'}, arr1cp = Arrays.copyOf(arr1, arr1.length);
		Character[] arr2 = {'f', 'e', 'd', 'c', 'b', 'a'}, arr2cp = Arrays.copyOf(arr2, arr2.length);
		Character[] arr3 = {'f', 'b', 'a', 'd', 'e', 'c'}, arr3cp = Arrays.copyOf(arr3, arr3.length);
		LinkedList<SortEvent<Character>> l1 = SortsWithLog.bubbleSort(arr1);
		while (l1.size() > 0) {
			l1.getFirst().apply(arr1cp);
			l1.remove();
		}
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr1#"+i, arr1cp[i] , arr1[i]);
		}
		LinkedList<SortEvent<Character>> l2 = SortsWithLog.bubbleSort(arr2);
		while (l2.size() > 0) {
			l2.getFirst().apply(arr2cp);
			l2.remove();
		}
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr2#"+i, arr2cp[i] , arr2[i]);
		}
		LinkedList<SortEvent<Character>> l3 = SortsWithLog.bubbleSort(arr3);
		while (l3.size() > 0) {
			l3.getFirst().apply(arr3cp);
			l3.remove();
		}
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr3#"+i, arr3cp[i] , arr3[i]);
		}
	}
	@Test
	public void mergeSortTest() {
		Character[] arr1 = {'a','b', 'c', 'd', 'e', 'f'}, arr1cp = Arrays.copyOf(arr1, arr1.length);
		Character[] arr2 = {'f', 'e', 'd', 'c', 'b', 'a'}, arr2cp = Arrays.copyOf(arr2, arr2.length);
		Character[] arr3 = {'f', 'b', 'a', 'd', 'e', 'c'}, arr3cp = Arrays.copyOf(arr3, arr3.length);
		LinkedList<SortEvent<Character>> l1 = SortsWithLog.mergeSort(arr1, 0, arr1.length);
		while (l1.size() > 0) {
			l1.getFirst().apply(arr1cp);
			l1.remove();
		}
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr1#"+i, arr1cp[i] , arr1[i]);
		}
		LinkedList<SortEvent<Character>> l2 = SortsWithLog.mergeSort(arr2, 0, arr1.length);
		while (l2.size() > 0) {
			l2.getFirst().apply(arr2cp);
			l2.remove();
		}
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr2#"+i, arr2cp[i] , arr2[i]);
		}
		LinkedList<SortEvent<Character>> l3 = SortsWithLog.mergeSort(arr3, 0, arr1.length);
		while (l3.size() > 0) {
			l3.getFirst().apply(arr3cp);
			l3.remove();
		}
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr3#"+i, arr3cp[i] , arr3[i]);
		}
	}
	
	@Test
	public void quickSortTest() {
		Character[] arr1 = {'a','b', 'c', 'd', 'e', 'f'}, arr1cp = Arrays.copyOf(arr1, arr1.length);
		Character[] arr2 = {'f', 'e', 'd', 'c', 'b', 'a'}, arr2cp = Arrays.copyOf(arr2, arr2.length);
		Character[] arr3 = {'f', 'b', 'a', 'd', 'e', 'c'}, arr3cp = Arrays.copyOf(arr3, arr3.length);
		LinkedList<SortEvent<Character>> l1 = SortsWithLog.quickSort(arr1, 0, arr1.length);
		while (l1.size() > 0) {
			l1.getFirst().apply(arr1cp);
			l1.remove();
		}
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr1#"+i, arr1cp[i] , arr1[i]);
		}
		LinkedList<SortEvent<Character>> l2 = SortsWithLog.quickSort(arr2, 0, arr1.length);
		while (l2.size() > 0) {
			l2.getFirst().apply(arr2cp);
			l2.remove();
		}
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr2#"+i, arr2cp[i] , arr2[i]);
		}
		LinkedList<SortEvent<Character>> l3 = SortsWithLog.quickSort(arr3, 0, arr1.length);
		while (l3.size() > 0) {
			l3.getFirst().apply(arr3cp);
			l3.remove();
		}
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr3#"+i, arr3cp[i] , arr3[i]);
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
			LinkedList<SortEvent<Integer>> l = SortsWithLog.quickSort(arr, 0, arr.length);
			while (l.size() > 0) {
				l.getFirst().apply(arrcp);
				l.remove();
			}
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
			LinkedList<SortEvent<Integer>> l = SortsWithLog.mergeSort(arr, 0, arr.length);
			while (l.size() > 0) {
				l.getFirst().apply(arrcp);
				l.remove();
			}
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
			LinkedList<SortEvent<Integer>> l = SortsWithLog.bubbleSort(arr);
			while (l.size() > 0) {
				l.getFirst().apply(arrcp);
				l.remove();
			}
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
			LinkedList<SortEvent<Integer>> l = SortsWithLog.insertionSort(arr);
			while (l.size() > 0) {
				l.getFirst().apply(arrcp);
				l.remove();
			}
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
				arr[j] = (int) Math.random()*100;
			}
			Integer[] arrcp = Arrays.copyOf(arr, arr.length);
			LinkedList<SortEvent<Integer>> l = SortsWithLog.selectionSort(arr);
			while (l.size() > 0) {
				l.getFirst().apply(arrcp);
				l.remove();
			}
			for (int j = 0; j < i; j++){
				assertEquals("#"+i+"#"+j, arr[j], arrcp[j]);
			}
		}
	}
 
}

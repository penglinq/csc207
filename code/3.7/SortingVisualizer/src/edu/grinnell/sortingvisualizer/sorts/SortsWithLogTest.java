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
		for (int i = 0; i < l1.size(); i++) {
			l1.getFirst().apply(arr1cp);
			l1.remove();
		}
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr1#"+i, arr1cp[i] , arr1[i]);
		}
		LinkedList<SortEvent<Character>> l2 = SortsWithLog.selectionSort(arr2);
		for (int i = 0; i < l2.size(); i++) {
			l2.getFirst().apply(arr2cp);
			l2.remove();
		}
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr2#"+i, arr2cp[i] , arr2[i]);
		}
		LinkedList<SortEvent<Character>> l3 = SortsWithLog.selectionSort(arr3);
		for (int i = 0; i < l3.size(); i++) {
			l3.getFirst().apply(arr3cp);
			l3.remove();
		}
		for (int i = 0; i < arr1.length; i++)  { 
			assertEquals("arr3#"+i, arr3cp[i] , arr3[i]);
		}
	}

}

package edu.grinnell.sortingvisualizer;

import static org.junit.Assert.*;

import org.junit.Test;

public class NoteIndicesTest {

	@Test
	public void test() {
		NoteIndices n = new NoteIndices(10);
		n.initializeAndShuffle(10);
		for (int i = 0; i < n.getNotes().length; i++) {
			System.out.print(" "+n.getNotes()[i]+" ");
		}
		System.out.println(" ");
		System.out.println(" "+ Math.toIntExact(Math.round(Math.random()*100)));
	}

}

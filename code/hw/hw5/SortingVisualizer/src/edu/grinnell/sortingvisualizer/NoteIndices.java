package edu.grinnell.sortingvisualizer;

import java.util.Arrays;

/**
 * A collection of indices into a Scale object.
 * These indices are the subject of the various sorting algorithms
 * in the program.
 */
public class NoteIndices {
	Integer[] arr;
	boolean[] ifHighlighted;
    /**	
     * @param n the size of the scale object that these indices map into
     */
    public NoteIndices(int n) {
        this.arr = new Integer[n];
        ifHighlighted = new boolean[n];
        Arrays.fill(ifHighlighted, false);
     // TODO: check here
    }
    
    /**
     * Reinitializes this collection of indices to map into a new scale object
     * of the given size.  The collection is also shuffled to provide an
     * initial starting point for the sorting process.
     * @param n the size of the scale object that these indices map into
     */
    public void initializeAndShuffle(int n) {
        this.arr = new Integer[n];
        for(int i = 0; i < arr.length; i++) {
        	arr[i] = i;
        }
        ifHighlighted = new boolean[n];
        Arrays.fill(ifHighlighted, false);
        int j, temp;
        for(int i = arr.length - 1; i > 0; i--) {
        	j =  Math.toIntExact(Math.round(Math.random()*i));
        	temp = arr[j];
        	arr[j] = arr[i];
        	arr[i] = temp;
        }
    	// TODO: check here
    }
    
    /** @return the indices of this NoteIndices object */
    public Integer[] getNotes() { 
        // TODO: check here
        return arr;
    }
    
    /**
     * Highlights the given index of the note array
     * @param index the index to highlight
     */
    public void highlightNote(int index) {
        this.ifHighlighted[index] = true;
    	// TODO: check here
    }
    
    /** @return true if the given index is highlighted */
    public boolean isHighlighted(int index) {
        // TODO: check here
        return this.ifHighlighted[index];
    }
    
    /** Clears all highlighted indices from this collection */
    public void clearAllHighlighted() {
        Arrays.fill(ifHighlighted, false);
    	// TODO: check here
    }
}

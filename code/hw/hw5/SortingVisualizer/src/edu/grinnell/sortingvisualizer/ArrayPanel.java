package edu.grinnell.sortingvisualizer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ArrayPanel extends JPanel {

    private NoteIndices notes;
    
    /**
     * Constructs a new ArrayPanel that renders the given note indices to
     * the screen.
     * @param notes the indices to render
     * @param width the width of the panel
     * @param height the height of the panel
     */
    public ArrayPanel(NoteIndices notes, int width, int height) {
        this.notes = notes;
        this.setPreferredSize(new Dimension(width, height));
    }

    @Override
    public void paintComponent(Graphics g) {
    	Integer[] arr = notes.getNotes();
        int recWidth = this.getWidth() / arr.length;
        int recHeight = this.getHeight() / arr.length;
        int colorChange = 250 / (arr.length -1);
        for (int i = 0; i < arr.length; i++) {
        	Color c = new Color(250, 250 - arr[i]*colorChange,  arr[i]*colorChange);
        	g.setColor(c);
        	g.fillRect(recWidth * i, this.getHeight() -(1 + arr[i])*recHeight, recWidth, (1 + arr[i])*recHeight);
        }
    	// TODO: 
    }
}
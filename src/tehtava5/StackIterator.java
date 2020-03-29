/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.tehtava5;

/**
 *
 * @author kamaj
 */
interface Iterator {
    boolean hasNext();
    Object next();
}

public class StackIterator implements Iterator {
	private int currentIndex;
	private int size;
    private ListItem[] items;
    private Queue container; // container on tietorakenne, jota iteroidaan

    StackIterator (Queue c) { // konstruktori on "package visible"
        container = c;
        currentIndex = 0;
        size = c.getSize();
        items = c.items;
    }
    // palautetaan tieto siitä, löytyyko rakenteesta seuraava alkio
    // hmm... palautetaan tieto siitä, osoittaako nykypositio (current) alkiota vai ei.
    public boolean hasNext() {
        return (currentIndex < size);
    }
    // palautetaan nykyinen (lista-alkio) ja siirretään nykypositiota pykälä eteenpäin
    public ListItem next() {
    	ListItem current = items[currentIndex];
    	currentIndex++;
    	return current;
    }

}


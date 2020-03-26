/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.tehtava2;

/**
 *
 * @author Kimmo Perälä
 */
public class Queue {
    
    private ListItem tail;
    private ListItem head;
    private int size;
    
    // muodosta uusi lista-alkio ja vie se jonon huipulle
    public void push(String aData){

    	ListItem newItem = new ListItem();
    	newItem.setData(aData);

		if (tail == null) {
    		tail = newItem;
    		head = tail;
    	}
		else {
			tail.setNext(newItem);
			tail = newItem;
    	}
    	this.size++;
    }
    
    // poista ja palauta alkio jonon alusta, 
    // jos jono tyhjä palauta null
    public ListItem pop(){
    	if (head == null) {
        	return null;
    	} else {
	    	ListItem np = new ListItem();
	    	np = head;
	    	head = head.getNext();
	    	this.size--;
	    	if (this.size == 0) {
        		tail = null;
        		head = null;
        	}
	    	return np;
    	}
    }
    
    // tulosta jonon sisältö muuttamatta jonoa
    public void printItems() {
    	ListItem np = head;
    	while (np != null) {
    		System.out.println(np.getData());
    		np = np.getNext();
    	}
    }
    
    public int getSize() {
        return this.size;
    }
    
}


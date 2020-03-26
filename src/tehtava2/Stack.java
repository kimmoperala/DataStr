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
public class Stack {
    
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
	    	ListItem last = new ListItem();
	    	last = tail;

			tail = newItem;
			tail.setNext(last);
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
	    	ListItem first = new ListItem();
	    	first = head;
	    	np = tail;
	    	while (np.getNext() != head && np.getNext() != null) {
	    		np = np.getNext();
	    	}
	    	head = np;
    		this.size--;
    		if (this.size == 0) {
        		tail = null;
        		head = null;
        	}
	    	return first;
    	}
    }
    
    // tulosta jonon sisältö muuttamatta jonoa
    public void printItems() {
    	if (this.size == 0) {
    		System.out.println("Jono on tyhjä!");
    	}
    	else {
    		System.out.println(tail.getData());
            ListItem nextItem = tail.getNext();
            for (int i = this.size-1; i>0; i--) {
            	System.out.println(nextItem.getData());
            	nextItem = nextItem.getNext();
            }
        }
    }
    
    public int getSize() {
        return this.size;
    }
    
}


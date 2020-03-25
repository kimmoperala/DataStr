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
    
    private ListItem top;
    private ListItem bottom;
    private int size;
    
    // muodosta uusi lista-alkio ja vie se jonon huipulle
    public void push(String aData){

    	ListItem newItem = new ListItem();
    	newItem.setData(aData);

		if (top == null) {
    		top = newItem;
    		bottom = top;
    	}
		else {
	    	ListItem first = new ListItem();
	    	first = top;

			top = newItem;
			top.setNext(first);
    	}
    	this.size++;
    }
    
    // poista ja palauta alkio jonon alusta, 
    // jos jono tyhjä palauta null
    public ListItem pop(){
    	if (bottom == null) {
        	return null;
    	} else {
	    	ListItem np = new ListItem();
	    	ListItem last = new ListItem();
	    	last = bottom;
	    	np = top;
	    	while (np.getNext() != bottom && np.getNext() != null) {
	    		np = np.getNext();
	    	}
	    	bottom = np;
    		this.size--;
    		if (this.size == 0) {
        		top = null;
        		bottom = null;
        	}
	    	return last;
    	}
    }
    
    // tulosta jonon sisältö muuttamatta jonoa
    public void printItems() {
    	if (this.size == 0) {
    		System.out.println("Jono on tyhjä!");
    	}
    	else {
    		System.out.println(top.getData());
            ListItem nextItem = top.getNext();
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


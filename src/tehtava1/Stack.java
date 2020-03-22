/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtava1;

/**
 *
 * @author Kimmo Perälä
 */
public class Stack {
    
    private ListItem top=null;
    private int size=0;
    
    // muodosta uusi lista-alkio ja vie se pinon huipulle
    public void push(String aData){
    	
    	ListItem newItem = new ListItem();
    	newItem.setData(aData);
    	
		if (top == null) {
    		top = newItem;
    	}
		else {
			ListItem last = top;
			top = newItem;
    		top.setNext(last);
    	}
    	size++;
    }
    // poista ja palauta alkio pinon huipulta, 
    // jos pino tyhjä palauta null
    public ListItem pop(){
		ListItem last = top;

    	if (top == null) {
        	return null;
    	} else {
    		top = top.getNext();
    		size--;
    	}
    	return last;
    }
    // tulosta pinon sisältö muuttamatta pinoa
    public void printItems() {
    	String result;
    	if (top == null) {
    		result = "Pino on tyhjä!";
    	}
    	else {
    		result = "Pinossa on (isoin numero päällimmäinen):\n";
    		result += size + ": " + top.getData();
            ListItem nextItem = top.getNext();
            for (int i = size-1; i>0; i--) {
            	result +=", " + i + ": " + nextItem.getData();
            	nextItem = nextItem.getNext();
            }
        }
        System.out.println(result);
    }
    public int getSize() {
        return size;
    }
    
}

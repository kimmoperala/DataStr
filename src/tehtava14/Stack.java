/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtava14;

/**
 *
 * @author Kimmo Perälä
 */
public class Stack {
    
    private ListItem top;
    private int size;
    
    // muodosta uusi lista-alkio ja vie se pinon huipulle
    public void push(String aData){
    	
    	ListItem newItem = new ListItem();
    	newItem.setData(aData);
    	newItem.setNext(top);
		top = newItem;
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
        ListItem np = top;
        System.out.println("Pinon sisältö: ");

    	while(np != null) {
            System.out.print(np.getData() + " ");
            np = np.getNext();
    	}
    	System.out.println();
    }
    public int getSize() {
        return size;
    }
    
}

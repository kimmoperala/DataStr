/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtava6;

import java.util.*;

/**
 *
 * @author Kimmo Perälä
 */
public class Stack {
    
    private LinkedList<String> list;

    
    public Stack() {
    	list = new LinkedList<String>();
    }
    
    public void push(String aData){
    	list.add(aData);
    }
    
    public String pop(){
    	if (list.size() != 0) {
	    	String first = list.removeFirst();
	    	return first;
    	}
    	return null;
    }

    public void printItems() {
    	Iterator<String> itr = list.iterator();
    	while (itr.hasNext()) {
    		System.out.println(itr.next());
    	}
    }
    
    public int getSize() {
    	return list.size();
    }
    
}

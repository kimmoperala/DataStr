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
public class Queue {

        ListItem head; // head näkyy oletuspakkaukseen
        private ListItem tail;
        private int size;
        ListItem[] items;

        public Queue() {
                head = null;
                tail = null;
                items = new ListItem[10];
                size = 0;
        }
        //  palautetaan pino-iteraattori
        public StackIterator iterator() {
            return new StackIterator(this);
        }
        // muodostetaan uusi alkio ja viedään se huipulle
        public void push(String aData) {
                ListItem newItem = new ListItem(); // luodaan uusi lista-alkio
                newItem.setData(aData);
                
                if (head == null) {
                	head = newItem;
                	tail = head;
                }
                
                if (items[items.length-1] != null) {
                	ListItem[] biggerArray = new ListItem[items.length + 10];
                	System.arraycopy(items, 0, biggerArray, 0, items.length);
                	items = biggerArray;
                } 
                for (int i = 0; i < items.length; i++) {
	                	if (items[i] == null) {
	                		items[i] = newItem;
	                		break;
	                	}
                }
                tail.setLink(newItem);
                tail = newItem;
                this.size++;
        }
        // poistetaan alkio pinon huipulta, jos pinossa ei alkioita palautetaan null
        public ListItem pop() {
                ListItem takeAway;
                if (items[0] == null) {
                        takeAway = null; // pino on tyhjä
                }
                else
                {
                        takeAway = items[0];
                        ListItem[] poppedItems = new ListItem[items.length];
                        if (items.length == 1) {
                        	items[0] = null;
                        } else {
                        	for (int i = 0; i < items.length-1; i++) {
                            	poppedItems[i]=items[i+1];
                            }
                            items = poppedItems;

                        }
                        head = items[0];
                        this.size--;
                }
                return takeAway;
        }
        // palautetaan pinottujen alkioiden lukumäärä
        public int getSize() {
                return size;
        }
        // listataan sisältö
        public void printItems() {
        		for (int i = 0; i <items.length; i++) {
        			if (items[i] != null) {
        				System.out.println(items[i].getData());
        			}
        		}

        }
}


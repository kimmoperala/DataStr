/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tehtava8;

/**
 *
 * @author Kimmo Perälä
 */
public class BinaryTree {

    private Node root;
    
    public BinaryTree(String rootValue) {
        root = new Node(rootValue);
    }
    public BinaryTree(){
        root = null;
    }
    /*public BinaryTree(String rootValue, BinaryTree left, BinaryTree right){
        root = new Node(rootValue, left, right);
    } */
    
    public void insert(String aData){
    	if (find(aData) != null) {
    		return;
    	}
    	BinaryTree newTree;

        if (root == null) {
        	Node newNode = new Node(aData);
        	root = newNode;
        } else if (aData.compareTo(root.getData()) < 0){

        	if(root.left() != null) {
        		newTree = root.left();
        		newTree.insert(aData);
        	}
        	else {
        		BinaryTree tree = new BinaryTree(aData); // alipuun rootiksi aData
        		root.setLeft(tree); // asetetaan alipuu vasemmalle
        	}
        }
        else if (aData.compareTo(root.getData()) > 0) {
        	if (root.right() != null) {
        		newTree = root.right();
        		newTree.insert(aData);
        	}
        	else {
        		BinaryTree tree = new BinaryTree(aData); // alipuun rootiksi aData
        		root.setRight(tree); // asetetaan alipuu oikealle
        	}
        }
        else {
        	return;
        }
    }
    
    public BinaryTree find(String aData){
        BinaryTree result;
    	// return ETEEN ennen ....find
	    if (root != null) {
	    	if (aData.compareTo(root.getData()) == 0) {
	    		result = new BinaryTree(root.getData());
	    		return result;
	    	}
	    	else if (aData.compareTo(root.getData()) < 0) {
	    		result = root.left();
	    		if (result == null) {
	    			return null;
	    		}
	    		return result.find(aData);
	    	}
	    	else {
	    		result = root.right();
	    		if (result == null) {
	    			return null;
	    		}
	    		return result.find(aData);
	    	}
	    }
	    return null;
    }
    public void preOrder() {
        if (root != null) {
            System.out.println(root.getData()+',');
            if (root.left() != null) // pääseeekö vasemmalle?
                root.left().preOrder();
            if (root.right() != null) // pääseekö oikealle?
                root.right().preOrder();
        }

    }
    
    public void inOrder() {
    	if (root != null) {
    		if (root.left() != null) // pääseeekö vasemmalle?
                root.left().inOrder();
            System.out.print(root.getData()+',');
            if (root.right() != null) // pääseekö oikealle?
                root.right().inOrder();
    	}
    }
  
    public void setLeft(BinaryTree tree) {
        root.setLeft(tree);
    }

    public void setRight(BinaryTree tree) {
        root.setRight(tree);
    }
}

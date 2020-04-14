/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tehtava10;

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
    	BinaryTree newTree;
    	int height = -1;

        if (root == null) {
        	Node newNode = new Node(aData);
        	root = newNode;
        } else if (aData.compareTo(root.getData()) <= 0){

        	if(root.left() != null) {
        		newTree = root.left();
        		newTree.insert(aData);
        	}
        	else {
        		BinaryTree tree = new BinaryTree(aData); // alipuun rootiksi aData
        		root.setLeft(tree); // asetetaan alipuu vasemmalle
        	}
        }
        else {
        	if (root.right() != null) {
        		newTree = root.right();
        		newTree.insert(aData);
        	}
        	else {
        		BinaryTree tree = new BinaryTree(aData); // alipuun rootiksi aData
        		root.setRight(tree); // asetetaan alipuu oikealle
        	}
        }
        if (root.left() != null) {
        	if (root.left().root.getHeight() >= height) {
        		height = root.left().root.getHeight();
        	}
        }
        if (root.right() != null) {
        	if (root.right().root.getHeight() >= height) {
        		height = root.right().root.getHeight();
        	}
        }
        root.setHeight(height + 1);
    }
    
    public BinaryTree find(String aData){
        BinaryTree result;
    	// return ETEEN ennen ....find
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
    public void preOrder() {
        if (root != null) {
            System.out.println(root.getData()+ ", korkeus " + root.getHeight());
            if (root.left() != null) // pääseeekö vasemmalle?
                root.left().preOrder();
            if (root.right() != null) // pääseekö oikealle?
                root.right().preOrder();
        }

    }
  
    public void setLeft(BinaryTree tree) {
        root.setLeft(tree);
    }

    public void setRight(BinaryTree tree) {
        root.setRight(tree);
    }

}

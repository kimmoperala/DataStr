package tehtava17;

import java.util.TreeSet;

public class TreeSetImplementation {
	private TreeSet<Integer> treeSet;
	Integer root;
	
	public TreeSetImplementation () {
		treeSet = new TreeSet<Integer>();
	}

    public void insert (Integer integer) {
    	treeSet.add(integer);
    }
    	
    public boolean find (Integer integer) {
    	if (treeSet.contains(integer)) {
    		return true;
    	}
    	return false;
    }
    public void inOrder() {
    	System.out.println(treeSet);
    }
    public void preOrder() {
    	
    }
}

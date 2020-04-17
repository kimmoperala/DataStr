package tehtava11;

//Model from https://www.geeksforgeeks.org/search-insert-and-delete-in-a-sorted-array/

public class BinarySearch {
	private String[] array = new String[100];
	private int n;
	
	public BinarySearch() {
		array[0]= "aapeli";
		array[1]= "bertta";
		this.n=2;
	}
	
	public void insert(String key) {
		int capacity = this.array.length;
		System.out.println(capacity);
		this.n = insertMethod(this.array, this.n, key, capacity);
	}
	
	public int insertMethod(String[] array, int n, String data, int capacity) {
		if (n >= capacity) {
            return n;
		}
		int i;
		for (i = n-1; (i >= 0 && data.compareTo(array[i]) < 0); i--) {
			array[i + 1] = array[i];
		}
		array[i + 1] = data;
		return (n+1);
	}
	
	public int binarySearch(String key) {

		return search(this.array, key, 0, this.array.length - 1);
	}
	
	public int search(String[] array, String key, int low, int high) {
		
		if (low > high) {
			return -1;
		}
		int mid = (low + high)/2;
		
		System.out.println("low on " + low);
		System.out.println("high on " + high);
		System.out.println("mid on " + mid);
		System.out.println("array mid on " + array[mid]);
		if (array[mid] == null || array[mid].compareTo(key) > 0) {
			return search(array, key, low, (mid - 1));
		}
		else if (array[mid].compareTo(key) < 0) {
			return search(array, key, (mid + 1), high);
		}
		else {
			return mid;
		}
	}
	public void showAll() {
		for (int i = 0; i < this.n; i++) {
			System.out.println(array[i] + " ");
		}
	}
}

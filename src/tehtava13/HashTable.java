package tehtava13;

public class HashTable {
	private Integer[] hashTable;
	private int size;
	private int numberOfAdded;
	
	public HashTable(int size) {
		this.size = size;
		hashTable = new Integer[this.size];
		numberOfAdded = 0;
	}
	
	public void add (int number) {
		boolean success = false;
		int placeNumber = number % this.size;
		System.out.println("paikalle: " + placeNumber + " koko " + this.size);
		while (!success && numberOfAdded != hashTable.length) {
			if (hashTable[placeNumber] == null) {
				hashTable[placeNumber] = number;
				numberOfAdded++;
				success = true;
			} else {
				System.out.println("Ei mahdu, uusi paikka " + (placeNumber + 1));
				placeNumber += 1;
				if (placeNumber > hashTable.length - 1) {
					placeNumber = 0;
				}
			}
		}
		if (numberOfAdded == hashTable.length) {
			System.out.println("Hajautustaulu on täynnä.");
		}
	}
	
	public int search (int number) {
		int guesses = 1;
		int guessLocation = number % this.size;
		System.out.println("guessLocation on " + guessLocation);
		while (guesses <= hashTable.length) {
			if (hashTable[guessLocation] == null) {
				return -1;
			}
			if (hashTable[guessLocation] != number) {
				guessLocation++;
				if (guessLocation > hashTable.length - 1) {
					guessLocation = 0;
				}
				guesses++;
			}
			else {
				System.out.println("Löytyi paikalta " + guessLocation + ", guesses " + guesses);
				return guessLocation;
			}
		}
		return -1;
	}
	
	public void showAll() {
		for (int i = 0; i < hashTable.length; i++) {
			System.out.println(hashTable[i] + " ");
		}
	}
}

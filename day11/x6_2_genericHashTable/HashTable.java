public class HashTable <T,U> {

	private LinkedKeyValuePair[] mapArray;
	
	public HashTable() {
		mapArray = new LinkedKeyValuePair[1000];
		for(int i = 0; i < 1000; i++) {
			mapArray[i] = null;
		} 
	}	

	public void put (T key, U value) {
		LinkedKeyValuePair putPair = new LinkedKeyValuePair(key, value);
		int arrayPosition = getArrayPosition(key);
		if(mapArray[arrayPosition] == null) {
			mapArray[arrayPosition] = putPair;
			System.out.println("Added " + value + " to key > " + key + " <");	
		} else {
			LinkedKeyValuePair mapKeyPair = mapArray[arrayPosition];
			while(true) {
				if(mapKeyPair.getNext() == null) {
					mapKeyPair.setNext(putPair);
					System.out.println("Added " + value + " to key > " + key + " <");	
					return;
				} else {
					mapKeyPair = mapKeyPair.getNext();
				}			
			}
		}			
	} 

	// returns value on basis of stack (LIFO) within each key value of table
	// values not removed, but could do easy.
	// CAN"T / DON'T KNOW HOW TO RETURN AN ARRAY OF U'S (ARRAY & GENERIC BAD VIBES!)
	public U get(T key) {
		int arrayPosition = getArrayPosition(key);		
		if(mapArray[arrayPosition] != null) {
			
			LinkedKeyValuePair kvPair = mapArray[arrayPosition];
			while(true){			
				if(kvPair.getNext() == null) {
					U result = (U) kvPair.getValue();
					return result;
				} else {
					kvPair = kvPair.getNext();
				}			
			}	
		} else {
			System.out.print("Key not present ---> ");
			return null;
		}	
	}
	
	//removes all values under that key
	public boolean remove(T key) {
		int arrayPosition = getArrayPosition(key);
		if(mapArray[arrayPosition] != null) {
			mapArray[arrayPosition] = null;
			return true;		
		} else {
			return false;
		}
	}
	
	private int getArrayPosition(T key) {
		int hash = key.hashCode();
		int shortHash = Math.abs(hash % 1000);
		return shortHash;
	}
}

public class SimpleMap <T,U> {

	private KeyValuePair[] mapArray;
	
	public SimpleMap() {
		mapArray = new KeyValuePair[1000];
		for(int i = 0; i < 1000; i++) {
			mapArray[i] = null;
		} 
	}	

	public void put (T key, U value) {
		KeyValuePair putPair = new KeyValuePair(key, value);
		int arrayPosition = getArrayPosition(key);
		if(mapArray[arrayPosition] == null) {
			mapArray[arrayPosition] = putPair;
			System.out.println("Added " + value + " to key > " + key + " <");	
		} else {
			System.out.println("!!! > " + key + " < Key already in map");
		}			
	} 

	public U get(T key) {
		int arrayPosition = getArrayPosition(key);		
		if(mapArray[arrayPosition] != null) {
			KeyValuePair kvPair = mapArray[arrayPosition];
			U result = (U) kvPair.getValue();
			return result;		
		} else {
			System.out.print("Key not present ---> ");
			return null;
		}	
	}
	
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

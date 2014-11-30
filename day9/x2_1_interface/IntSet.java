public interface IntSet {

	/**
	* adds a new int to the set, false otherwise
	*/
	
	add(int);	

	/**
	* returns true if the number is in the set, false otherwise
	*/
	
	contains(int);
	
	/**
	* returns the same values as contains(int), but for every element that is checked
	* prints its value on the screen
	*/
	
	containsVerbose(int);
	
	/**
	* returns a string with the values of the elements in the set separatated by commas
	*/

	toString();
	
}

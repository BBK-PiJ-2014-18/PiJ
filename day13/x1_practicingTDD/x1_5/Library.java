public interface Library {

	String getLibrary();
	
	//mock? use getID(String) ??
	
//	int getID();

	/**
	* Setter for maxNumberOfBooks, allows this to be updated at any time.
	*/

	void setMaxNumberOfBooks(int maxNumberOfBooks);
	
	/**
	* @return the current value of the library's maxNumberOfBooks per user 
	*/
	
	int getMaxNumberOfBooks();
	
	
	/**
	* Provides a unique ID for each unique name, creating an ID for new users
	* @return the unique ID of the user 
	* @param the name of the user
	*/
		
	int getID(String userName);

}
public interface User {

	/**
	* Users have a name and a Library-ID (an int), both of which must be unique
	* in a library.  The name is set at construction time, but the library-ID is not.
	* /
	
	/**
	* The class must have methods to get name and ID and to set ID.	
	*/
	
	//setters
	void setID(int id);

	//getters
	String getName();
	
	int getID();

	// for 1.3....

	/**
	* gets the library that the user is registered with
	*/

	Library getLibrary();

	/**
	* The way to obtain the user-ID. Sets the user's library field to library
	* and returns an ID obtained from that library
	*/
	
	int register(Library library);
	
}
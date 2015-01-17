public interface User {

	/**
	* Users have a name and a Library-ID (an int), both of which must be unique
	* in a library.  The name is set at construction time, but the library-ID is not.
	* /
	
	/**
	* The class must have methods to get name and ID and to set ID.	
	*/
	
	String getName();
	
	int getID();
	
	void setID(int id);


}
public interface Book {

	/**
	* Author and Title are set at constructor time and never modified afterwards. 
	* (The object Book is an immutable object).	
	*
	* The class should have getters for both author and title.
	*/

	String getAuthor(); 
	
	String getTitle();
	
}	
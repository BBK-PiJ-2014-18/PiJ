public class LibraryImpl implements Library {


	private	String library;
	private int maxNumberOfBooks;

	/**
	* Constructor.  Sets library name and max number of books
	*/
	
	public LibraryImpl (String library, int maxNumberOfBooks) {
		this.library = library;
		this.maxNumberOfBooks = maxNumberOfBooks;
	}

	public String getLibrary() {
		return library;
	}
	
	public int getMaxNumberOfBooks() {
		return this.maxNumberOfBooks;
	}


	// mock method for testing

	public int getID() {
		return 13;	
	}	

}
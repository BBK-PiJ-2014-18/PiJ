public class LibraryImpl implements Library {


	private String[] readerArray;
	private int readerCount;
	private	String library;
	private int maxNumberOfBooks;

	/**
	* Constructor.  Sets library name and max number of books
	*/
	
	public LibraryImpl (String library, int maxNumberOfBooks) {
		this.library = library;
		this.maxNumberOfBooks = maxNumberOfBooks;
		readerCount = 0;
		readerArray = new String[5];
	}

	public String getLibrary() {
		return library;
	}
	
	public int getMaxNumberOfBooks() {
		return this.maxNumberOfBooks;
	}

	/**
	* Setter for maxNumberOfBooks, allows this to be updated at any time.
	*/

	public void setMaxNumberOfBooks(int maxNumberOfBooks) {
		this.maxNumberOfBooks = maxNumberOfBooks;
	}	

	// mock method for testing

//	public int getID() {
//		return 13;	
//	}	
	
	// can be replaced (later) by...
	
	public int getID(String name) {
		for (int i = 0 ; i < readerCount; i++) {
			if (readerArray[i].equals(name)) {
				return i + 1;
			}
		}
		readerArray[readerCount] = name;
		readerCount++;	
		return readerCount;	
	}
	
	
	

}
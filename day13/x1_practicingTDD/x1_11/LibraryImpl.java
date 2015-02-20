public class LibraryImpl implements Library {


	private String[] readerArray;
	private Book[] bookArray;
	private int readerCount;
	private int bookCount;
	private int bookBorrowedCount;
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
		bookCount = 0;
		bookArray = new Book[5];
		for (int i = 0; i < 5; i++) {
			bookArray[i] = null;
		}
		bookBorrowedCount = 0;
	}

	public String getLibrary() {
		return library;
	}
	
	public int getMaxNumberOfBooks() {
		return this.maxNumberOfBooks;
	}

	public Book getBook(int i) {
		return bookArray[i];
	}	

	/**
	* Setter for maxNumberOfBooks, allows this to be updated at any time.
	*/

	public String[] setMaxNumberOfBooks(int maxNumberOfBooks) {
		this.maxNumberOfBooks = maxNumberOfBooks;
		String[] result = new String[5];
		String[] allBorrowers = userBorrowingArray();
		int i = 0;
		int p = 0;
		while(i < allBorrowers.length && allBorrowers[i] != null) {
			int k = 0;
			int borrowCount = 0;
			while (k < bookArray.length && bookArray[k] != null) {
				if(bookArray[k].isTaken() && 
				  readerArray[bookArray[k].getOnLoanTo() -1] == allBorrowers[i]) {
					borrowCount ++;
				}
			k++;
			}		
			if(borrowCount > maxNumberOfBooks) {
				result[p] = allBorrowers[i];
				p++;
			}
			i++;
		}
		return result;
	}	

	
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
	

	// for 1.6
	

	public void addBook(String title, String author) {
		bookArray[bookCount] = new BookImpl(title, author);
		bookCount++;
	}
	
	/**
	* If the book is not taken, marks the book as taken and returns it.
	* If the book is taken, null is returned
	* @param the title of the book being taken
	* @return the book that is being taken
	*/

	public Book takeBook(int ID, String title) {
		int i = 0;
		while(i < bookArray.length && bookArray[i] != null) {
			if(bookArray[i].getTitle().equals(title) && !bookArray[i].isTaken()) {
				bookArray[i].setTaken(true);
				bookArray[i].setOnLoanTo(ID);
				bookBorrowedCount++;
				return bookArray[i];
			}		
		i++;
		}
		return null;
	}			
	

	/**
	* Marks the book as not taken
	* @param the book to be returned
	*/
	
	public void returnBook(Book book) {	
		int i = 0;
		while(i < bookArray.length && bookArray[i] != null) {
			if(bookArray[i].getTitle().equals(book.getTitle())) {
				bookArray[i].setTaken(false);
				bookArray[i].setOnLoanTo(-1);
				bookBorrowedCount--;;	
				return;
			}		
		i++;
		}
	}
	
	/**
	* @return the number of users registered in this library
	*/

	public int getReaderCount() {
		return readerCount;
	}

	/**
	* @return the number of books in this library
	*/

	public int getBookCount() {
		return bookCount;
	}	

	/**
	* @returns the number of borrowed books in this library
	*/

	public int getBookBorrowedCount() {
		return bookBorrowedCount;
	}

	/**
	* @return an array of containing the names of all users borrowing books at the moment
	*/


	public String[] userBorrowingArray() {
		String[] result = new String[5];
		int i = 0;
		int k = 0;
		while(i < bookArray.length && bookArray[i] != null) {
			if(bookArray[i].isTaken()) {
				String temp = readerArray[bookArray[i].getOnLoanTo() -1];
				boolean alreadyInResult = false;
				int j = 0;
				while(j < result.length && result[j] != null) {
					if (temp.equals(result[j]))	{
						alreadyInResult = true;		
					}
					j++;
				}
				if(!alreadyInResult) {
					result[k] = temp;
					k++;
				}
			}		
			i++;		
		}		
		return result;
	}

	/**
	* @return an array of containing the names of all users
	*/

	public String[] userArray() {
		return readerArray;
	}
	
	
	public String userLoanedTo(String title) {
		int i = 0;
		while(i < bookArray.length && bookArray[i] != null) {
			if (title.equals(bookArray[i].getTitle()) && bookArray[i].isTaken()) {
				return readerArray[bookArray[i].getOnLoanTo() -1];
			}
			i++;	
		}
		return null;
	}
	
}


















public class BookImpl implements Book {

	private String author;
	private String title;
		
	//constructor
	public BookImpl(String author, String title) {
		this.author = author;
		this.title = title;
	}	
		
	//getters
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getTitle() {
		return this.title;
	}	
}	
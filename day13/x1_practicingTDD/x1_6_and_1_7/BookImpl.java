public class BookImpl implements Book {

	private String author;
	private String title;
	private boolean taken;
		
	//constructor
	public BookImpl(String title, String author) {
		this.title = title;
		this.author = author;
		this.taken = false;
	}	
		
	//getters
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getTitle() {
		return this.title;
	}	
	
	public boolean isTaken() {
		return this.taken;
	}
	
	
	//setter
	
	public void setTaken(boolean taken) {
		this.taken = taken;
	}		
}	
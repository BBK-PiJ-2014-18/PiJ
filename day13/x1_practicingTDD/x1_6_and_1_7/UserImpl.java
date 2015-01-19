public class UserImpl implements User {

	private String name;
	private int ID;
	private Library library;
	
	public UserImpl (String name) {
		this.name = name;
	}

	public void setID(int ID) {
		this.ID = ID;
	}	

	public String getName() {
		return name;
	}

	public int getID() {
		return ID;
	}	

	public int register(Library library) {
		this.library = library;
		this.ID = library.getID(this.name);
		return this.ID;
	}
	
	public Library getLibrary() {
		return library;
	}
	



}
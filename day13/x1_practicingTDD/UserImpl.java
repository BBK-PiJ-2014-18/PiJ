public class UserImpl implements User {

	private String name;
	private int ID;
	
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


	



}
public class Person {

	//spot the errors.. there are two problems....

	private final String name;
	
	// can set name on construction
	public Person (String name) {
		this.name = name;
	}
	
	
	// { missing on first line	- fixed below...
	public String getName() {
		return this.name;
	}		 
	
	// cannot change name after construction - and will not compile
	public void setName(String name) {
		this.name = name;
	}	
	
}	
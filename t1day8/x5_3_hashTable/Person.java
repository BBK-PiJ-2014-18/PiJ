public class Person {

	private String name;
	private Person nextPerson;

	void Person() {
		name = null;
		nextPerson = null;
	}
	
	//getters
	public String getName() {
		return this.name;
	}
	public Person getNextPerson() {
		return this.nextPerson;
	}		
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setNextPerson(Person nextPerson) {
		this.nextPerson = nextPerson;
	}	
	
}	
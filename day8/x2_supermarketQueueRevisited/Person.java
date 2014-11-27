/**
* a node (a person) in a singly-linked list of people
*/

public class Person {

	private String name;
	private int age;


	//constructors
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person () {
		this.name = null;
	}



			
	//getters
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}		

	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;	
	}
	
			
}	
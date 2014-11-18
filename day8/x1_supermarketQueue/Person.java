/**
* a node (a person) in a singly-linked list of people
*/

public class Person {

	public String name;
	public int age;
	public Person nextPerson;

	//constructor
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
		this.nextPerson = null;
	}
	
	//getters
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}		

	public Person getPerson() {	
		return nextPerson;
	}
	
	//setter
	public void setNextPerson(Person person) {
		this.nextPerson = person;
	}		
}	
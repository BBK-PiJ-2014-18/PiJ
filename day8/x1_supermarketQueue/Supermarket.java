/**
* Implementation of interface Person using a
* singly-linked list as support.
*/

public class Supermarket {
	private PersonQueue queue1;
	private PersonQueue queue2;
	private PersonQueue queue3;

	public Supermarket() {
		queue1 = new SupermarketQueue();
	}
	
	public void addPerson(Person newPerson) {
		
		System.out.println("ADDING PERSON"); 
		queue1.insert(newPerson);
		
	}
	
 	public Person servePerson() {
 		
 		System.out.println("SERVING PERSON");	
 		Person next = queue1.retrieve();
		return next;
	
	}

	



}




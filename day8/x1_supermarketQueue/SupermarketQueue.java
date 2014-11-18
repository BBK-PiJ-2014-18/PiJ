public class SupermarketQueue implements PersonQueue {
	
	@Override
	public void insert(Person person) {
	
		System.out.println("Inserting person");
	
	
	}
	
	@Override
	public Person retrieve() {

		System.out.println("Retrieving person");
		
		Person ck = new Person("Cathy", 11);
		return ck;
		
	}
}
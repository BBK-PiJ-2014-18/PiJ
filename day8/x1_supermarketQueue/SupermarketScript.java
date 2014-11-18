public class SupermarketScript {

	public static void main (String[] args) {
		SupermarketScript script = new SupermarketScript();
		script.launch();
	}
	
	public void launch() {
	
		Supermarket tesco = new Supermarket();
		Person mk = new Person("Mark", 10);
		tesco.addPerson(mk);
		Person toServe = tesco.servePerson();
		System.out.println("Serving: " + toServe.getName());
	}
}	
	
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
		Person ck = new Person("Cathy", 90);
		tesco.addPerson(ck);
		Person tk = new Person("Tom", 16);
		tesco.addPerson(tk);
		toServe = tesco.servePerson();
		System.out.println("Serving: " + toServe.getName());
		toServe = tesco.servePerson();
		System.out.println("Serving: " + toServe.getName());
		toServe = tesco.servePerson();
		System.out.println("Serving: " + toServe.getName());
		Person ak = new Person("Anna", 90);
		tesco.addPerson(ak);
		Person ek = new Person("Ellie", 16);
		tesco.addPerson(ek);
		toServe = tesco.servePerson();
		System.out.println("Serving: " + toServe.getName());
		toServe = tesco.servePerson();
		System.out.println("Serving: " + toServe.getName());
		toServe = tesco.servePerson();
		System.out.println("Serving: " + toServe.getName());
	}
}	
	
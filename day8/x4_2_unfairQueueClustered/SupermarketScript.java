public class SupermarketScript {

	public static void main (String[] args) {
		SupermarketScript script = new SupermarketScript();
		script.launch();
	}
	
	public void launch() {
	
		Supermarket tesco = new Supermarket();
		Person mk = new Person("Mark", 19);
		tesco.addPerson(mk);	
		Person ck = new Person("Cathy", 13);
		tesco.addPerson(ck);
		Person tk = new Person("Tom", 66);
		tesco.addPerson(tk);
		Person jk = new Person("John", 99);
		tesco.addPerson(jk);
		Person ak = new Person("Anna", 58);
		tesco.addPerson(ak);
		Person bk = new Person("Bren", 11);
		tesco.addPerson(bk);
		Person ek = new Person("Ellie", 57);
		tesco.addPerson(ek);
		Person dk = new Person("Daisy", 68);
		tesco.addPerson(dk);
		Person toServe = tesco.servePerson();
		System.out.println("Serv: " + toServe.getName() + " " + toServe.getAge());
		toServe = tesco.servePerson();
		System.out.println("Serv: " + toServe.getName() + " " + toServe.getAge());
		toServe = tesco.servePerson();
		System.out.println("Serv: " + toServe.getName() + " " + toServe.getAge());
		toServe = tesco.servePerson();
		System.out.println("Serv: " + toServe.getName() + " " + toServe.getAge());
		toServe = tesco.servePerson();
		System.out.println("Serv: " + toServe.getName() + " " + toServe.getAge());
		toServe = tesco.servePerson();
		System.out.println("Serv: " + toServe.getName() + " " + toServe.getAge());
		toServe = tesco.servePerson();
		System.out.println("Serv: " + toServe.getName() + " " + toServe.getAge());
		toServe = tesco.servePerson();
		System.out.println("Serv: " + toServe.getName() + " " + toServe.getAge());
	}
}	
	
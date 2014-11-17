public class TestPersonScript {

	public static void main (String[] args) {
		TestPersonScript tps = new TestPersonScript();
		tps.launch();	
	}	
	
	
	public void launch() {
	
		Person firstPerson = new AdultPerson();
		testPerson(firstPerson);
		Person secondPerson = new KidPerson();
		testPerson(secondPerson);
	}

	private void testPerson (Person person) {
	
		System.out.println("Testing a person");
//		person.move(10);
		person.say("I love you, Mum");		
	}

}	
	
	
	
	
		
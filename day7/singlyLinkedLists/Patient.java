public class Patient {

	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	
	//constructor
	public Patient (String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
	}
	// getters
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getIllness() {
		return illness;
	}			

	public Patient getNextPatient() {
		return nextPatient;
	}

	//add a patient to list
	public void addPatient(Patient newPatient) {
	
		if(this.nextPatient == null) {
			this.nextPatient = newPatient;
		} else {
			this.nextPatient.addPatient(newPatient);
		}
	
	}
}
public abstract class AquaticAnimal implements Animal {

	private String name = null;
	
	public AquaticAnimal(String name) {
		this.name = name;
	}	

	public void call() {
		System.out.println();
		System.out.println(this.name + " will not come");
		reproduce();
	}

	public void reproduce() {
		System.out.println("Rain Stops... Reproduce...");
		makeSound();
	}
}	
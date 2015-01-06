public abstract class LandAnimal implements Animal {

	private String name = null;
	
	public LandAnimal(String name) {
		this.name = name;
	}	

	public void call() {
		System.out.println();
		System.out.println(this.name + " coming");
		reproduce();
	}
	
	public void reproduce() {
		System.out.println("Rain Stops... Reproduce...");
		makeSound();
	}
}
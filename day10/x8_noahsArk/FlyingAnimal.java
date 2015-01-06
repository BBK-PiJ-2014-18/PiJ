public abstract class FlyingAnimal implements Animal {

	private String name = null;
	
	public FlyingAnimal(String name) {
		this.name = name;
	}	

	public void call() {
		System.out.println();
		System.out.println(this.name + " now flying, will come later when tired...");
		reproduce();
	}

	public void reproduce() {
		System.out.println("Rain Stops... Reproduce...");
		makeSound();
	}
}	
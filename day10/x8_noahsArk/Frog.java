public class Frog extends LandAnimal implements NonMammal  {

	public Frog(String name) {
		super(name);
	}	

	public void reproduce() {
		super.reproduce();
		layEggs();
	}	

	public void layEggs() {
		System.out.println("=> TADPOLES");
	}	

	public void makeSound() {
		System.out.println("++ croak +++");
	}

}
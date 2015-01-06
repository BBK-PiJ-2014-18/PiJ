public class Eagle extends FlyingAnimal implements NonMammal  {

	public Eagle(String name) {
		super(name);
	}	

	public void reproduce() {
		super.reproduce();
		layEggs();
	}	

	public void layEggs() {
		System.out.println("=> BIG EAGLE EGG");
	}	

	public void makeSound() {
		System.out.println("++ very loud squawk +++");
	}
}
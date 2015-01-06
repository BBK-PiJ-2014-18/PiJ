public class Fish extends AquaticAnimal implements NonMammal  {

	public Fish(String name) {
		super(name);
	}	

	public void reproduce() {
		super.reproduce();
		layEggs();
	}	

	public void layEggs() {
		System.out.println("=> LITTLE FISH EGGS");
	}	

	public void makeSound() {
		System.out.println("++ bubbles +++");
	}
}
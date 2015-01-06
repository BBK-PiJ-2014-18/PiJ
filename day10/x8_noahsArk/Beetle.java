public class Beetle extends FlyingAnimal implements NonMammal  {

	public Beetle(String name) {
		super(name);
	}	

	public void reproduce() {
		super.reproduce();
		layEggs();
	}	

	public void layEggs() {
		System.out.println("=> SMALL LADYBIRD EGGS");
	}	

	public void makeSound() {
		System.out.println("++ flapflapflap +++");
	}
}
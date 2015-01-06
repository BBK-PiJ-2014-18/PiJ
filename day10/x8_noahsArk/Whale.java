public class Whale extends AquaticAnimal implements Mammal  {

	public Whale(String name) {
		super(name);
	}	

	public void reproduce() {
		super.reproduce();
		giveBirth();
	}	

	public void giveBirth() {
		System.out.println("=> BABY WHALE BORN (NO EGGS..)");
	}	

	public void makeSound() {
		System.out.println("++ bosh +++");
	}
}
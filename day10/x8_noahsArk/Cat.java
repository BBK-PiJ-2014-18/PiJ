public class Cat extends LandAnimal implements Mammal  {

	public Cat(String name) {
		super(name);
	}	

	public void reproduce() {
		super.reproduce();
		giveBirth();
	}	

	public void giveBirth() {
		System.out.println("=> KITTEN");
	}	

	public void makeSound() {
		System.out.println("++ meow +++");
	}

}
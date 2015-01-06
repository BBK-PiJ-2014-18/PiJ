public class ArkScript {

	public static void main (String[] args) {
		ArkScript as = new ArkScript();
		as.launch();
	}

	public void launch() {
		Cat myCat = new Cat("Black Cat");
		myCat.call();
		Frog myFrog = new Frog("Spotty Pond Frog");
		myFrog.call();	
		Whale myWhale = new Whale("Blue Whale");
		myWhale.call();
		Fish myFish = new Fish("Salmon");
		myFish.call();
		Eagle myEagle = new Eagle("Golden Eagle");
		myEagle.call();
		Beetle myBeetle = new Beetle("Ladybird");
		myBeetle.call();
		System.out.println();
	}
}
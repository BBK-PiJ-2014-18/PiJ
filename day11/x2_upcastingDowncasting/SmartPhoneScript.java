public class SmartPhoneScript {

	public static void main (String[] args) {
	SmartPhoneScript sps = new SmartPhoneScript();
	System.out.println();
	System.out.println("=== 2.1 Start ===");
	sps.launch1();
	}

	public void launch1() {
		System.out.println();
		SmartPhone myPhone = new SmartPhone("nokia");
		System.out.println("Brand: " + myPhone.getBrand());
		myPhone.browseWeb("Page to browse");
		System.out.println(myPhone.findPosition());
		myPhone.call("1234");
		myPhone.printLastNumbers();
		myPhone.call("001234");
		myPhone.playGame("wk 11 game");
		myPhone.ringAlarm("wk 11 alarm");
		System.out.println();
	}
}






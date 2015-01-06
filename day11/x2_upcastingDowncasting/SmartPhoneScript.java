public class SmartPhoneScript {

	public static void main (String[] args) {
	SmartPhoneScript sps = new SmartPhoneScript();
	System.out.println();
	System.out.println("=== 2.1 Start ===");
	sps.launch1();
	System.out.println("=== 2.2 Start ===");
	sps.launch2();
	}

//	2.1 Set-up works fine
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

//	2.2.1 Won't compile these three methods in SmartPhone....
	public void launch2() {
		System.out.println();
		MobilePhone myPhone = new SmartPhone("nokia");
		System.out.println("Brand: " + myPhone.getBrand());
//		myPhone.browseWeb("Page to browse");
//		System.out.println(myPhone.findPosition());
		myPhone.call("1234");
		myPhone.printLastNumbers();
		myPhone.call("001234");
//		myPhone.playGame("wk 11 game");
		myPhone.ringAlarm("wk 11 alarm");
		System.out.println();
	
//	2.2.2 Can fix by DIRECT UPCASTING to a SmartPhone....

		System.out.println("===> ====> NOW UPCAST ====> ====>");
		SmartPhone mySmartPhone = (SmartPhone) myPhone;	
		System.out.println("Brand: " + mySmartPhone.getBrand());
		mySmartPhone.browseWeb("Page to browse");
		System.out.println(mySmartPhone.findPosition());
		mySmartPhone.call("1234");
		mySmartPhone.printLastNumbers();
		mySmartPhone.call("001234");
		mySmartPhone.playGame("wk 11 game");
		mySmartPhone.ringAlarm("wk 11 alarm");
		System.out.println();
	}
	
	
}




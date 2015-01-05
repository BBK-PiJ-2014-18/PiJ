public class PhoneLauncher {

	public static void main (String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	
	public void launch() {
	
		SmartPhone sp = new SmartPhone();
		System.out.println("Launcher says+++> sp.call");
		sp.call("1234");
		System.out.println("Launcher says+++> sp.browseWeb");
		sp.browseWeb("BBC");
		System.out.println("Launcher says+++> sp.ringAlarm");
		sp.ringAlarm("time for school");
		System.out.println("Launcher says+++> sp.printLastNumbers");		
		sp.printLastNumbers();
	
	}
	
}	
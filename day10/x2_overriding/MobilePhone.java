public class MobilePhone extends OldPhone {


	private String lastNumber;
		
	@Override
	public void call(String number) {
		super.call(number);
		System.out.println("Saving number to recent calls (from MobilePhone)");
		lastNumber = number;
	}

	public void ringAlarm(String alarm) {
	
		System.out.println("WAKE UP (from MobilePhone): " + alarm);
	
	}
	
	
	public void playGame(String game) {
	
		System.out.println("PLAY (from MobilePhone): " + game);
	
	} 
	
	public void printLastNumbers() {
	
		System.out.println("=== LAST 10 NUMBERS (from MobilePhone) ===");
		System.out.println(" 1: " + lastNumber);  	
	
	}
	

}
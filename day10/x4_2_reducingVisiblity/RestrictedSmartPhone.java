public class RestrictedSmartPhone extends SmartPhone{

	
	public RestrictedSmartPhone(String brand) {
		super(brand);
	}	
	
	//YOU CAN'T OVERRIDE A PUBLIC METHOD WITH A PRIVATE ONE....
	//RestrictedSmartPhone.java:24: error: playGame(String) in RestrictedSmartPhone cannot 		
	//override playGame(String) in SmartPhone
	//private void playGame(String game) {
	//             ^
  	//attempting to assign weaker access privileges; was public
	//1 error
	private void playGame(String game) {
		System.out.println("PLAY (from RSP): " + game);
	}	


}
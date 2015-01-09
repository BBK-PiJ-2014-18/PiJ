public class KeyValuePair <T,U> {

	private T key;
	private U value;
	
	//constructor
	public KeyValuePair(T key, U value) {
		this.key = key;
		this.value = value;
	}
	
	//getter
	public U getValue() {
		return this.value;
	}	

}
public class LinkedKeyValuePair <T,U> {

	private T key;
	private U value;
	private LinkedKeyValuePair next;
	
	//constructor
	public LinkedKeyValuePair(T key, U value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}
	
	//getter
	public U getValue() {
		return this.value;
	}
	
	public LinkedKeyValuePair getNext() {
		return this.next;
	}
	
	//setter
	public void setNext(LinkedKeyValuePair next) {
		this.next = next;
	}	

}
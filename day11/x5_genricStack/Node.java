public class Node {

	private int value;
	private Node next;
	
	//constructors...
	
	public Node () {
		this.next = null;
	}	
	
	public Node (int value) {
		this.value = value;
		this.next = null;
	}		
	
	// push, pop and isEmpty...
	
	public void push (int value) {
		Node addNode = new Node(value);
		if(this.isEmpty()) {
			this.next = addNode;
			System.out.println("Pushed: " + value); 		
		} else {
			this.next.push(value);
		}
	}	
	
	public int pop () {
		if(this.next.next == null) {
			int result = this.next.value;
			this.next = null;
			return result;
		} else {
			return this.next.pop();
		}
	}
	
	public boolean isEmpty() {
		if(this.next == null) {
			return true;
		} else {
			return false;
		}		
	}
}
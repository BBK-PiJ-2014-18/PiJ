public class Node <N> {

	private N value;
	private Node next;
	
	//constructors...
	
	public Node () {
		this.next = null;
	}	
	
	public Node (N value) {
		this.value = value;
		this.next = null;
	}		
	
	// push, pop and isEmpty...
	
	public void push (N value) {
		Node addNode = new Node(value);
		if(this.isEmpty()) {
			this.next = addNode;
			System.out.println("Pushed: " + value); 		
		} else {
			this.next.push(value);
		}
	}	
	
	public N pop () {
		if(this.next.next == null) {
			N result = (N) this.next.value;
			this.next = null;
			return result;
		} else {
			return (N) this.next.pop();
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
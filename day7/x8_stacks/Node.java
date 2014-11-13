public class Node {

	private int storeNumber;
	private Node nextNode;

	//constructor
	public Node (int storeNumber) {
	this.storeNumber = storeNumber;
	this.nextNode = null;
	}

	public Node () {
	this.nextNode = null;
	}

	//insert an element at the beginning of the stack
	public void push (Node newNode) {
	//	printStack();
		System.out.println("Pushing " + newNode.storeNumber + "...");
		newNode.nextNode = this.nextNode;
		this.nextNode = newNode;
		int temp = this.storeNumber;
		this.storeNumber = newNode.storeNumber;
		newNode.storeNumber = temp;

		return;
	}

	//remove an element from the beginning of the stack
	public void pop() {
	//	printStack();
		if(empty()) {
			System.out.println("Stack is empty");
			return;
		} else {
			System.out.println("Popping...it's a " + this.storeNumber);
			this.storeNumber = this.nextNode.storeNumber;
			this.nextNode = this.nextNode.nextNode;
			return;
		}
	}
	
	private boolean empty(){
		if (this.nextNode == null) {
			return true;
		} else {
			return false;
		}		
	}
	
/*	size & printstack used in checking and to see what happening
		
	public int size() {		
		Node currentNode = this;
		int result = 0;
		while (currentNode.nextNode != null) { 
			result++;
			currentNode = currentNode.nextNode;
		} 			
		return result;
	}
	
	public void printStack(){
		Node currentNode = this;
		System.out.print("Stack size: " + this.size() + " Contains: ");
		while (currentNode.nextNode != null) { 
			System.out.print(currentNode.storeNumber + ", ");
			currentNode = currentNode.nextNode;
		}
		System.out.println(); 			
		return;
	}
*/
}
	
public class Node {

	private int requestNumber;
	private Node nextNode;

	//constructor
	public Node (int requestNumber) {
	this.requestNumber = requestNumber;
	this.nextNode = null;
	}

	public Node () {
	this.nextNode = null;
	}

	//NEW insert an element at the beginning of the queue
	public void insert(Node newNode) {
		System.out.println("Inserting request " + newNode.requestNumber + "...");
		newNode.nextNode = this.nextNode;
		this.nextNode = newNode;
		int temp = this.requestNumber;
		this.requestNumber = newNode.requestNumber;
		newNode.requestNumber = temp;
//		printStack();
		return;
	}

	//remove an element from the end of the queue
	public int retrieve() {
		if(this.size() <= 0) {
			System.out.println("QUEUE EMPTY");
//			printStack();
			return -999;
		}
		Node currentNode = this;
		while(currentNode.nextNode.nextNode != null) {
			currentNode = currentNode.nextNode;	
		}
		int result = currentNode.requestNumber;
		currentNode.nextNode = null;
//		System.out.print("At end of the retrieve... ");
//		printStack();
		return result;
	}
	
	public int size() {
		Node currentNode = this;
		int result = 0;
		while (currentNode.nextNode != null) { 
			result++;
			currentNode = currentNode.nextNode;
		} 			
		return result;
	}
	//just for checking	
	public void printStack(){
		Node currentNode = this;
		System.out.print("Queue size: " + this.size() + " Contains: ");
		while (currentNode.nextNode != null) { 
			System.out.print(currentNode.requestNumber + ", ");
			currentNode = currentNode.nextNode;
		}
		System.out.println(); 			
		return;
	}
	
	
}	
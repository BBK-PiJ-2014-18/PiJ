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
		newNode.nextNode = this.nextNode;
		this.nextNode = newNode;
		this.requestNumber = newNode.requestNumber;
		System.out.println("Inserting request " + newNode.requestNumber + "...");
		return;
	}

	//remove an element from the end of the queue
	public int retrieve() {
		if(this.size() <= 0) {
			System.out.println("QUEUE EMPTY");
			return -999;
		}
		Node currentNode = this;
		while(currentNode.nextNode.nextNode != null) {
			currentNode = currentNode.nextNode;	
		}
		int result = currentNode.nextNode.requestNumber;
		currentNode.nextNode = null;
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
}
	
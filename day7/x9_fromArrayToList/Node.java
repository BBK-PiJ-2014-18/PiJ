public class Node {

	private int theNumber;
	private Node nextNode;
	
	//constructor
	public Node (int theNumber) {
		this.theNumber = theNumber;
		this.nextNode = null;
	}
	
	//add a node
	public void addNode(Node newNode) {
		if(this.nextNode == null) {
			this.nextNode = newNode;
		} else {
			this.nextNode.addNode(newNode);
		}		
	}
	
	//print a list
	public void printList() {
		Node currentNode = this;
		do {
			System.out.print(" > " + currentNode.theNumber);
			currentNode = currentNode.nextNode;
		} while(currentNode!= null);
		System.out.println();
	}
	
	
}	
	
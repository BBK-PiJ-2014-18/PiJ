public class DoubleLinkNode {

	private int theNumber;
	private DoubleLinkNode previousNode;
	private DoubleLinkNode nextNode;
	
	//constructor
	public DoubleLinkNode (int theNumber) {
		this.theNumber = theNumber;
		this.previousNode = null;
		this.nextNode = null;
	}
	
	//getters
	public int getTheNumber() {
		return this.theNumber;
	}
	public DoubleLinkNode getPreviousNode() {
		return this.previousNode;
	}
	
	public DoubleLinkNode getNextNode() {
		return this.nextNode;
	}

	//setters
	public void setTheNumber(int theNumber) {
		this.theNumber = theNumber;
	}
	
	//add a node
	public void addDoubleLinkNode(DoubleLinkNode newNode) {
		if(this.nextNode == null) {
			this.nextNode = newNode;
			newNode.previousNode = this;
		} else {
			this.nextNode.addDoubleLinkNode(newNode);
		}		
	}
	
	//print a list
	public void printList() {
		DoubleLinkNode currentNode = this;
		do {
			System.out.print(" > " + currentNode.theNumber);
			currentNode = currentNode.nextNode;
		} while(currentNode!= null);
		System.out.println();
	}
	
}	
	
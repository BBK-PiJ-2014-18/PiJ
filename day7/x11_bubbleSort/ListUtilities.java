public class ListUtilities {

	//Turn an array of integers into a linked list
	public static Node intArrayToList(int[] intArray) {
		Node listStart = new Node(intArray[0]);
		for (int i = 1; i < intArray.length; i++) {
			Node newNode = new Node(intArray[i]);
			listStart.addNode(newNode);	
		}	
		return listStart;	
	}

	//Sort a list of integers
	public static Node bubbleSort(Node firstNode) {
		
		Node currentNode = firstNode;
		while (currentNode.getNextNode() != null) {	
			Node nextNode = currentNode.getNextNode();
			if(currentNode.getTheNumber() > nextNode.getTheNumber()) {
				int temp = currentNode.getTheNumber();
				currentNode.setTheNumber(nextNode.getTheNumber());
				nextNode.setTheNumber(temp);
			}		
		currentNode = nextNode;
		}
	return firstNode;
	}


}


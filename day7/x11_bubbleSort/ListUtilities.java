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
	
		
		//if first node > second node => swap them.
		if(firstNode.getTheNumber() > firstNode.getNextNode().getTheNumber()) {
		
		
			int temp = firstNode.getTheNumber();
			firstNode.setTheNumber(firstNode.getNextNode().getTheNumber());
			firstNode.getNextNode().setTheNumber(temp);

			
		}	
			
		

	return firstNode;
	}


}


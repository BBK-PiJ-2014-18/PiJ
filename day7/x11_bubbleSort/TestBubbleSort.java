public class TestBubbleSort {

	private Node listStart = null;
	
	public static void main (String[] args) {
		TestBubbleSort test = new TestBubbleSort();
		test.launch();
	}
	
	
	private void launch() {
		//set an array
		int[] intArray = {20, 10, 30, 40, 50, 60, 70, 80, 90};				
		//make the list
		listStart = ListUtilities.intArrayToList(intArray);		
		//print the list 
		System.out.println("Before sorting: ");
		listStart.printList();
		//sort the list
		listStart = ListUtilities.bubbleSort(listStart);
		//print the list 
		System.out.println("After sorting: ");
		listStart.printList();
	
	
	}
	
}	
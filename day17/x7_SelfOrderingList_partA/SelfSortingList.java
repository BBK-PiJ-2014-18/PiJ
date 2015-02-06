public class SelfSortingList { 

	private Sorter sorter;

	private Node head;
	
	private boolean stop;
	
	public SelfSortingList () {
		head = new Node();
		stop = false;
		sorter = new Sorter(this);
		Thread t = new Thread(sorter);
		t.start();
	}	
			
	public void setStop(boolean stop) {
		this.stop = stop;
	}			
			
	public boolean getStop() {
		return stop;
	}		
			
	public void add(int item) {
		Node newNode = new Node(item);
		Node currentNode = head;
		while(currentNode.getNextNode() != null) {
			currentNode = currentNode.getNextNode();	
		}
		currentNode.setNextNode(newNode);
		sorter.setSorted(false);
		
	}
	
	public void printList() {
		Node runner;
		if(head.getNextNode() != null) {
			runner = head.getNextNode();
		} else {
			System.out.println("List is empty");
			return;
		}	
		while(runner.getNextNode() !=null) {
			System.out.print(runner.getItem() + " < ");
			runner = runner.getNextNode();	
		}
		System.out.println(runner.getItem());
	}

	public boolean sort() {	
		Node runner;
		if(head.getNextNode() != null) {
			runner = head.getNextNode();
		} else {
			return true;
		}
		int count = 0;
		while(runner.getNextNode() !=null && count < 3) {
			if(runner.getItem() > runner.getNextNode().getItem()) {
				int temp = runner.getItem();
				runner.setItem(runner.getNextNode().getItem());
				runner.getNextNode().setItem(temp);
				count++;
			}
			runner = runner.getNextNode();
		}
		if(count < 3) {
			return true;
		}
		return false;	
	}
}

// NODE
class Node {

	private int item;	
	private Node nextNode;
	
	public Node() {
		this.nextNode = null;
	}
	
	public Node (int item) {
		this.item = item;
		this.nextNode = null;
	}
	
	public void setItem(int item) {
		this.item = item;
	}	
	
	
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}	
	
	public Node getNextNode() {
		return nextNode;
	}
	
	public int getItem() {
		return item;
	}	
}	




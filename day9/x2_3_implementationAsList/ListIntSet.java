public class ListIntSet implements IntSet {
	
	private int value;
	private ListIntSet nextListIntSet;
	
	//constructor
	public ListIntSet(int value) {
		this.value = value;
		this.nextListIntSet = null;
	}	

	public void add(int newNumber) {
		if (!contains(newNumber)) {		
			ListIntSet insertNode = new ListIntSet(newNumber);
			if(this.nextListIntSet == null) {
				this.nextListIntSet = insertNode;
				return;
			}	
			ListIntSet currentNode = this.nextListIntSet;
			while (currentNode.nextListIntSet != null) {
				currentNode = currentNode.nextListIntSet;
			}
			currentNode.nextListIntSet = insertNode;				
		}
	}	

	public boolean contains(int checkNumber) {
		if(this.value == checkNumber) {
			return true;
		}
		if (this.nextListIntSet != null) {
			return this.nextListIntSet.contains(checkNumber);
		}
		return false;
	}
	
	public boolean containsVerbose(int checkNumber) {

		System.out.print(this.value); 
		if(this.value == checkNumber) {
			System.out.print(". "); 
			return true;
		}
		if (this.nextListIntSet != null) {
			System.out.print(", "); 
			return this.nextListIntSet.containsVerbose(checkNumber);
		}
		System.out.print(". "); 
		return false;
	}
	
	public String toString() {
		String result = "" + this.value;
		if(this.nextListIntSet == null) {
			return result;
		} 	
		ListIntSet currentNode = this.nextListIntSet;
		while(currentNode.nextListIntSet != null) {
			result = result + ", " + currentNode.value;
			currentNode = currentNode.nextListIntSet;
		}	
		result += ", " + currentNode.value;
		return result;
	}

































}
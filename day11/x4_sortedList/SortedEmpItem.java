public class SortedEmpItem <T> extends EmpItem <T> {

	//constructor
	public SortedEmpItem (T item) {
		super(item);
	}

	//add an EmpItem to list
	@Override
	public void add(T itemToAdd) {
		EmpItem empItemToAdd = new SortedEmpItem(itemToAdd);
		if(this.getNext() == null) {
			// there's only the first item
			if(greaterThan(this.getItem(), itemToAdd)) {
				//insert before first item
				T temp = this.getItem(); 
				this.setItem(itemToAdd); 
				empItemToAdd.setItem(temp);
				this.setNext(empItemToAdd);
				empItemToAdd.setPrevious(this);
				return;
			} else {
				//insert after	
				this.setNext(empItemToAdd);
				empItemToAdd.setPrevious(this);
				return;
			}
		}		
		//there's more than just first item, but itemToAdd goes at head
		if(greaterThan(this.getItem(), itemToAdd)) {
				T temp = this.getItem(); 
				this.setItem(itemToAdd); 
				empItemToAdd.setItem(temp);				
				empItemToAdd.setNext(this.getNext());
				this.getNext().setPrevious(empItemToAdd);
				this.setNext(empItemToAdd);
				empItemToAdd.setPrevious(this);
				return;			
		}
		//find the right place
		boolean done = false;
		EmpItem currentEmpItem = this;
		T nextItem = null; 
		while(!done && currentEmpItem.getNext() != null) {
			nextItem = (T) currentEmpItem.getNext().getItem();
			if(greaterThan(nextItem, itemToAdd)) {
				currentEmpItem = currentEmpItem.getNext();
				done = true;
			} else {
				currentEmpItem = currentEmpItem.getNext();
			}	
		}
		//in the right place	
		if(currentEmpItem.getNext() != null  || greaterThan(nextItem, itemToAdd)) {
			//and before
			empItemToAdd.setPrevious(currentEmpItem.getPrevious());			
			currentEmpItem.getPrevious().setNext(empItemToAdd);
			currentEmpItem.setPrevious(empItemToAdd);
			empItemToAdd.setNext(currentEmpItem);
			return;
		} else {
			//its the end, at it there
			currentEmpItem.setNext(empItemToAdd);
			empItemToAdd.setPrevious(currentEmpItem);
			return;
		}			
	}
	
	private boolean greaterThan(T nextItem, T insertItem) {
		String nextString = (String) nextItem;
		String insertString = (String) insertItem;
		int compare = nextString.compareTo(insertString);
		if(compare < 0) {
			return false;
		} else {
			return true;
		}		
	}

/*	
	private boolean greaterThan(String nextItem, String insertItem) {
		int compare = nextString.compareTo(insertString);
		if(compare < 0) {
			return false;
		} else {
			return true;
		}		
	}
	
	private boolean greaterThan(int nextItem, int insertItem) {	
		if(nextItem < insertItem) {
			return false;
		} else {
			return true;
		}		
	}
	
*/

	
}
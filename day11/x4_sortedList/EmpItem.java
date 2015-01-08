public class EmpItem<T>  {

	private T item;
	private EmpItem next;
	private EmpItem previous;
	
	//constructor
	public EmpItem (T item) {
		this.item = item;
		this.next = null;
		this.previous = null;
	}
	// getters
	public T getItem() {
		return item;
	}
	public EmpItem getNext() {
		return next;
	}
	
	public EmpItem getPrevious() {
		return previous;
	}

	//setters
	public void setPrevious(EmpItem previous) {
		this.previous = previous;
	}	

	public void setNext(EmpItem next) {
		this.next = next;
	}	



	//add an EmpItem to list
	public void add(T itemToAdd) {
		System.out.println("THIS IS OVERWRITTEN SO DONT PRINT THIS - i hope/think");
		EmpItem empItemToAdd = new EmpItem(itemToAdd);
		if(this.next == null) {
			this.next = empItemToAdd;
			empItemToAdd.setPrevious(this); 
		} else {
			this.next.add(itemToAdd);
		}
	}
	
	//delete an EmpItem from list
	public boolean delete(T item) {	
		if(this.next == null) {
			//T to be removed was not found
			return false;
		} else if (this.next.item.equals(item)) {
			//we found it...it is the next one...	
			//now link this "T" to the one after the next
			this.next = this.next.next;
			this.next.previous = this;
			return true;
		} else {
			return this.next.delete(item);	
		}				
	}

	public void printForwards() {
		EmpItem currentEmpItem = this;
		currentEmpItem = this;
		System.out.println(" > " + currentEmpItem.getItem());
		if(this.next == null) {
			System.out.println("=== END ===");
		} else {	
			currentEmpItem = currentEmpItem.next;
			currentEmpItem.printForwards();
		}	 
	}	
	
	public void printBackwards() {
		EmpItem currentEmpItem = this;
		while(currentEmpItem.next != null) {
			currentEmpItem = currentEmpItem.next;
		}
		while(currentEmpItem.previous !=null) {
			System.out.println(" > " + currentEmpItem.getItem());
			currentEmpItem = currentEmpItem.previous;
		}
		System.out.println(" > " + currentEmpItem.getItem());		
		System.out.println("=== END ===");	
		
	}		
}
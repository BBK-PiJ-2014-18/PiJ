public class SortedEmpItem<T> extends EmpItem<T> {

	//constructor
	public SortedEmpItem (T item) {
		super(item);
	}

	//add an EmpItem to list
	@Override
	public void add(T itemToAdd) {
		SortedEmpItem empItemToAdd = new SortedEmpItem(itemToAdd);
		if(this.getNext() == null) {
			this.setNext(empItemToAdd);
			empItemToAdd.setPrevious(this); 
		} else {
			this.getNext().add(itemToAdd);
		}
	}
	
}
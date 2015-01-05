public class TreeIntSortedList implements IntSortedList {

	private int value;
	private TreeIntSortedList left;
	private TreeIntSortedList right;

	//constructor
	public TreeIntSortedList(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}	

	public void add(int newNumber) {

		TreeIntSortedList insertNode = new TreeIntSortedList(newNumber);
		if(newNumber < this.value) {
			if(this.left == null) {
				this.left = insertNode;
			} else {
				this.left.add(newNumber);
			}
		} else {
			if(this.right == null) {
				this.right = insertNode;
			} else {
				this.right.add(newNumber);
			}
		}					
	}

	
	public boolean contains(int checkNumber) {
		if(checkNumber == this.value) {
			return true;
		}	
		if(this.left != null) {
			return this.left.contains(checkNumber);
		}
		if(this.right != null) {
			return this.right.contains(checkNumber);
		}
		return false;
	}
	
	@Override
	public String toString() {
		String result = "";
		if(this.left != null) {
			result += this.left.toString();
		}
			result += this.value + ", ";
		if(this.right != null) {
			result += this.right.toString();
		}
		return result;
	}
}
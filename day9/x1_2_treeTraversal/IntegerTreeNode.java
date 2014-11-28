public class IntegerTreeNode {

	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;
	
	//constructor
	public IntegerTreeNode() {
		left = null;
		right = null;
	}	
	
	//setter
	public IntegerTreeNode (int value) {
		this.value = value;
	}
	
	public void add(int newNumber) {
		if(newNumber > this.value) {
			if (right == null) {	
				right = new IntegerTreeNode(newNumber);
			} else {
				right.add(newNumber);
			}		
		} else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			} else {
				left.add(newNumber);
			}	
		}
	}

	public boolean contains(int n) {
		if (n==this.value) {
			return true;
		} else if (n > this.value) {
			if (right == null) {
				return false;
			} else {
				return right.contains(n);
			}	
		} else {
			if (left == null) {
				return false;
			} else {
				return left.contains(n);
			}
		}								
	}
	
	public int getMax() {
		if (right == null) {
			return this.value;
		} else {
			return right.getMax();	
		}
	}

	public int getMin() {
		if (left == null) {
			return this.value;
		} else	{
			return left.getMin();
		}	
	}

	public String toAString() {
	
		String result;
		result = "";
		result = result + Integer.toString(this.value) + " ";
		
		if(this.left == null) {
			result = result + "L[]";
		} else {
			result = result + "L[" + this.left.toAString();
		}	
		if(this.right == null) {
			result = result + " R[]";
		} else {
			result = result + " R[" + this.right.toAString();
		}	
		result = result + "]";		
		return result;
	}
}
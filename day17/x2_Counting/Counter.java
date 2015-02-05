
// PROVIDED CODE

/* public class Counter {
	
	private int n = 0;
	
	public void increase() {
			n++;		
	}

	public int getCount() {
		return n;
	}			

}
*/
	
	// these changes ensures that n++ is atomic (?) 
	// & so always get to 100 X 1,000 = 100,000
	
public class Counter {	
	
	private Object obj = new Object();
	
	private int n = 0;
	
	public void increase() {

		synchronized (obj) {
			n++;
		}
	}
	
	public int getCount() {
		return n;
	}			
}


	// this works the same
	
/*	private int n = 0;
	
	public synchronized void increase() {
			n++;
	}
	
	public int getCount() {
		return n;
	}			
*/
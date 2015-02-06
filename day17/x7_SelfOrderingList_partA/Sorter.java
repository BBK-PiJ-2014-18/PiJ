public class Sorter implements Runnable { 

	private boolean sorted;
	private SelfSortingList ssl;
	
	private Object obj = new Object();
	
	public Sorter(SelfSortingList ssl) {
		sorted = false;
		this.ssl = ssl; 
	}	

	public void setSorted(boolean sorted) {
		sorted = sorted;
	}	

	@Override
	public void run() {
		synchronized(obj) {			
			while(!ssl.getStop()) {
				miniSort();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException ex) {
					// do nothing
				}
			} 
		}
	}
	
	public void miniSort() {
		System.out.print(".");
		boolean allInOrder = ssl.sort();

		if (allInOrder) {
			System.out.println("XXX");
			sorted = true;
		}	
	}
}
















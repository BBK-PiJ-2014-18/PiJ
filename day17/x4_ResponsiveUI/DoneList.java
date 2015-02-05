public class DoneList {

	private boolean[] doneArray;

	// only used by ResponsiveUI, so no need to protect from multiple tasks ???
	
	public DoneList() {
		doneArray = new boolean[10];
	}	

	// synchronized so two or more tasks can't bump in here ???
	
	public synchronized void setDone(int id) {
		doneArray[id] = true;
	}
	
	// only used by ResponsiveUI, so no need to protect from multiple tasks ???
		
	public boolean[] getDoneArray() {
		return doneArray;
	}
}
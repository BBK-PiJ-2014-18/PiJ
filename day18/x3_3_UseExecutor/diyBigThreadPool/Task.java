public class Task implements Runnable  {

	private int id;
	private int wait;
	private DoneList doneList;


	public Task (int id, int wait, DoneList doneList) {
		this.id = id;
		this.wait = wait;
		this.doneList = doneList;
	}

	public void run () {
		try {
			Thread.sleep(wait);
		} catch (InterruptedException ex) {
			// do nothing
		}
		doneList.setDone(id);		
	}	

	

}
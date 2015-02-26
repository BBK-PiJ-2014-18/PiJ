public class Task implements Runnable  {

	private int userID;
	private int taskID;
	private int wait;

	public Task (int userID, int taskID, int wait) {
		this.userID = userID;
		this.taskID = taskID;
		this.wait = wait;
	}

	public void run () {
		System.out.println("Start  > U " + userID + ", T " + taskID + ", W" + wait + ".");
		try {
			Thread.sleep(wait);
		} catch (InterruptedException ex) {
			// do nothing
		}
		System.out.println("-- End > U " + userID + ", T " + taskID + ", W" + wait + ".");

	}	

	

}
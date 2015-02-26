import java.util.concurrent.Executor;
	
public class User implements Runnable {	

	private SimpleExecutor me;
	private int userID;
	
	public User(SimpleExecutor me, int userID) {
		this.me = me;
		this.userID = userID;
	}	
	
	public void run() {
		Task task = null;
		for (int taskID = 0; taskID < 10 ; taskID++) {
			int wait = inputWait();
			task = new Task(userID, taskID, wait);
			synchronized (me) {			
				me.execute(task);
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public int inputWait() {
		return 2000;		
	}
	
}



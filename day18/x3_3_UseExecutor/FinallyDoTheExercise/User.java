import java.util.concurrent.Executor;
	
public class User {	

	private int userID;
	
	public User(int userID) {
		this.userID = userID;
		launch();
	}	
	
	public void launch() {
		Task task = null;
		SimpleExecutor me = new SimpleExecutorImpl();
		for (int taskID = 0; taskID < 10 ; taskID++) {
			int wait = inputWait();
			task = new Task(userID, taskID, wait);
			me.execute(task);
		}
	}
	
	public int inputWait() {
		return 2000;		
	}
	
}



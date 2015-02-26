public class Script {


	public static void main (String[] args) {
		Script s = new Script();
		s.launch();
	}


	private void launch() {
	
		SimpleExecutor me = new SimpleExecutorImpl();

			
		Runnable user1 = new User(me, 1);
		Thread t1 = new Thread(user1);
		t1.start();

		Runnable user2 = new User(me, 2);
		Thread t2 = new Thread(user2);
		t2.start();

	
	}


	
}
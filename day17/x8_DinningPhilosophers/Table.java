public class Table { 


	private Philosopher[] philosopher;
	private Fork[] fork;
	
	public Table(int size) {
		philosopher = new Philosopher[size];
		fork = new Fork[size];
		for (int i = 0; i < size; i++) {
			fork[i] = new Fork(i);
		}
		Fork leftFork, rightFork;
		for (int i = 0; i < size; i++) {
			if(i == 0) {
				rightFork = fork[size-1];
				leftFork = fork[i];
			} else {
				rightFork = fork[i-1];
				leftFork = fork[i];
			}			
			philosopher[i] = new Philosopher(i, leftFork, rightFork);
		}	
		for (int i = 0; i < size; i++) {
			Thread newThread = new Thread(philosopher[i]);
			newThread.start();
		}	
	}	
	
}

























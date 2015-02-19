public class Philosopher implements Runnable { 

	private int id;
	private Fork leftFork;
	private Fork rightFork;
	private int food;
	
	public Philosopher (int id, Fork leftFork, Fork rightFork) {
		this.id = id;
		this.leftFork = leftFork;
		this.rightFork = rightFork;
		food = 0;
	}	

	@Override
	public  void run() {
		for (int i = 0; i < 1000; i++) {
			synchronized(leftFork) {
				synchronized(rightFork) {
					food++;						
				}
			}				
			//had a mouth-full, both forks are put down
			//pause to allow others to pick up
			try {
				Thread.sleep(1);
			} catch (InterruptedException ex) {
				// do nothing
			}
		}
		System.out.println("  <-- P" + id + " ate " + food + ".  Full now.");
	}	
	
}

























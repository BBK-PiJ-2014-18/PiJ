import java.util.LinkedList;
import java.util.Queue;

public class TaskManager implements Runnable {

	private Queue<Runnable> taskQueue;
	private boolean running;


	public TaskManager() {
		this.taskQueue = new LinkedList<Runnable>();
		this.running = true;
	}	
	
	public void shutdown() {
		this.running = false;
	}
	
	
	// add is synchronized in example... notifies all when new task added
	public void add(Runnable task) {
	
		if(running) {
			this.taskQueue.offer(task);
		} else {
			throw new RuntimeException("Cannot add tasks to a stopped manager");
		}		
	}	
	
	public void run() {
	
		while(running) {
		
			while(!taskQueue.isEmpty()) {
				Runnable next = taskQueue.poll();
				
//				Thread t = new Thread(next);
//				t.start();
				
				next.run();
				
				// in example - wait here, synchronized (for when new task added)
			}
		}
		System.out.println("Task Manager thread finished");	
	}
}
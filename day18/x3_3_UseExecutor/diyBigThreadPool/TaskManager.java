import java.util.LinkedList;
import java.util.Queue;

public class TaskManager implements Runnable {

	private Queue<Runnable> taskQueue;
	private boolean running;
	public Thread[] threadPool;


	public TaskManager() {
		this.taskQueue = new LinkedList<Runnable>();
		this.running = true;
	}	
	
	public void shutdown() {
		this.running = false;
	}
	
	
	public void add(Runnable task) {
	
		if(running) {
			this.taskQueue.offer(task);
		} else {
			throw new RuntimeException("Cannot add tasks to a stopped manager");
		}		
	}	
	
	public void run() {
		threadPool = new Thread[10];

		int i = 0;
		while(running) {
			while(!taskQueue.isEmpty()) {
				Runnable next = taskQueue.poll();
				threadPool[i] = new Thread(next);
				threadPool[i].start();
				i++;	
			}
		}
		System.out.println("Task Manager thread finished");	
	}
}
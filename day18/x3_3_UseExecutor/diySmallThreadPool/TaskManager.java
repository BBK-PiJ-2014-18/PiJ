import java.util.LinkedList;
import java.util.Queue;

public class TaskManager implements Runnable {

	private static final int MAX_THREADS = 3;

	private Queue<Runnable> taskQueue;
	private boolean running;
	public Thread[] threadPool;


	public TaskManager() {
		this.taskQueue = new LinkedList<Runnable>();
		threadPool = new Thread[MAX_THREADS];
		for (int i = 0; i < MAX_THREADS; i++) {
			threadPool[i] = null;
		}	
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
		threadPool = new Thread[MAX_THREADS];
		while(running) {
			while(!taskQueue.isEmpty()) {
				int nextThreadAvailable = findAvailableThread();
				if(nextThreadAvailable != -1 && !taskQueue.isEmpty()) {
					Runnable next = taskQueue.poll();
					launchTask(next, nextThreadAvailable);
				}
			}	
		}
		System.out.println("Task Manager thread finished");	
	}
	
	private synchronized int findAvailableThread() {
		for (int i = 0; i < MAX_THREADS; i++) {
			if(threadPool[i] == null) {
				return i;
			}		
		}
		return -1;
	}
	
	private synchronized void launchTask(Runnable task, int id) {
		WrappedTask wrappedTask = new WrappedTask(task, id, threadPool);
		Thread t = new Thread(wrappedTask);
		this.threadPool[id] = t;
		t.start();
	}
	
	
	private class WrappedTask implements Runnable {

		private Runnable myTask;
		private int threadId;
		private Thread[] threadPool;
		
		public WrappedTask(Runnable task, int threadId, Thread[] threadPool) {
			this.myTask = task;
			this.threadId = threadId;
			this.threadPool = threadPool;
		}	
	
		@Override
		public void run() {		
			try {
				myTask.run();
			} catch ( Exception ex) {
				ex.printStackTrace();
			}		
			threadPool[threadId] = null;
		}	
	}
}
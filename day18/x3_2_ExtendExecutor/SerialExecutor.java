import java.util.concurrent.Executor;
import java.util.ArrayDeque;
import java.util.Queue;


public class SerialExecutor implements Executor { 

	protected final Queue<Runnable> tasks = new ArrayDeque<Runnable>();
	private final Executor executor;
	private Runnable active;

	public SerialExecutor(Executor executor) {
		this.executor = executor;
	}

	public synchronized void execute(Runnable r) {
		tasks.offer(new Runnable() {
			public void run() {
				try {
					r.run();
				} finally {
					scheduleNext();
				}		
			}
		});	
		if (active == null) {
			scheduleNext();
		}	
	}	
	
	protected synchronized void scheduleNext() {
		active = tasks.poll();
		if(active != null) {
			executor.execute(active);
		}
	}	
}



import java.util.concurrent.Executor;
import java.util.ArrayDeque;
import java.util.Queue;
/*
Here is how it works. Let's say that SubmitterThread passes in Runnables R1, R2, R3 and R4, one after the other. When R1 is passed in, it is wrapped with a new Runnable that will call the R1.run() method and then allow the next Runnable in the tasks queue to be executed. Let's call the new Runnable R1*. Since there is no other Runnable currently active (thus active==null), the SubmitterThread also calls scheduleNext(), which pulls R1* out of the queue and submits it to the wrapped Executor. The SubmitterThread can now call execute() with R2, R3 and R4, which will wrap these Runnables also with our special Runnable and submit them to our tasks queue.

Inside R1*, once R1 is completed, the scheduleNext() method is invoked. This will pull R2* from the tasks list and submit it to the wrapped Executor. This will continue until R4*, which will call scheduleNext(), but that will simply set active to null.
*/

public class SerialExecutor implements Executor { 

	private final Queue<Runnable> tasks = new ArrayDeque<Runnable>();
	private final Executor executor;
	private Runnable active;

	public SerialExecutor(Executor executor) {
		this.executor = executor;
	}


	public synchronized void execute(Runnable r) {
		//R1 added to the queue in a wrapper with a run() method that calls R1.run and 		
		//once done calls scheduleNext() - which executes the next wrapped runnable.
		tasks.offer(new Runnable() {
			public void run() {
				try {
					System.out.println("r.run();");
					r.run();
				} finally {
					System.out.println("finally scheduleNext();");
					scheduleNext();
				}		
			}
		});	
		//as nothing active run the first one
		if (active == null) {
			System.out.println("active == null, scheduleNext();");
			scheduleNext();
		}	
	}	
	
	protected synchronized void scheduleNext() {
		active = tasks.poll();
		// if it was the end of the queue, active would be set to null
		if(active != null) {
			executor.execute(active);
		}
	}	
}



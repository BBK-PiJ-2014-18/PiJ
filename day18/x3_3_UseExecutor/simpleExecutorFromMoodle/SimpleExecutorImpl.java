import java.util.concurrent.Executor;

/**
 * An implementation of {@see SimpleExecutor}.
 */
public class SimpleExecutorImpl implements SimpleExecutor {
    private TaskManager manager;

    /** 
     * Creates a new executor.
     */
    public SimpleExecutorImpl() {
	  this.manager = new TaskManager();
	  Thread t = new Thread(manager);
	  t.start();
    }

    @Override
    public void execute(Runnable task) {
	  this.manager.add(task);
    }

    @Override
    public void shutdown() {
	  this.manager.shutdown();
    }
}
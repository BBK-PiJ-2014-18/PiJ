import java.util.concurrent.Executor;
import java.util.ArrayDeque;
import java.util.Queue;

public class MarkSerialExecutor extends SerialExecutor implements Executor { 

	public MarkSerialExecutor(Executor executor) {
		super(executor);
	}

	public int getMaxPendingTime() {	
		return tasks.size() * 1000;
	}
}



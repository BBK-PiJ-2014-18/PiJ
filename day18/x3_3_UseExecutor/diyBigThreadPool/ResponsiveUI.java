import java.util.concurrent.Executor;
	
public class ResponsiveUI {	

	private int countDone = 0;
	
	public static void main (String[] args) {
		ResponsiveUI rui = new ResponsiveUI();
		rui.launch();
	}
	
	public void launch() {
		DoneList doneList = new DoneList();
		Task task = null;
		SimpleExecutor me = new SimpleExecutorImpl();
		for (int id = 0; id < 10 ; id++) {
			int wait = inputWait(id);
			task = new Task(id, wait, doneList);
			me.execute(task);
			printDone(doneList);
		}
		//pick up tasks ending after all 10 durations have been entered. 
		while(countDone < 10) {
			printDone(doneList);
		}
		me.shutdown();
	}
	
	public int inputWait(int id) {
		System.out.print("Enter duration of task (in seconds) " + id + " : ");
		return 1000 * Integer.parseInt(System.console().readLine());
	}
	
	public void printDone(DoneList doneList) {
		boolean[] done = doneList.getDoneArray();
		String result = "";
		for (int i = 0; i < 10; i++) {
			if(done[i] == true) {
				countDone++;
				result = result + " " + i;
				done[i] = false;		
			}	
		}
		if(!result.equals("")) {
			System.out.println("Finished Tasks:" + result);
		}
	}
}



import java.io.File;

public class Ls {

	public static void main(String[] args) {
		Ls ls = new Ls();
		ls.launch();
	}

	public void launch() {
		File dir = new File(".");
		String[] outputArray = dir.list();
		for (int i = 0; i < outputArray.length; i++) {
			System.out.println("> " + outputArray[i]);
		}
	}
}
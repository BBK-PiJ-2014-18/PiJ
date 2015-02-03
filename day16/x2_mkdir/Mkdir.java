import java.io.File;

public class Mkdir {

	public static void main(String[] args) {
		Mkdir d = new Mkdir();
		d.launch(args[0]);
	}

	public void launch(String name) {
		File f = new File(name);
		f.mkdir();
	}
}
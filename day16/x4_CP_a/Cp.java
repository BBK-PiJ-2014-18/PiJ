import java.io.*;

public class Cp {

	public static void main(String[] args) {
		Cp c = new Cp();
		c.launch(args[0], args[1]);
	}

	public void launch(String fromFile, String toFile) {
		File aFile = new File(fromFile);
		File bFile = new File(toFile);

		if(bFile.exists()) {
			System.out.println("Do you want to overwrite " + bFile + "? y/n");
			String str = System.console().readLine();
			if (str.equals("n")) {
				System.out.println("File not copied");
				return;
			}
		}	
		PrintWriter out = null;
		BufferedReader in = null;
		try {
			out = new PrintWriter(bFile);
			in = new BufferedReader(new FileReader(aFile));
			String line;
			while ((line = in.readLine()) != null) {
				out.println(line);
			}
		} catch (FileNotFoundException ex) {
			System.out.println("File " + aFile + " does not exist");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			closeReader(in);
			out.close();
		}										
	}
	
	private void closeReader(Reader reader) {
		try {
			if (reader != null) {
				reader.close();
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}		
}
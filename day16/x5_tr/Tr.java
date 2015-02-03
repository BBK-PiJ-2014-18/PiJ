import java.io.*;

public class Tr {

	public static void main(String[] args) {
		Tr tr = new Tr();
		tr.launch(args[0], args[1], args[2]);
	}

	public void launch(String fileName, String first, String second) {
		File file = new File(fileName);
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(file));
			String line;
			while ((line = in.readLine()) != null) {
				System.out.println(line.replace(first, second));
			}
			in.close();
		} catch (FileNotFoundException ex) {
			System.out.println("File " + file + " does not exist");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			closeReader(in);
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
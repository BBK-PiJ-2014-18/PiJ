import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {
		Sort s = new Sort();
		s.launch(args[0]);
	}

	public void launch(String fileName) {
		File file = new File(fileName);
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(file));
			String line;
			ArrayList<String> lineArray= new ArrayList<String>();
			while ((line = in.readLine()) != null) {				
				lineArray.add(line);
				System.out.println(line);
			}
			System.out.println();
			Collections.sort(lineArray);
			for (int i = 0; i < lineArray.size(); i++) {
				System.out.println(i + " " +lineArray.get(i));
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
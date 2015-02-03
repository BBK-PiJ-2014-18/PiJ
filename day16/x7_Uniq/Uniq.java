import java.io.*;
import java.util.LinkedHashSet;
import java.util.Iterator;


public class Uniq {

	public static void main(String[] args) {
		Uniq u = new Uniq();
		u.launch(args[0]);
	}

	public void launch(String fileName) {
		File file = new File(fileName);
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(file));
			String line;
			LinkedHashSet<String> lineSet = new LinkedHashSet<String>();
			while ((line = in.readLine()) != null) {				
				lineSet.add(line);
				System.out.println(line);
			}
			printUnique(lineSet);
			in.close();
		} catch (FileNotFoundException ex) {
			System.out.println("File " + file + " does not exist");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			closeReader(in);
		}			
	}

	private void printUnique(LinkedHashSet lineSet) {
			System.out.println();
			Iterator itr = lineSet.iterator();
			while (itr.hasNext()){
				System.out.println(itr.next());
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
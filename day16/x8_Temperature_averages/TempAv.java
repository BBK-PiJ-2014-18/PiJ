import java.io.*;

public class TempAv {

	public static void main(String[] args) {
		TempAv ta = new TempAv();
		ta.launch(args[0]);
	}

	public void launch(String fileName) {
		File file = new File(fileName);
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(file));
			String line;
			int fileTotal = 0;
			int fileCount = 0;
			while ((line = in.readLine()) != null) {				
				String[] strArray = line.split(", ");
				System.out.println(line);
				int lineTotal = 0;
				for (int i = 0; i < strArray.length; i++) {
					lineTotal = lineTotal + Integer.parseInt(strArray[i]);
				}
				System.out.println("Line Average: " + lineTotal/strArray.length);
				fileTotal = fileTotal + lineTotal;
				fileCount = fileCount + strArray.length;			
			}
			System.out.println("=================");
			System.out.println("File average: " + fileTotal/fileCount);
			System.out.println("=================");
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
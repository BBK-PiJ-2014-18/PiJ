import java.io.*;

public class Cp {

	public static void main(String[] args) {
		Cp c = new Cp();
		c.launch(args);
	}

	public void launch(String[] args) {
		int fileCount = 0;
		for (int i = 0; i < args.length - 1; i++) {
			File file = new File(args[i]);
			if (file.exists()) {
				fileCount++;
			} else {
				System.out.println("File " + file + " does not exist");
			}		
		}
		File[] fileList;
		fileList = new File[fileCount];
		for (int i = 0; i < args.length - 1; i++) {	
			File file = new File(args[i]);
			if(file.exists()) {
				fileList[i] = file;
			}
		}
		File dir = new File(args[args.length-1]);
		if(!dir.isDirectory()){
			System.out.println("> " + dir + " is not a directory");
			return;
		}
		for (int i = 0; i < fileList.length; i++) {		
			String str = dir + "/" + fileList[i];
			File newFile = new File(str);
			copy(fileList[i], newFile);
		}
	}
	
	public void copy(File aFile, File bFile) {
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
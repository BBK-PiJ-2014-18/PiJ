import java.io.*;


public class BinaryCP {

	public static void main(String[] args) {
		BinaryCP bcp = new BinaryCP();
		bcp.launch(args[0], args[1]);
	}

	
	public void launch(String aName, String bName) {
		File aFile = new File(aName);
		File bFile = new File(bName);

		if(bFile.exists()) {
			System.out.println("Do you want to overwrite " + bFile + "? y/n");
			String str = System.console().readLine();
			if (str.equals("n")) {
				System.out.println("File not copied");
				return;
			}
		}	
		OutputStream out = null;
		InputStream in = null;
		try {
			out = new FileOutputStream(bFile);
			in = new FileInputStream(aFile);
			int size = in.available();
			System.out.println(size + " bytes");
			byte[] data = new byte[size];
			int readBytes;
			while ((readBytes = in.read(data)) != -1) {			
				out.write(data, 0, size);
			}		
		} catch (FileNotFoundException ex) {
			System.out.println("File " + aFile + " does not exist");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			closeInputStream(in);
			closeOutputStream(out);
			
		}										
	}

	private void closeInputStream(InputStream stream) {
		try {
			if (stream != null) {
				stream.close();
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}		
	
	private void closeOutputStream(OutputStream stream) {
		try {
			if (stream != null) {
				stream.close();
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
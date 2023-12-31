package learningjavabook.chapter11;

import java.io.*;

public class ListIt {
	public static void main(String[] args) {
		// Return early if no arguments is passed...
		if (args.length == 0) {
			System.out.println("No file was provided as an argument");
			return;
		}

		File file = new File(args[0]);

		// Return early if file does not exist
		if (!file.exists()) {
			System.err.println("File does not exist: " + file);
		}
		// Return early if file is not readable for whatever reason
		if (!file.exists() || !file.canRead()) {
			System.err.println("Can't read file: " + file);
			return;
		}

		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f: files) {
				System.out.println(f);
			}
		} else {
			try {
				Reader inputStreamReader = new InputStreamReader(new FileInputStream(file));
				BufferedReader in = new BufferedReader(inputStreamReader);
				String line;
				while ((line = in.readLine()) != null) {
					System.out.println(line);
				}
			} catch(IOException e) {
				System.err.println("File error:" + e);
			}
		}
	}
}

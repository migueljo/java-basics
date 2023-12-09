package learningjavabook.chapter11;

import java.io.*;

public class ListIt {
	public static void main(String[] args) {
		// Return early if no arguments is passed...
		if (args.length == 0) {
			return;
		}

		File file = new File(args[0]);

		if (!file.exists() || !file.canRead()) {
			System.err.println("Can't read" + file);
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

package learningjavabook.chapter11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileStreams {
	public static void main(String[] args) {
		try {
			FileInputStream in = new FileInputStream("/tmp/passwd");
		} catch(FileNotFoundException exception) {
			System.err.println(exception);
		}
	}
}

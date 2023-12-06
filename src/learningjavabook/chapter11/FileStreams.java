package learningjavabook.chapter11;

import java.io.FileInputStream;
import java.io.IOException;

public class FileStreams {
	public static void main(String[] args) {
		// This try block is called try-with-resources
		try (FileInputStream fileInputStream = new FileInputStream("/tmp/passwd")) {
			System.out.println(fileInputStream);
		} catch(IOException exception) {
			System.err.println(exception);
		}
	}
}

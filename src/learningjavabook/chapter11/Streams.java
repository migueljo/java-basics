package learningjavabook.chapter11;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Streams {
	public static void main(String[] args) {
		basicIO();
	}

	static void basicIO() {
		InputStream stdin = System.in;
		OutputStream stdout = System.out;
		OutputStream stderr = System.err;

		try {
			int current;
			StringBuilder val = new StringBuilder();
			while((current = System.in.read()) != -1) {
				System.out.println("Current:" + (byte) current);
				val.append(",").append(current);
			}
			System.out.println("Byte:" + val);
		} catch(IOException e) {
			System.err.println(e);
		}
	}
}

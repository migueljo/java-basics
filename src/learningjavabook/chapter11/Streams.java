package learningjavabook.chapter11;

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
	}
}

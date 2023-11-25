package learningjavabook.chapter11;

import java.io.*;
import java.text.NumberFormat;
import java.text.ParseException;

public class Streams {
	public static void main(String[] args) {
		// basicIO();
		example1();
	}

	static void example1() {
		try {
			InputStream in = System.in;
			InputStreamReader charsIn = new InputStreamReader(in);
			BufferedReader bufferedCharsIn = new BufferedReader(charsIn);
			String line = bufferedCharsIn.readLine();
			int i = NumberFormat.getInstance().parse(line).intValue();
			System.out.println("Int value: " + i);
		} catch(IOException e) {
			System.out.println(e);
		} catch(ParseException pe) {
			System.out.println(pe);
		}
	}

	static void basicIO() {
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

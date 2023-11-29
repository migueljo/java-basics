package learningjavabook.chapter11;

import java.io.*;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;

public class Streams {
	public static void main(String[] args) {
		// basicIO();
		// example1();
		// dataStreams();
		// fileConstructors();
		fileOperations();
	}

	static void fileOperations() {
		File fooFile = new File("/tmp", "foo.txt");
		String fileType = fooFile.isFile() ? "File" : "Directory ";
		String name = fooFile.getName();
		long length = fooFile.length();
		System.out.println( fileType + name + ", " + length + " bytes " );
	}

	static void fileConstructors() {
		File fooFile = new File("/tmp/foo.txt");
		File barFile = new File("/tmp/bar");
		File fooFileRelative = new File("foo.txt");
		File fooFile2 = new File("/tmp", "foo.txt");
		File tmpDir = new File("/tmp");
		File fooFile3 = new File(tmpDir, "/foo.txt");
		System.out.println("Current working directory" + System.getProperty("user.dir"));

		String path = "mail/2004/june/merle";
		path = path.replace('/', File.separatorChar);
		File mailbox = new File(path);
		System.out.println("Mailbox path: " + mailbox);

		String[] path2 = { "mail", "2004", "june", "merle" };
		StringBuffer sb = new StringBuffer(path2[0]);
		for (int i = 1; i < path2.length; i++) {
			sb.append(File.separator).append(path2[i]);
		}
		File mailbox2 = new File(sb.toString());
		System.out.println("Mailbox 2: " + sb.toString());

		System.out.println("Roots: " + Arrays.toString(File.listRoots()));

	}

	static void dataStreams() {
		try {
			DataInputStream dis = new DataInputStream( System.in );
			double d = dis.readDouble();
			System.out.println("Double value:" + d);
		} catch (IOException ioe) {
			System.out.println("IOException" + ioe);
		}
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
			System.out.println("IO Exception:" + e);
		} catch(ParseException pe) {
			System.out.println("Parse Exception:" + pe);
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

package learningjavabook.chapter11.nio;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class NIOApi {
	public static void main(String[] args) {
		fileSystemAndPath();
	}

	static void fileSystemAndPath() {
		try {
			FileSystem fs = FileSystems.getDefault();
			Map<String, String> props = new HashMap<>();
			URI zipUri = URI.create("jar:file:/Users/mmartinez/tmp/MyArchive.zip");
			FileSystem zipfs = FileSystems.newFileSystem(zipUri, props);
			Path fooPath = fs.getPath("/tmp/foo.txt");
			OutputStream out = Files.newOutputStream(fooPath);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}

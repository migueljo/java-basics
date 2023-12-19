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
			/*
			Map<String, String> props = new HashMap<>();
			URI zipUri = URI.create("jar:file:/Users/mmartinez/tmp/MyArchive.zip");
			FileSystem zipfs = FileSystems.newFileSystem(zipUri, props);
			Path fooPath = fs.getPath("/tmp/foo.txt");
			OutputStream out = Files.newOutputStream(fooPath);
			*/

			Path miguelPath = fs.getPath("/Users/mmartinez");
			Path miguelTmp = miguelPath.resolve("tmp");
			System.out.println("Miguel tmp: " + miguelTmp);

			Path absPath = miguelPath.resolve("/tmp");
			System.out.println("Absolute path: " + absPath);

			Path siblingPath = miguelPath.resolveSibling("andres");
			System.out.println("Sibling path: " + siblingPath);
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}

package learningjavabook.chapter6;

import java.util.logging.Logger;

public class Logs {
	static Logger log = Logger.getLogger("learningjavabook.chapter6");
	public static void main(String[] args) {
		log.info("Hello from Logs.java");
		log.info("Hello from Logs.java 2");
		log.warning("Showing warning");
	}
}

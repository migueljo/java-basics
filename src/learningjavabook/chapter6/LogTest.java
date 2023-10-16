package learningjavabook.chapter6;

import java.util.logging.Logger;

public class LogTest {
	static Logger logger = Logger.getLogger("learningjavabook.chapter6.LogTest");

	public static void main(String[] args) {
		logger.severe("Power lost - running on backup!");
		logger.warning("Database connection lost, retrying...");
		logger.info("Startup complete.");
		logger.config("Server configuration: standalone, JVM version 1.5");
		logger.fine("Loading graphing package.");
		logger.finer("Doing pie chart");
		logger.finest("Starting bubble sort: value = " + 42);
	}
}

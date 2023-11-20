package learningjavabook.chapter9;

import java.util.LinkedList;

public class URLQueue {
	LinkedList<String> urlQueue = new LinkedList<>();
	public synchronized void addUrl(String url) {
		urlQueue.add(url);
	}
}

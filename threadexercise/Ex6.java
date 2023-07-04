package threadexercise;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex6 implements Runnable {

	private final String url;
	
	public Ex6(String url) {
		//super();
		this.url = url;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Crawling: "+url);
			String content = fetchWebPage(url);
			processWebPage(content);
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Failed to crawl: "+url);
			e.printStackTrace();
		}
	}

	private String fetchWebPage(String url) throws IOException {
		// TODO Auto-generated method stub
		return "Web page content for: "+url;
	}
	
	private void processWebPage(String content) {
		System.out.println("Processing Web Page: "+url);
		System.out.println(content);
	}
	public static void main(String[] args) throws InterruptedException {
		String[] urls = {"https://www.google.com"};
		
		ExecutorService executorService = Executors.newFixedThreadPool(urls.length);
		Set<Ex6> webCrawlers = new HashSet<>();
		
		for(String url : urls) {
			Ex6 e = new Ex6(url);
			executorService.submit(e);
			webCrawlers.add(e);
		}
		executorService.shutdown();
		executorService.awaitTermination(1, TimeUnit.MINUTES);
		
		System.out.println("Crawled URLs: ");
		for(Ex6 e : webCrawlers) {			
			System.out.println(e.url);
		}
	}
}



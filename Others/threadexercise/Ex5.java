package threadexercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class Ex5 implements Runnable{

	private final long start;
	private final long end;
	private final AtomicLong sum;
	
	public Ex5(long start, long end, AtomicLong sum) {
		super();
		this.start = start;
		this.end = end;
		this.sum = sum;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		long segmentSum = 0;
		for(long number = start; number <= end; number++) {
			if(isPrime(number)) {
				segmentSum += number;
			}
		}
		sum.addAndGet(segmentSum);
	}

	private boolean isPrime(long number) {
		// TODO Auto-generated method stub
		if(number <= 1) {
			return false;	
		}
		for(long i = 2; i <= Math.sqrt(number); i++) {
			if(number % i == 0) {
				return false;
			}
	}
	return true;
}	
	public static void main(String[] args) throws InterruptedException {
		long limit = 1000;
		int numThreads = 4;
		
		
		ExecutorService executorService = Executors.newFixedThreadPool(numThreads);
		AtomicLong sum = new AtomicLong(0);
		
		long segmentSize = limit/numThreads;
		long start = 1;
		long end = segmentSize;
		
		for(int i = 0; i<numThreads; i++) {
			if(i==numThreads - 1) {
				end = limit;
			}
			Ex5 calculator = new Ex5(start, end, sum);
			executorService.submit(calculator);
			
			start = end + 1;
			end += segmentSize;
		}
		
		executorService.shutdown();
		executorService.awaitTermination(1, TimeUnit.MINUTES);
		
		System.out.println("Sum of prime numbers up to "+ limit + " : " +sum.get());
	}
}


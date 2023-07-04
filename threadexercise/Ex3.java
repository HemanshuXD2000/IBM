package threadexercise;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class Ex3 extends RecursiveAction {

	private final int[] array;
	private final int start;
	private final int end;
	
	public Ex3(int[] array, int start, int end) {
		super();
		this.array = array;
		this.start = start;
		this.end = end;
	}

	@Override
	protected void compute() {
		// TODO Auto-generated method stub
		if(start<end) {
			int mid = (start+end)/2;
			Ex3 leftSort = new Ex3(array, start, mid);
			Ex3 rightSort = new Ex3(array, mid+1, end);
			invokeAll(leftSort,rightSort);
			merge(mid);
		}
	}

	private void merge(int mid) {
		// TODO Auto-generated method stub
		int[] left = Arrays.copyOfRange(array, start, mid+1);
		int[] right = Arrays.copyOfRange(array, mid+1, end+1);
		int i=0, j=0, k=start;
		
		while(i<left.length && j<right.length) {
			if(left[i] <= right[j]) {
				array[k] = left[i];
				i++;
			}
			else {
				array[k] = right[j];
				j++;
			}
			k++;
		}
		while (i<left.length) {
			array[k] = left[i];
			i++;
			k++;
		}
		while (j<right.length) {
			array[k] = right[j];
			j++;
			k++;
		}
		
	}
	
	public static void main(String[] args) {
		int[] array = {5,2,9,1,3,7,6,8,4};
		System.out.println("Original Array: " +Arrays.toString(array));
		
		Ex3 mergeSort = new Ex3(array, 0, array.length-1);
		ForkJoinPool pool = ForkJoinPool.commonPool();
		pool.invoke(mergeSort);
		
		System.out.println("\nSorted Array: "+Arrays.toString(array))	;
	}
}

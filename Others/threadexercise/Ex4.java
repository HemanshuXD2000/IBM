package threadexercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex4 implements Runnable {

	private final int[][] matrixA;
	private final int [][] matrixB;
	private final int[][] result;
	private final int row;
	private final int column;
	
	
	public Ex4(int[][] matrixA, int[][] matrixB, int[][] result, int row, int column) {
		super();
		this.matrixA = matrixA;
		this.matrixB = matrixB;
		this.result = result;
		this.row = row;
		this.column = column;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i =0; i<matrixA[row].length; i++) {
			sum += matrixA[row][i]*matrixB[i][column];
		}
		result[row][column] = sum;
	}
	
	public static void main(String[] args) throws InterruptedException {
		int[][] matrixA = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] matrixB = {{9,8,7},{6,5,4},{3,2,1}};
		int[][] result = new int[matrixA.length][matrixB[0].length];
		
		System.out.println("Matrix A: ");
		printMatrix(matrixA);
		
		System.out.println("Matrix B:");
	    printMatrix(matrixB);
	     
	     System.out.println("Matrix Multiplication Result: ");
	     
	     ExecutorService executorService = Executors.newFixedThreadPool(matrixA.length);
	     
	     for(int i = 0;i<matrixA.length; i++) {
	    	 for(int j=0;j<matrixB[0].length; j++) {
	    		 executorService.submit(new Ex4(matrixA, matrixB, result, i, j));
	    	 }
	     }
	     executorService.shutdown();
	     executorService.awaitTermination(1, TimeUnit.MINUTES);
	     
	     printMatrix(result);
	}


	private static void printMatrix(int[][] matrix) {
		// TODO Auto-generated method stub
		for(int[] row : matrix)
		{
			for(int num : row) {
				System.out.println(num + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}

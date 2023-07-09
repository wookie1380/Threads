package threadUI;

import java.util.Random;

public class Threads {
	
	public static void main(String[] args) {
		
		// get time to complete
		// Random number generator 1 - 10
		// 200 million entries into an array, of random number generator
		Random random = new Random();
		
		// Create array 
		int[][] arrays = new int[200000000][];
				
		
		// start time
		long start = System.nanoTime();
		
		
		// Create adder w/ output into array
		// 200 million entries
		for (int i=0; i<200000000; i++) {
			int[] array1 = new int[10];
			for (int j = 0; j < 10; j++) {
				array1[j] = random.nextInt(10) + 1;
			}
			arrays[i] = array1;
		}
		
		
		// stop time and display difference
		long end = System.nanoTime();
		long totTime = end - start;
		System.out.println("Total time to completion is: " + totTime);
		
		
	}
}
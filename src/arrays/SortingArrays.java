package arrays;

import java.util.Arrays;

public class SortingArrays {

	public static void main(String[] args) {
		
		int[] numbers= {99, 12,2434,9978,1,55,876};
		
		System.out.println(numbers); // Memorideki karsiliklarini veriyor. Hash method
		
		System.out.println(Arrays.toString(numbers)); // Arrayi print etmek istedigimizde boyle yapiyoruz.
		
		Arrays.sort(numbers);
		
		System.out.println(Arrays.toString(numbers));  // Java daki hazir bir prog. kullaniyor sorting yani siraya koyma.. 
		
		System.out.println (Arrays.binarySearch(numbers,99) + " is index of 99 "); // binary search yaptik.
		
		System.out.println(Arrays.binarySearch(numbers, 54) + "is index of 54");
		

	}

}

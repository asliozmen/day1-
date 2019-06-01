package arrays;

public class ArrrFindTheMissindNumber {

	public static void main(String[] args) {
		
		int [] numbers = {1,2,3,5,6,7,8,9};
		//write the code to find the missing number from the array.
		// to find the sum of the N number. Formula is sum= (N*(N+1)/2); here N = 9
		
		int sum = (numbers.length+1)*(numbers.length+2)/2;   // int N=numbers.length+1;
		                                                     // 
		int actualsum=0; 
		for (int i=0; i<numbers.length; i++) {
		   
         actualsum += numbers[i];
	}
        System.out.println(sum-actualsum);
        
        
}
	}

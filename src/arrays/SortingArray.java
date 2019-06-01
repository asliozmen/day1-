package arrays;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		
		int [] sortNumber = {9,8,6,4,5,7,3,1};
		
		 // sort an array without using Array.sort(); Birinciyi alip hepsiyle karsilastirmak istyr.
		
		for (int i=0 ; i< sortNumber.length; i++) { // this is first loop bu bir numara icin ilerlerken
			                                          // alttaki hepsini dolanmakta.
			
			
		   for (int k=i+1; k<sortNumber.length; k++) {
			   
			   int temp=0;
			   
			    if (sortNumber[i]> sortNumber[k]) {
			    	
			    	temp=sortNumber[i];   // temp=9
			    	
			    	sortNumber[i]= sortNumber[k]; //{8,8,6,4,5,7,3,1}
			    	
			    	sortNumber[k]= temp;          //{8,9,6,4,5,7,3,1}
			    	
			    	}
		   }
		}
		System.out.print(Arrays.toString(sortNumber));
      
		
	}

}

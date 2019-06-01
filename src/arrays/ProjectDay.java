package arrays;

import java.util.Arrays;

public class ProjectDay {

	public static void main(String[] args) {//duplicate olmadan cikarmaya calisiyorum.
		int[]numbers = {1,8,6,8,9,6,9};
		
		Arrays.sort(numbers);
		
		System.out.println(Arrays.toString(numbers)); // siraya koydum.
		
		for (int i=0; i<numbers.length; i++) {
		
		 for (int k=i+1; k<numbers.length; k++){
     
		 if (numbers[i]== numbers[k]) {
			 System.out.println(numbers[i]); //hangilerinin tekrar ettigini buldum.
			                                 // 
			 }
		 int temp=0;
		   
		    if (numbers[i]==numbers[k]) {
		    	
		    	temp=numbers[i];   
		    	
		    	numbers[i]= numbers[k];
		    	
		    	numbers[k]= temp; 
		    }
		 }
	}

}}

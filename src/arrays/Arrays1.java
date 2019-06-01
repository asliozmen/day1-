package arrays;

import java.util.Arrays;
import java.util.List;

public class Arrays1 {

	public static void main(String[] args) {
		
		int [ ] numbers = new int [3];
		numbers[0]= 5;
		numbers[1]=10;
		numbers[2]=20;
		
		System.out.println(numbers[1]);
		System.out.println(Arrays.toString(numbers));
		  
		int[] number= new int[5];
		number[0]= 3;
		number[1]=8;
		number[2]=10;
		number[3]=15;

		System.out.println(Arrays.toString(number));
		
		String[] child= {"Vehbi","Meryem","Fatih","Irfan"};
		
		List myChild= Arrays.asList(child);
		
		System.out.println(myChild);
	}

}

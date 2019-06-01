package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task1 { // Write a static method that will accept Integer ArrayList as a parameter and
	//will return arrayList. This method  will return ordered ArrayList with missing numbers 
	//between 0 and max number that ArrayList has.
	
	//For example: [2,4,6,9,10]---->[0,1,3,5,7,8]
	// [-5,5,6,7]--------> [0,1,2,3,4]

	
	public static ArrayList<Integer> methods(List<Integer>nums){
		
		Collections.sort(nums);
		Integer maxNum= nums.get(nums.size()-1);  //.get indexini verdigimizi get diyoruz.
		
		ArrayList<Integer>missingNumbers=new ArrayList<>(); //bos bir arraylist olusturuyoruz.
		for(int i=0; i<maxNum ; i++) {
			if(nums.contains(i)) {     // nums is a arraylist
		}else {
			missingNumbers.add(i);
		}
	}
		return missingNumbers;
	}
		public static void main(String[] args){ 
		// array den arrayList e nasil ceviriyoruz.? ---> asList ile 
		// neden arrayden arrayliste ceviriyoruz? cunku (2,5,6 ) gibi array seklinde kolay yaziyoz.
		// yoksa listelemek icin add. diyip tek tek yazmak gerekirdi.
			List<Integer> num1= Arrays.asList(2,5,8,-10);
			
			System.out.println(methods(num1));
		}
		
		
}

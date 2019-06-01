package arrays;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		// Soru: Create one multidimensional array of grocery items. Indexes are 3 and 3. For the first array give the value of apple,
		// banana , strawberry. Second array give the value of bread, cheese, lettuce.
		
		String [][] grocery= new String [2][3];  
		
		grocery[0][0]="Apple";
		grocery[0][1]="Banana";
		grocery[0][2]="Strawberry";
		grocery[1][0]="Bread";
		grocery[1][1]="Cheese";
		grocery[1][2]="Lettuce";
		
		String [][] grocery1= {{"Apple", "Banana","Strawberry"}, {"Bread","Cheese","Lettuce"}};
		
		System.out.println(Arrays.toString(grocery[0]));
		System.out.println(Arrays.toString(grocery[1]));
		
//		for (int i=0; i<grocery.length; i++) {
//			for()
//		}
		
		

	}

}

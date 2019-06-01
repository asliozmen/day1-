package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
	
		Integer[] numbers = new Integer[] {2,8,4,1,0};
		System.out.println(Arrays.toString(numbers));
	//	Arrays.sort(numbers);
	//	System.out.println(Arrays.toString(numbers));

		List<Integer>numbers2= Arrays.asList(numbers); 
		System.out.println(numbers2);
		Collections.sort(numbers2);
		System.out.println(numbers2);
		
		System.out.println(Collections.binarySearch(numbers2, 4));
		
		ArrayList<String>words=new ArrayList<>();
		words.add("phone");
		words.add("computer");
		words.add("laptop");
		words.add("watch");
		System.out.println(words);
		Collections.sort(words);
		System.out.println(words);
		System.out.println(Collections.binarySearch(words, "keyboard"));
		System.out.println(Collections.binarySearch(words,"apple"));
		
		
		ArrayList words2= new ArrayList();
		words2.add("morning");
		words2.add("afternoon");
		words2.add("evening");
		words2.add(3);
		words2.add(7);
		words2.add(true);
		words2.add(false);
		Collections.sort(words2);
		System.out.println(words2); // Farkli cinslerde sorting olmuyor. Throwing exp.
		
		
		
		
		
		
		
		
		
		
	}

}

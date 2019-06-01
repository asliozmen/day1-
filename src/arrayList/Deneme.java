package arrayList;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class Deneme {

	public static void main(String[] args) {
		Integer[] numbers1= new Integer[] {7,4,9,12,0};
		System.out.println(Arrays.toString(numbers1));
		//Arrays.sort(numbers1);
		//System.out.println(Arrays.toString(numbers1));
		
		java.util.List<Integer> numbers2= Arrays.asList(numbers1);
		System.out.println(numbers2);
		Collections.sort(numbers2);
		System.out.println(numbers2);
		
		
		System.out.println(Collections.binarySearch(numbers2, 4)); //arrayList'de var binary search
		String str="tezgah";
		System.out.println(str.indexOf("h"));
		
		ArrayList<String>words= new ArrayList<>();
		words.add("apple");
		words.add("3peach");
		words.add("banana");
		System.out.println(words);
		Collections.sort(words);
		System.out.println(words);
		
		ArrayList words2=new ArrayList();
		words2.add("money");
		words2.add(2);
		words2.add(7);
		//Collections.sort(words2); //different data types can not be sorted.
		System.out.println(words2);
		
		ArrayList task= new ArrayList();
		task.add(5);
		task.add(15);
		task.add(3);
		task.add(20);
		Collections.sort(task);
	    System.out.println(task);
		
	}
		public static ArrayList<Integer>task1(List<Integer>nums){
		
	    
			Collections.sort(nums);
			ArrayList<Integer>missedNums=new ArrayList<>();
			
			Integer maxNum= nums.get(nums.size()-1);
			
			for(int i=0; i<maxNum ; i++) {
				if (nums.contains(i)) {
					
				}else {
					missedNums.add(i);
				}
			}
		return missedNums;
		
		List<Integer>number=(ArrayList<Integer>) Arrays.asList(2,5,8,0);
		
		
		
		}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

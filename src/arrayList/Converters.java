package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Converters {

	public static void main(String[] args) {
		
		String [] words= {"Hello", "Java", "ArrayList", "today"};
       //Simdi arrayden arrayList'e cevirmek istiyoruz.
		
		List<String>wordList= Arrays.asList(words);
		
		System.out.println(wordList);
		
		List<String>days=new ArrayList<>();
		days.add("monday");
		days.add("tuesday");
		days.add("wednesday");
		days.add("thursday");
		
		Object[] daysArray= days.toArray();
		System.out.println(days);
		
		List<Integer>numbers=Arrays.asList(2,5,8);   //burada we provide array and we get arraylist. 
		System.out.println(numbers); 
	}

}

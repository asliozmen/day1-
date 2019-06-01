package mAP;

import java.util.Set;
import java.util.TreeMap;

public class CatPractice {

	public static void main(String[] args) {
		
		Cat russionBlue= new Cat("Kitty", "RussionBlue", 3);
		Cat scottish= new Cat ("Lucy", "Scottish", 6);
		Cat persion= new Cat ("Bella", "Persion", 7);
		
		TreeMap number= new TreeMap();
		number.put("David", "20");
	    number.put("Recep", "30");
		number.put("Lisa", "35");
		
		System.out.println(number.values());
		
		TreeMap<String,Cat>cats=new TreeMap();
		cats.put("Russion", russionBlue);
		cats.put("Scottish", scottish);
		cats.put("Persion", persion);
		
		Set<String> catkey= cats.keySet();
		for (String str: catkey) {
			if (cats.get(str).getName().startsWith("L")) {
				System.out.println(cats.get(str).getName());
			}
		}
		
		
		
		
		

	}

}

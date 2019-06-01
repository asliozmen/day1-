package mAP;

import java.util.LinkedHashMap;
import java.util.Set;

public class DogPractice {

	public static void main(String[] args) {
		
		Dog bulldog= new Dog("Nora", "Bulldog", 1);
		Dog poddle= new Dog("Lora", "Poodle", 2);
		Dog husky= new Dog("Max","Husky", 3);

		bulldog.setName("Tora");
		LinkedHashMap<Integer, Dog> dogs= new LinkedHashMap();
		dogs.put(10, bulldog);
		dogs.put(11, poddle);
		dogs.put(12, husky);
		
		
		System.out.print(dogs.get(10).getName());
		dogs.get(10).setName("Sora");
		System.out.println(dogs.get(10).getName());
		
		System.out.println(dogs.values()); // I will get the hashcode for the dog object with 
	    
		Set<Integer>dogKeys=dogs.keySet();
		
		for (Integer k: dogKeys) {
			System.out.println("Name "+ dogs.get(k).getName());}
		for(Integer k: dogKeys) {
			System.out.println("Age "+ dogs.get(k).getAge());
			
			
		}
	
	
	
	}

}

package practiceSetCollection;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetPractice {

	public static void main(String[] args) {
		
		Set<Integer> set= new HashSet<Integer>();
		
		set.add(10);
		set.add(17);
		set.add(20);
		set.add(40);
		set.add(30);
		System.out.println(set);
		
		set.remove(20);
        System.out.println(set);
        
        Set<Integer>set2= new HashSet<Integer>();
        set2.add(60);
        set2.addAll(set);
        
        System.out.println(set2); //addAll and removeAll methods takes as a collection.
        set2.removeAll(set);
        System.out.println(set2); // set2 elements after removeAll method.
        System.out.println(set2.size());
        System.out.println(set.size());
        
        ArrayList<Integer> number= new ArrayList<Integer>(set);  //with pass by value.
        
        System.out.println(number.get(0));
        System.out.println(number.get(1));
        System.out.println(number.get(2));
        System.out.println(number.get(3));
        
        ArrayList car= new ArrayList();
        car.add("Toyota");
        car.add("Mercedes");
        car.add("Audi");
        car.add("Mercedes");
        
        System.out.println(car);
        
        //to convert from List to set;
        Set carName= new HashSet(car);
        
        System.out.println(carName);
        
       //TASK:
        //1) Create a Flower class with two arg. constractor.(name and price)
        //2)Create 3 object of flower.
        //3)Create hashSet..
        //4)Store flower objects to the hashSet
        //5)Print flower objects using iterator.
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}

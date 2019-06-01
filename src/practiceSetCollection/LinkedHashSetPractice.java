package practiceSetCollection;

import java.util.Set;



public class LinkedHashSetPractice {
	
	public static void main(String[]args) {
		
	  Set  linkedSet= new LinkedHashSetPractice();      //it contains only unique elements
	                                        // it is not synchronized like hashSet
	     linkedSet.add(10);                //linkedHashSet prints as the given order.(inserting order)
	     linkedSet.add(20);
	     linkedSet.add(50);
	     linkedSet.add(30);
	     
	     System.out.println("LinkedSet" + linkedSet);
	     
	  
	
	                                          
	}

}

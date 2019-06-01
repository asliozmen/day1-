package arrayList;

import java.util.ArrayList;

public class Methods {

	public static void main(String[] args) {
		
		ArrayList<String> stringList= new ArrayList<>();
		ArrayList<Integer>intList=new ArrayList<>();
		
		stringList.add("Java");
		stringList.add("Python");
		stringList.add("C#");
		stringList.add("JavaScript");
		intList.add(3);
		intList.add(56);
		intList.add(44);
		intList.add(22);
		
for(int num:intList) { //integer Wrapper Class//Integer-->int (Unboxing)
	if(num%2==0) {
		System.out.println(num);
		
	}
}
     System.out.println(stringList);
     stringList.set(stringList.indexOf("Python"), "C++");//gercek hayatta bu sekilde indexi kendi-
                                                        //ne bulduruyor.

     System.out.println(stringList);
     System.out.println(stringList.size());//returns number of elements in arraylist.
     System.out.println(stringList.contains("Python"));//checks if arraylist has specific value.
     
     if (stringList.isEmpty()) { //checks if arrayList is empty and return as boolean.
    	 System.out.println("Empty");
     }else {
    	 System.out.println("Not empty");
     }
    	 stringList.clear();  //removes all the elements in array.
    	 if (stringList.isEmpty()) {
    	 System.out.println("Empty");
     }else {
    	 System.out.println("Not empty");
     }}
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }
	
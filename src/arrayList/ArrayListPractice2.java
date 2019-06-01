package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice2 {
	
	public static void arrayUpper(ArrayList<String>list) {
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toUpperCase()); 
		}
	}

	
	public static void printA(ArrayList<String>list) {
		for(int i=0; i<list.size(); i++) {
			if (list.get(i).endsWith("a")) {
				
			}
		}
	}
	
	
	
	
	
	
    public static void printArrayList(ArrayList list) {
    	
    	for(int i=0; i<list.size(); i++) {
    		System.out.println(list.get(i));
    		
    	}
    }
	public static void main(String[] args) {
		//1. Create an ArrayList of String called states
		//2.Add 8 states using Scanner to ArrayList object
		//3.then print out using loop create one method called printArrayList() [use loop]
		//it will take one parameter as a ArrayList and it will print out all the element.
		//4.Then print out the states which is ending with "a". Create one method called printA() it will take
		//[use loop]
		//5.Then make every item uppercase
		//6.Create one method which is called arrayUpper() [use loop]
		//it will take one parameter as a arrayList then it will printout all the element with uppercase.

		ArrayList<String> states=new ArrayList<>();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a state:");
		
		for(int i=0; i<8 ; i++) {
			
		}
		states.add(sc.nextLine());
		// System.out.println(states);
		//PrintArrayList.printArrayList(states);
		//PrintArrayList.printA(states);
		
		
		
		
		
	}

}

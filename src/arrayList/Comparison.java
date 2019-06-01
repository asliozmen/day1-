package arrayList;

import java.util.ArrayList;

public class Comparison {

	public static void main(String[] args) {
		
		ArrayList<String>bookShelf1= new ArrayList<>();
		ArrayList<String>bookShelf2= new ArrayList<>();
		
		bookShelf1.add("Java OCA");
		bookShelf1.add("Python Book");
		bookShelf1.add("C# for Beginners");
		
		
		bookShelf2.add("Java OCA");
		bookShelf2.add("Python Book");
		bookShelf2.add("C# for Beginners");
		
		if (bookShelf1.equals(bookShelf2)) {
			
			System.out.println("same books");
		}else { 
			System.out.println("different books");
		}
         if (bookShelf1==bookShelf2) {
			
			System.out.println("same books");
		}else { 
			System.out.println("different books");
	}
    ArrayList<ArrayList<String>> names= new ArrayList<>();  //string diye specify ediyoruz 
    //etmesek diger tum typelerda oluyor. arraylist icinde arraylist. Multi-dim. arraye gibi.
    
    names.add(bookShelf1);
    names.add(bookShelf2);
    
    System.out.println(names);
}}
















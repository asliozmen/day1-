package practiceSetCollection;

import java.util.HashSet;
import java.util.Iterator;

public class Flower {
	
    String name;
    int price; 
    
	public Flower (String name , int price) {
		
		this.name=name;
		this.price=price;
	}
	public static void main(String[] args) {
		
		Flower rose= new Flower("Rose", 15);
		Flower tulip= new Flower("Tulip",10);
		Flower orchid= new Flower("Orchid",20);
		
		
		System.out.println(rose.name);
		System.out.println(rose.price);
		
		HashSet<Flower> flowers = new HashSet<Flower>(); // HashSet flowers= new HashSet();
		                                         //print etmek istemezsek boyle de yazabiliriz.
		flowers.add(rose);
		flowers.add(tulip);
		flowers.add(orchid);
		
		for(Flower fl : flowers) {
			
			System.out.println(fl.name);
			System.out.println(fl.price);
		}
		
		//System.out.println());
		
      // Iterator i= flowers.iterator();
	//	while (i.hasNext()) {
     //   System.out.println(i.next());
	//	}
       
       
		
	}

}

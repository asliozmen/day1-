import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setPractice {
        String name= "Iterator";
        
        
	public static void main(String[] args) {
		
		// Uc sekilde yazlilabiliyor..
		
		Set set= new HashSet();
		
	//	Set<String>set1= new HashSet<String>();
		
	//	HashSet hashset= new HashSet();
		
		set.add("Techtorial");
		set.add("Kushal");
		set.add("Priyanka");
		set.add("Gopal");
		set.add("Techtorial");
		// Set doesn't allow duplicate.
		// Set is not ordered.
		
		System.out.println(set);
		
		Set set2= new HashSet();
		set2.add("Parvaty");
		set2.add("Hima");
		set2.add("Praph");
		
		set2.addAll(set);
		System.out.println(set2);
	//	System.out.println(set); // Java is pass by value.
		
		Iterator i= set2.iterator();       // get methodu yok onun icin iterator var.
		//SetPractice practice= new SetPractice();
		//String str= setPractice
		
		
		while(i.hasNext()) {
			
			if (i.next().equals("Kushal")) {
			System.out.println("Kushal is present in our set");
			System.out.println (i.next());
			}	
			
		}
//Create one Set names is cities.
//Store following elements to the cities set collection
//Chicago, Los Angeles,Irving,Austion, Austion
//iterate over the element and print
//Irving is avalible in our set if it is avalible.
		
		Set cities= new HashSet();
		cities.add("Chicago");
		cities.add("Los Angeles");
		cities.add("Irving");
		cities.add("Austion");
		cities.add("Austion");
		System.out.println(cities);  // Setimizde ne oldugunu print ediyoruz.
		Iterator i1= cities.iterator();
		
		while (i1.hasNext()) {
			 if (i1.next().equals("Irving")){ 
				//System.out.println(i1.next());  Bu satir, Irvingten sonra gelen olmadigi icin hata veriyor. Chicago yazinca okey.
				 
				 System.out.println("Irving is avalible in out set");
				 System.out.println(cities.contains("Austion"));				
				 System.out.println(cities.size());	
				 System.out.println(cities.isEmpty());
				 
			 }
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

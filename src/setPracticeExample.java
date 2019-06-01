import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setPracticeExample {

	public static void main(String[] args) {
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
				System.out.println(cities);
				Iterator i1= cities.iterator();
				
				while (i1.hasNext()) {
				  if (i1.next().equals("Irving")){
						 //System.out.println(i1.next());
						
					//	 System.out.println("Irving is avalible in out set");
					 }
					// System.out.println(i1.next());
					//System.out.println(cities);
	

	}

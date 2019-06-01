package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
     
		Map<String,Integer>menu= new HashMap<>();
		menu.put("Coffee", 2);
		menu.put("Capuccino", 4);
		menu.put("Hot Chocolate", 6);
		menu.put("Hot Chocolate", 7);    
		
		System.out.println(menu);
		
		menu.remove("Coffee");  // tamamen ayni yazmak lazim buyuk kucuk harfler ayni olmali. 
		System.out.println(menu);
		
		menu.replace("Capuccino",5);
		System.out.println(menu);
		
		menu.put("Frapucino", menu.get("Hot Chocolate")); //hot choctatin fiyatinda olsun demek.
		System.out.println(menu);
				
	}

}

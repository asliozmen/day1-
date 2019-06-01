package mAP;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTablePractice {

	public static void main(String[] args) {
	Hashtable<String, String> table= new Hashtable();
	
	table.put("David", "223345667");
	table.put("Mark", "404040400");
	table.put("Eric", "870589048");
	
// Hashtable is syncronized
// We can not store null keys and null values
	
	Set<String> nm= table.keySet();
	for(String k: nm) {
		System.out.println(table.get(k));
	}
	//There is another way to get the values
	for(Map.Entry<String,String> i:table.entrySet()) {
		System.out.println(i.getValue()+ "" +i.getKey());
	}
	
	
	
	
	
	
	
	}

}

package practiceSetCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Conversion {

	public static void main(String[] args) {
		
		ArrayList nameArray= new ArrayList();
		
		nameArray.add(10);
		nameArray.add(6);
		nameArray.add(9);
		nameArray.add(9);
		
		System.out.println(nameArray);

		Set<Integer>setName= new HashSet<Integer>(nameArray);
		
		for(Integer nm:setName) {
			System.out.println(nm);
	
		LinkedHashSet<Integer>name= new LinkedHashSet<Integer>(name);
		name.add(10);
		name.add(6);
		name.add(9);
		
		ArrayList arrayName= new ArrayList(name);
		get(0);
		get(1);
		get(2);
		get(3);
		
		System.out.println(arrayName);
		
		
		
		
		
		
			
	
	}

}

	private static void get(int i) {
		// TODO Auto-generated method stub
		
	}

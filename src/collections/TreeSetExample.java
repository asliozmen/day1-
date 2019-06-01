package collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		Set<String>set= new TreeSet<>();
		
		set.add("aa");
		set.add("ac");
		set.add("ab");
		set.add("aa");
		System.out.println(set);    // TreeSet stores unique sorted values.
		
	}

}

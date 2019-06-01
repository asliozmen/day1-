package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<String>names= new LinkedList<>();
		
		names.add("Alex");
		names.add("Mark");
		names.add("Charlie");
		names.add("Sarah");
		names.add("Bob");
		
		System.out.println(names);
		
		System.out.println(names.peek()); //taking the first one
		
		System.out.println(names.peekFirst());
		
		System.out.println(names.peekLast());
		
		System.out.println(names.poll());  //birinciyi secip aliyor.
		System.out.println(names);
		
		System.out.println(names.pollLast()); //sonuncuyu secip aliyor.
		System.out.println(names);
		
		//System.out.println(names.get(1));
	}

}

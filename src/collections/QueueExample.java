package collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {

		Queue<String>queue= new PriorityQueue<>();
		queue.add("Chase Bank");
		queue.add("Bank of America");
		queue.add("Citi Bank");
		queue.add("Amex");
		
		System.out.println(queue);
		
		List<String>list= new ArrayList<>();
		queue.add("Chase Bank");
		queue.add("Bank of America");
		queue.add("Citi Bank");
		queue.add("Amex");
		
		System.out.println(queue);
		
		
		
	}

}

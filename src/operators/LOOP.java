package operators;

import java.util.Scanner;

public class LOOP {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String name =input.next(); // John
		
		System.out.println("How many times you want to print your name?");
		
		int times =input.nextInt();
		
		String result = "" ;
		
		for(int n=1; n<= times; n++) {
			
			//" "=" "+John -->John 1
			//John=John +John --->JohnJohn 2times
			//JohnJohn= JohnJohn+John---> JohnJohnJohn 3times
			 result= result+name;
		}
		System.out.println(result);

	}

}

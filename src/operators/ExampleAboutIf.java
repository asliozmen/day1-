package operators;

import java.util.Scanner;

public class ExampleAboutIf {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" Write the password:");
		
		String name = scanner.next();
		
		String pword = "Elma" ;
		
		if (name.equalsIgnoreCase(pword)) {
			
			System.out.println(" you got it!!");}
		
		 else {System.out.println(" Please write a password");
		
	      name = scanner.next();
		
		  if (name == pword) {
			  
			  
			  System.out.println("Hi");}
		
		else {
			System.out.println("Please try again later.");
		}
		
	
			
		}

	}

}

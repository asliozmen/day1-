package operators;

import java.util.Scanner;

public class NestedIfstatement {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Please enter your name: ");
		 
		String name = scanner.next();
		 
		String myName= "Enes";
		
		if(name.equalsIgnoreCase(myName)) {
			
			if (name.length()<6) {
			
		
		System.out.println(" Your name has" + name.length() + "letters" );
		} else {
			System.out.println("Your name is too long I could not count");
		}
        System.out.println("Hello " + name);
	} else {
		
		System.out.println("bye" + myName+ ". Hello"+ name);
	}
	}
		
		
		

}

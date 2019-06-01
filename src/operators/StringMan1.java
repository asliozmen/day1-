package operators;

import java.util.Scanner;

public class StringMan1 {

	public static void main(String[] args) {
		
		String name= "Aslı";
		
		System.out.println("Hello " + name);
		
		Scanner input = new Scanner (System.in);
		
		String answer1= input.next();
		
		System.out.println("How are you?");
		
		String answer2=input.next();

		
		String age = null;
		System.out.println( "My answers " + answer1 + " " +answer2 + " " + age);
		

	}

}

package operators;

import java.util.Scanner;

public class Loops3SonGelenOgrenci {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Please enter your name:");
		String name = input.next();
		System.out.println ("Are you the last student?");
		String answer = input.next();
		int count = 1;
		String listOfNames = name;
		
		for ( ;answer.equalsIgnoreCase("no"); count++) {
			
			System.out.println ("Please enter your name: ");
			break;
		}

	}

}

package operators;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your first name begin with an uppercase:");
		
		String name = scanner.nextLine();
		
		if(name.charAt(0)== (name.toUpperCase().charAt(0))){
			
		System.out.println("Please enter your last name:");
		}
		
	   String lastname = scanner.next();
		
		if (lastname.endsWith("ova")){
			System.out.println("Welcome madam");
			
		}
		
		else {
			System.out.println("Welcome sir please enter your age:" );
			
			int age = scanner.nextInt();
			
			if (age >= 50) {
				System.out.println("You are eligable to stay");
				
			} else {
				System.out.println("you have to stay another place.. please write your location:");
				
				String location = scanner.next();
				
				if (location.startsWith("Chi")) {
					System.out.println("Congratulations!!");
					
				}
			}
		}
		
		
		
		
		
			
	}

	}



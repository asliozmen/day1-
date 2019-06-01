package operators;

import java.util.Random;
import java.util.Scanner;

public class RandomIkinciOrnek {

	public static void main(String[] args) {
		
		
		Random random = new Random();
		
		int hiddenNumber = random.nextInt(20);
		
		Scanner input = new Scanner(System.in);
		
		int myNumber;
		int attempts=0;
		
		do {
			System.out.println("Guess the hidden number:");
			
			myNumber = input.nextInt();
			
			if (myNumber == hiddenNumber) {
				System.out.println("Congratulations!! You found the number..!");
				
			}else if (myNumber>20) {
				System.out.println("INVALID entry");
				attempts++;
			
			} else if (myNumber> hiddenNumber) {
				
				System.out.println("Your number is MORE than hidden number");
				attempts++;
				
			} else if (myNumber< hiddenNumber) {
				
				System.out.println ("Your number is LESS than hidden number");
				attempts++;
			}
				
				System.out.println("attempt number: " +attempts);
				if (attempts==5) {
					System.out.println("Ÿou LOST..Try again");
					System.out.println("The hidden number was:" + hiddenNumber);
					
					
					break;
			}
			} while(myNumber != hiddenNumber);
		}
	
		}
	
	

		
		
		

	

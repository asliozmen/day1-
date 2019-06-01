package operators;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) { 
		
		Random random = new Random();
		
		int hiddenNumber = random.nextInt(10);
		Scanner input = new Scanner (System.in);
		int myNumber;
		do {
			System.out.println("Guess a hidden number:");
			
			myNumber = input.nextInt();
			if (myNumber==hiddenNumber) {
				System.out.println("Congratulations!!!");
			}
		} while (myNumber!=hiddenNumber); 
			} 

	}



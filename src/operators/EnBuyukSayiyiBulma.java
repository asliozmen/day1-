package operators;

import java.util.Scanner;

public class EnBuyukSayiyiBulma {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("How many numbers do you want to input?");
		
		int number =input.nextInt();
		System.out.println("Please enter "+number+ "  positive numbers:");
		
		int largestNumber =-1 ;// Largest number her zaman positive olsun diye.En basta kullanicidan aldigi sayiyi -1 den buyuk mu diye
		                                         //bakiyor.
		for (int i=0; i<number; i++) {
			int currentNumber=input.nextInt();
			if (currentNumber>largestNumber) {
				largestNumber=currentNumber;
			}
		}System.out.println("The LARGEST number is: " +largestNumber);

	}

}

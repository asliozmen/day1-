package operators;

import java.util.Scanner;

public class Loops3DoWhile {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		infinite: for ( ; ; ) {
		do {
			System.out.println ("Please enter 1 : ");
			int number = input.nextInt();
			if (number==1) {
				break infinite;
			}
		}while(true);

	}

}}

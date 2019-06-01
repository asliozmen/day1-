package exceptionsWithTemirlanjune1;

import java.util.Scanner;

public class TrowingExceptions {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name:\n Note that,your name should be more than 6 letters.");
		String name = scanner.nextLine();
		int count = 1;

		for (int i = 0; i < 3; i++) {

			if (name.length() < 6) {

				System.out.println("enter again");
				count++;
				name = scanner.nextLine();
				// count++;
				if (count == 3) {
					throw new RuntimeException("You have already tried 3 times, bye.");
				}

			} else {
				System.out.println("Welcome to webpage  " + name);
				break;
			}
		}
	}

}

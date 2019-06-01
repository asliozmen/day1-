import java.util.Scanner;

public class LoopRecapSplitWord {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a String: ");
		String word =input.next();
		int length = word.length(); // eger tek harfli bir kelime girilirse ex:apple 5 harf var.
		
		for (int i=0; i<length; i +=2) {
			
			if (i+2> length ) {
				
				System.out.println(word.charAt(length-1)); // Bunu cozmek icin bu satiri ekledik.
				
			} else {
			
			
			System.out.println(word.substring(i, i+2));
			
		}

	}
	} }


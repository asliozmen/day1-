package operators;

import java.util.Scanner;

public class DenemeEvde2 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please enter a polidrome word:");
		
		String word = input.next();
		String reversed="";
		
		int length = word.length();
		
		for (int i=length-1 ; i>=0 ; i--) {
			reversed =reversed + word.charAt(length); 
		
			System.out.print(word.charAt(length));
			
			if(word.equalsIgnoreCase(reversed)) {
	        	System.out.print ("This word is polindrome!");
	        }else {
	        	System.out.print("This word is NOT a polindrome");
	        }
		}

	}

}

package operators;

import java.util.Scanner;

public class PolindromeWord {

	public static void main(String[] args) {
	
		
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter polindrome word:");
		
		String word =input.next();
		String reversed ="";
		
		int lastIndex= word.length()-1;
        for(int i=0; i<=lastIndex; lastIndex--) {
        	
        	reversed =reversed + word.charAt(lastIndex);
        }
        System.out.println(reversed);
        
        if(word.equalsIgnoreCase(reversed)) {
        	System.out.println ("This word is polindrome!");
        }else {
        	System.out.println("This word is NOT a polindrome");
        }
	}

}

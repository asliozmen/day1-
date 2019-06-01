package operators;

import java.util.Scanner;

public class LoopsVowelLetter {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please enter a letter:");
		
		String letter= input.next();
		
		int length= letter.length();
		
		char l= letter.charAt(0); // a==>afd
		
		if (length>1) {    // bu satiri kullanici tek harf girmezse diye koyuyoruz.
		
			System.out.println("This is not a letter");
			
		} else if (l=='a' || l=='e'|| l=='o'|| l=='i'|| l=='u') { // Buraya Bharf girerse yanlis cikacagi icin buyuk harfli yazilislari da assign et.
			System.out.println("The letter is vowel.");
		}else {
			System.out.println("The letter is consonant."); // odev diger karakterler girilirse handle etsin odev
		}
		
		

	}

}

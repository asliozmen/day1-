package staticIntro;

import java.util.Random;

public class RandomS{

	public static void main(String[] args) {
		
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String randomString= "";
		int length= 5;
		Random randm= new Random();
		
		int index = randm.nextInt(5);
		
		int length1 = randm.nextInt(5);
		
		char[] text = new char [length];
		
		for(int i=0; i<length; i++) {
			text[i]= characters.charAt(randm.nextInt(25));
			
		}
		for (int i=0; i < text.length; i++) {
			randomString += text[i];
		}
		
		
		
		System.out.println (randomString);

	}

	
	}



package operators;

public class Loops2 {

	public static void main(String[] args) {
		
		String word = "JAVA";
		
		int length =word.length(); // Java kelimesi icin length 4
		
		for(int index=0; index<length ; index++) {
			
			System.out.print(word.charAt(index));   // println deki -ln i kaldirdigimizda yan yana yaziyor. 
		}

	}

}

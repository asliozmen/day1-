package operators;

public class OrnekForLoops {

	public static void main(String[] args) { // amacimiz techtorial kelimesindeki t leri yazdirmadan print ettirmek.
		
		String word = "techtorial"; //Alterte etmek  once length almaliyim.
		int length = word.length();
		
		for( int  i=0 ; i <length; i++ ) {
			if(word.charAt(i) != 't' ) {   // if letter is not equal to t print et diyoruz. If letter != t --->true
				System.out.print(word.charAt(i));
			}
				}
		
		

	}

}

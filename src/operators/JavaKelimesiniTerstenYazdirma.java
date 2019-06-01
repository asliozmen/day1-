package operators;

public class JavaKelimesiniTerstenYazdirma {

	public static void main(String[] args) {
		
		String word = "techtorial";
		
		int length = word.length();
		
		int lastIndex= length-1;
		
		for(int n = 0 ; n <= lastIndex; lastIndex--) {
			
			System.out.print(word.charAt(lastIndex));
		}

	}

}

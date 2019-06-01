package operators;

public class MethodChain {

	public static void main(String[] args) {
		
		String word = " java programming ";
        System.out.println(word);
        System.out.println(word.trim());
        
        int length = word.trim().substring (1,4).trim().length();
        
        System.out.println(length);
	}

}

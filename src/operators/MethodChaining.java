package operators;

public class MethodChaining {

	public static void main(String[] args) {
		
		String word = "Love Java";         // "ava"
                                           // J---> "j"
                                           // "ja" 
		                                   // "E"
		                                   // "LovE Java"
	                                      // "LovE JavA"
	                                       // System.out.println(word.s);
		
      System.out.println(word. substring (6,9));
      
      System.out.println("Love Java".toLowerCase().substring(5,6));
      
      System.out.println("Love Java".substring(5,7));
      
      System.out.println("Love Java".substring(3,4).toUpperCase());
      
      System.out.println(word.replace("e", "E"));
      System.out.println(word.replace("e", "E").substring(0,8).concat("A"));
      
      
	
	}

}

package introToConstractors;

public class Person {
	
	// public Person() {          // <----- That is out constructor. we can overload the constructor like 
		                       // the method overloading..  We did not define any parameters.
		
		public Person (String name) {    // Simdi parameter string olmali diyoruz burada. 
			
			System.out.println("Constructor with one string");
			
	} 
		public Person (int age) {       // simdi person class i icin yeni bir parameter yazmis olduk.
			System.out.println ("in constructor with 1 int parameter.");
		}
		                                 
	    public Person (double size) {
	    	
	    	System.out.println("in constructor with 1 double parameter" );
	    }
	    
	    public Person (String name ,String m, int i, String b, String t, int h ) {
	    	System.out.println ("in constructor with a lot of parameters");
	    }
}

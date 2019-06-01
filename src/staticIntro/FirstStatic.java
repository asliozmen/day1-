package staticIntro;

public class FirstStatic {
	
	public static String name; // static method
	
	public String lastName;  // unstatic method
	
	public void printFirstLastName() {
	
	System.out.println(name);
	System.out.println(lastName);
	staticPrintFirstLastName();

}
    public static void staticPrintFirstLastName() {
    	System.out.println(name);
    	//System.out.println(lastName);
    	//printFirstLastName();
    	
    	FirstStatic fs= new FirstStatic();
    	fs.printFirstLastName();
    	System.out.println(fs.lastName);
    	
    }}
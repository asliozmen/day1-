package staticIntro;

public class Library {
	
	static {                                             // Static block burasi and is going to be executed 
		
		System.out.println("Hello from static block");  // first. bir de non-static block var.
	}

	String name;
	
	public Library(String name){
		
	
	//	this.name= name              // User ismini girmeli diyoruz, kitabin olup olmadigini sormak icin
	}
	
	
	public static int numOfBooks= 5;
	
	public static boolean checkOutBook() {  
		
		
		if(numOfBooks > 0) {
			
		numOfBooks--;
		
		return true;
		
		}
        return false;
}}

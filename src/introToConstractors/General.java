package introToConstractors;

public class General {

	public static void main(String[] args) {
		
	Person pers= new Person(132);   //There is an object with no parameters. It allows us to do that because 
	                             // in person class we defined without parameters.
	
	Person pers34 = new Person(34.1);
	
	Person per= new Person ("Apple");
	
	Person p= new Person ("Hello", "goodbye", 34, "wow", "yeah", 8);
	
	
		 Bike bike = new Bike();
		 Bike bike2 = new Bike(23343);
		 Bike bike3 = new Bike ("Sport", 8 , "Red");
		 Bike bike4 = new Bike ("John", "Green", "32");
		 Bike bike5=  bike;   // Burada bike5 = bike   icinde parametresi olmayan ayni object.
		 
		 bike = bike4;      // bike artik bike4 u refer ediyor.
		   
		 // Soru: hepsi bike4 u refer etsin dedi.. bir onceki satirda bike bike4 u isaret ettigi icin gerek
		                                          // yok tekrar yazmaya. bike5 bike i refer ettigi icin
		 bike2= bike4;
		 bike3= bike4;
		 bike5 =bike4; 
		 
		 
	
	

	}

}

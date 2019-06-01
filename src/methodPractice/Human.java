package methodPractice;

public class Human { 
	
	int eyes = 2;
	int legs = 2;
	String name= "David";
	String country= "USA";                        //bu variableslar instance variables outside the method but inside the class
	String dateOfBirth= "01/01/2000";       //instance variables will take default values. int, long
	int age =19;                           //gibiler icin 0, for boolean is false, for string id null.
	boolean noise= true;
	boolean brain= true;              // instance variables method bodysi disinda da ulasilabiliyor.
	String hairColor= "brown";
	int runSpeed = 10;
	int studyTime=4;
	int walkSpeed= 5;
	
	public void changeCountry(String country) {
		this.country = country;
		
		
	}
	
	public void change() {
		
		
	}
	public void run() {          // behavior sadece printi goruyorum void oldugu icin manipulate yok.
		                         // method
		System.out.println("David is running");
		
	}
	public int increaseSpeed() {
		System.out.println("David is running and speed is increased with 5");
		return runSpeed+5;
		
	}
	public void study() {
		System.out.println("David is studing.");
	}
	
	public int increaseStudy() {
		System.out.println("David isstuding and study time increased with 2");
		return studyTime+2;
	}
    public  int increaseWalkingSpeed(int speed) {  // parantez icine koydugum parametreleri kullanarak
    	                                            // walkingspeedi artiriyorum.
    	
    	return speed;
    }
	public void walkSpeed() {
		// 
		
	}
}

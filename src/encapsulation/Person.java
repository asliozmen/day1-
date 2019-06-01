package encapsulation;

public class Person {

	
	private String name;// private yerine bisey yazmasaydik default acces modifier olurdu
    private String lastName;
    private String SSN;
    private char Gender;
    private int Age;  
    
    public void setName(String name) {
    	this.name= name;
    }
    public String getName() {
    	return name;
    }
    public void setLastName(String LastName) {
    	this.lastName=lastName;
    }
    public String getLastName() {
    	return lastName;
    	}
    public void setGender(char Gender) {
    	this.Gender= Gender;
    }
    public char getGender() {
    	return Gender;
    }
    public void setSSN(String SSN) {
    	this.SSN= SSN;
    }
    public String getSSN() {
    	return SSN;
    	
    	
    	
    	
    	
    }
}
    
    
    
    

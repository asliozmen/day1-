package introToConstractors;

public class Phone {
	
	  private String password;
	  private String model;
	  private int accountNumber;
	  
	  public void setPassword(String password) {
		  this.password= password;       //  
	  }
	  
	  
	  public String getPassword() {
		  return this.password;
	  }
	  
	public Phone() {
		//this ("aaaaaa", 12);
		
		System.out.println("no parameter constructor body");
		}
	
    public Phone (String kind) {
    	this();
    }
    
    public Phone(String brand, int price) {
    	System.out.println (" Nothing");}
    	
    public Phone (String color, int number, String name)	{
    	
    	System.out.println ("It was my first phone");
}}

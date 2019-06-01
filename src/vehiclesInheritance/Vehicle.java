package vehiclesInheritance;

public class Vehicle {
	
	String make;
	
	public Vehicle() {
		
		System.out.println("Creating non argument constractor from vehicle.");
	}
      public Vehicle (String make) {
    	  this();
    	  this.make=make;
    	  
    	  System.out.println("Creating vehicle make:" +make);
    	  
      }
      public Vehicle (String make, String message) {
    	  this(make);
    	  
    	  System.out.println(message);
    	  
      }
      
      public Integer drive() {
    	  System.out.println("Vehicle is driven");
      }
    	  public static void main (String Args[]) {
    		
    	  Vehicle v= new Vehicle("Toyota", "Buy new car.");
      }
      
      
}

package vehiclesInheritance;

public class Car extends Vehicle{
	
	public Car (String make, String message) {
	
		super(make,message);
		System.out.println("This constractor is comig from car class.");
	}
		public Car() {
			super();
	}
		
		public static void main(String[]args) {
			Car c=new Car ("Honda", "Selling my car.");
			Vehicle v=new Vehicle();
			v.drive();
		}

}

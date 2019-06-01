package vehiclesInheritance;

public class Bus extends Vehicle{
	public Bus() {
		super();
	}
	public Bus(String make, String message) {
		super(make, message);
		super.make=make;
	}
	@Override
	
	protected Integer drive() {

		System.out.println("Bus is driven.");
	}

}

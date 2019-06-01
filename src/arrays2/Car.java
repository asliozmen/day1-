package arrays2;

public class Car {
	
	int door= 4;
	int window= 6;
	int heat= 73;
	String model= "Honda";
	int price= 30000;
	int tire= 4;
	String color= "white";
	String seat= "7";
	String name="odessey";
	boolean Break= true;
	int Speed = 50;
    int Gear = 5;
    String make= "Japan";
	double currenSpeed= 45;
	int year= 2016;
	boolean isRunning = true;
	
	
	public int increaseSpeed() {
		System.out.println(Speed+15);
		return Speed+15;
	}
	public int increaseGear() {
		System.out.println(Gear+1);
		return Gear+1;
	}
	public int decreaseSpeed() {
		System.out.println(Speed-20);
		return Speed-20;
	}
	public int increaseheat() {
		System.out.println(heat+30);
		return heat+30;
	}
	public boolean stopCar() {
		Break=true;
		System.out.println("Breaks are working.");
		return Break;
	}
    public int getCarInfo () {
		
		System.out.println();
		
		return price;
	}
	
	
	public static void main (String[]args) {
		Car myCar = new Car();
		System.out.println(myCar.model);
		System.out.println(myCar.name);
		System.out.println(myCar.tire);
		
		Car mCar = new Car();
		
		System.out.println("My car tire number is "+ myCar.tire);
		System.out.println("My car model is " + myCar.model);
		myCar.model= "Civic";
		System.out.println("My car model is " + myCar.model);
		
		System.out.println(mCar.color);
		System.out.println("My car color is "+ mCar.color);
		mCar.color= "black";
		System.out.println("My car color is "+ mCar.color);
		
		mCar.increaseSpeed();
		mCar.increaseGear();
		mCar.decreaseSpeed();
		mCar.increaseheat();
		boolean Break=mCar.stopCar();
		boolean isRunning = mCar.isRunning();
		boolean isNotRunning = mCar.isRunning();
		
		
		
		
	
}
	   public boolean isRunning() {
		isRunning = true;
		System.out.println("Car is running.");
		return true;
	}}

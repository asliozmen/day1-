package arrays2;

public class House {

	int bedroom=3;
	double bathroom= 1.5;
	boolean kitchen= true;
	boolean garage= false;
	String color="white";
	String name="Pirates";
	String kind="Condo";
	int door=10;
	int window=20;
	String address="497 Leslie Court";
	String zipcode= "60016";
	String state= "IL";
	String country="USA";
	int temperature= 70;  //Create one method called getTemperature.
	                     //Return type int and it will return the temperature of the home.
	boolean light= false;
	
	
	
	public int getTemperature () {
		
		System.out.println(temperature);
		
		return temperature;
	}
	
	public int increaseTemperature() {
		System.out.println(temperature+10);
		return temperature+10;
	}
	public int decreaseTemperature() {
		System.out.println(temperature-10);
		return temperature-10;
		
	}
	
	public int getdoor() {
		System.out.println(door);
		return door;
	}
	
	public boolean openLight() {
		light= true;
		System.out.println("Lights are open");
		return light;
		}
	public boolean closeLight() {
		light= false;
		System.out.println("Lights are closed");
		return light;
	}
	// Soru: Create one method to increase the temperature of the house.
	// method name increaseTemperature. Return type is int.
	// It will return the temperature after increasing 10.
	//Soru: Create one method to open the light of the house.
	//method name openLight. Return type is boolean.
	//it will return boolean true if light is open.
		
		public static void main(String[]args) {
			
			House myHouse = new House();
			
			 int houseTemperature=myHouse.getTemperature();
			 
			 myHouse.increaseTemperature();
			 
			 myHouse.decreaseTemperature();
			 
			 int houseDoor = myHouse.getdoor();
			 
			 boolean lightBoolean= myHouse.openLight();
			 
			 boolean lightClosed= myHouse.closeLight();
			 
			 House enesHouse=new House();
			 System.out.println("Enes's house color is "+ enesHouse.color); //white
			 enesHouse.color="Yellow";
			 System.out.println("Enes's house color is "+ enesHouse.color); //yellow
			 
			 House asliHouse= new House();
			 asliHouse.door= 15;
			 System.out.println("Asli's house has " + asliHouse.door + " doors");
			 asliHouse.window= 22;
			 asliHouse.address= "16 Kenneth Ave.";
			 asliHouse.zipcode= "60070";
			 System.out.println("Asli's house has "+ asliHouse.window +" windows"+ " address is: "+ asliHouse.address + asliHouse.zipcode);
			 
			 //Create one more object with your name and change the number of door for your home.
			 //change number of window for your home.
			 //change address, zipcode for your home.
			 
			 
			 
		}
		
}

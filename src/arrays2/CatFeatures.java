package arrays2;

public class CatFeatures {

		
		int age= 3;
		String color= "white";
		String name = "oreo";
		int leg=4;
		int eyes=2;
		int heigth=1;
		int weigth=2;
		String eyescolor= "blue";
		String gender= "female";
		boolean hear= true;
		boolean noise= true;
		int speed= 10;
		
		public void move() {
			
			System.out.println("cat is movig"); //class is the blueprint of the object.Lets create
			                                    //the object.
		} 
		// create one method which called Speed. Return type is int and return 10 as speed.
		
		
		public int Speed() {
			System.out.println(speed);
			return speed;
		}
		public static void main (String[]args) {
			
	    CatFeatures cat = new CatFeatures();    //every 'new' keyword means creating the new class
		System.out.println(cat.name);
		cat.move();    // cat.move is method
		cat.Speed();
		
		
		String name= "  Techto rial  ";
		System.out.println(name.trim());   // name.trim 'de method. 
		
		
		}
		
		

	}



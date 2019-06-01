package arrays2;

public class Bird {
	
	int age= 7;
	String name= "cincan";
	double height = 0.2 ;
	int legs= 2;
	String color= "yellow";
	String gender= "male";
	int dateOfBirth= 03/06/2011;
	boolean speak= true;
	int wings= 2;
	boolean tail= true;
	boolean fly= true;
	String kind = "muhabbet"; //blueprint yapmis olduk simdiye kadar.
	int fligthDistance= 1000;
	boolean weather = true;
	
	
	public void fly() { // method name is fly
		
		System.out.println("cincan is flying");   //public static void main'den once methodu yaziyoruz.
	}
	
	public static void main(String[] args) {
		
		Bird bird = new Bird();  //this is the object 
		
		System.out.println(bird.name);
		System.out.println(bird.age);
		System.out.println(bird.legs);
		System.out.println(bird.gender);
		
		String birdName=bird.name;   //  bird.name 'i alip birdName olarak sakliyor.
		System.out.println(birdName);
		
		bird.fly();}  //only I am calling the method fly which I have created.
		
		                             // What is the difference between compile time error and
		                            // rintime error..??
		//Compile time error is string i integer altinda yazamayiz bunun gibi.
		//Runtime error is out of boundry gibi run ettikten sonra cikan hatalar.
		
		//create method called fly and print out "cincan is flying"
       

			
		
		
		
	}



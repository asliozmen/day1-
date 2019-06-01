package inheritanceOOP;

public class Zoo {

	public static void main(String[] args) {
	
		DonesticAnimals da= new DonesticAnimals();
			
		da.eat();
		da.run();
   //     da.walk   olmuyor cunku bu method wild animal class'da. No-relation as a parent-child.
		System.out.println("--------------------");
		Cat c= new Cat();
		c.sleep();
		c.eat();
		System.out.println("=================");
		Tiger t= new Tiger();
		t.walk();
		System.out.println("*************************");
		Animals a= new Animals();
		a.eat();
		
		//IS-
	
	}

}

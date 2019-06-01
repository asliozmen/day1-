package inheritanceOOP;
          // There is three ways of saying:
             // tiger IS A wildAnimals.
            // tiger inherite from WildAnimals.
             // tiger is subclass of WildAnimals.   
public class Tiger extends WildAnimals {    // One class only extend only from one class.

	@Override
	
	public void walk() {
		System.out.println("Tiger is walking");  // walk method is coming from wild animal class.
	}
	public void eat() {
		System.out.println("Tiger is eating");
	}
}

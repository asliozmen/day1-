package inheritanceOOP;

public class Animals {
	
	String animalName;
	
	public void run() {
		
		this.animalName= "animal";
		System.out.println(this.animalName+ "is running");
		
	}
    public void eat() {
    	System.out.println("Animal is eating");
    	
    }
    public void sleep() {
    
    System.out.println("Animal is sleeping");
}

}
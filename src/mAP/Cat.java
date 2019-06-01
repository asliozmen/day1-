package mAP;

public class Cat {
	
	private int age;
	private String name;
	private String kind;
	public Cat(String name, String kind, int age) {
     this.age= age;
     this.name=name;
     this.kind=kind;
	}
     public String getKind() {
    	 return kind;
     }
     public void setKind(String kind) {
    	 this.kind=kind;
     }
     public String getName() {
 		return name;
 	}
     public void setName(String name) {
    	 this.name=name;
     }
     public int getAge() {
    	 return age;
    	 }
    	public void setAge(int age) { 
    		this.age=age;
    	}
    	public void move(String direction ) {
    		System.out.println(name+ "is moving to the" + direction);
    	}
     
	 
	//create one method called move.
	//it'll take one parameter as direction string value and return the direction of cat.
	//nameOfCat is moving to the "Direction"
//up to here is one method.
	public void isOlder() {
		
	}
	//create another method called healthControl
	//the method will check if cat age is more than2
	// the cat sould go to the vet.
	//if cat age is more than 4, cat sould take one drug name is "Amoxilin"
	//create getters and setters.
	// Crate one method called isOlder
	// it will return true if the cat is more than 60 mothts
	
	
    	public void healthControl() {
    		if (age>=2 && this.age<4) {
    			System.out.println("This cat sould go to vet.");
    		}else if (this.age>4) {
    			System.out.println("This cat sould take one pill a day which name is Amoxilin.");
    		}
    		
    	}
}

package encapsulation;

public class TestPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		p1.setName("Michael");
		System.out.println(p1.getName());
		
		//p1.name="Michael";
		//System.out.println(p1.name); //public olunca boyle yapiyorduk.
        
		p1.setLastName("Clark");
		System.out.println(p1.getLastName());
		p1.setName("25");
		//System.out.println(p1.Age);
		
	}

}

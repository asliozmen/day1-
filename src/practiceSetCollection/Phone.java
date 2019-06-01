package practiceSetCollection;

import java.util.LinkedHashSet;

public class Phone {

	String name;
    String model;
    int price;
    
	public Phone (String name, String model, int price) {
		this.name= name;
		this.model=model;
		this.price=price;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Phone Nokia= new Phone("nokia","3310", 150);
		Phone IPhone= new Phone("iphone", "5S", 450);
		Phone Samsung= new Phone("samsung", "Galaxy", 650);
		Phone Google= new Phone("google phone","r30", 400);
		Phone Motorola=new Phone("motorola", "note", 1100);
		
		LinkedHashSet<Phone> linkedset= new LinkedHashSet<Phone>();
		linkedset.add(Nokia);
		linkedset.add(IPhone);
		linkedset.add(Samsung);
		linkedset.add(Google);
		linkedset.add(Motorola);
		
		for (Phone ph: linkedset) { // ph: burada for each loop alterate icin
		if (ph.price>= 1000) {
			System.out.println(linkedset);
		}
		
		}
		
		

	}

}

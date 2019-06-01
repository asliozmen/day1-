package methodPractice;

public class HumanTest {
	
	public static void main (String [] args) {
		
		Human man = new Human();
		System.out.println(man.age);
		man.run();
		System.out.println(man.increaseSpeed());
		System.out.println(man.name);
		System.out.println(man.brain);
		System.out.println(man.hairColor);
		System.out.println(man.eyes);
		man.study();
		System.out.println(man.increaseStudy());
		short sh=10;
		long ln=20;
		man.walkSpeed();
		System.out.println(man.walkSpeed);
		
		Human man2= new Human();
		man2.name= "Joseph";
		System.out.println("David's name is " +man2.name + "  anymore. I changed it:) ");
		System.out.println(man.country);//usa
		man.changeCountry("Mexico");
		System.out.println(man.country); //Mexico
		
		int stime= 4;
		System.out.println(man.studyTime); //4
		//man.changeStudyTime(stime); //print for this method is 10
		System.out.println(man.studyTime); //4
		System.out.println(stime); //4
		
		String name= "Academy";
		name= "techtorial";
		
		//System.out.println(man.changeName(man)); //Techtorial
		System.out.println(name);
		//man.changeName(man);
		System.out.println(name);
		
		
		
		
		
		
		
		
		
	}
	
	

}

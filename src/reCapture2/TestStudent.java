package reCapture2;

public class TestStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.name="John";
		System.out.println(s1.name);
		
		Student s2 = new Student();
		s2.name="Tim";
		System.out.println(s2.name);
		System.out.println(s1.name);
		
		Student s3= new Student();
		s3.name ="Sarah";
		System.out.println(s3.name+s1.name+s2.name);    // Eger string static ise butun objectler icin ayni oluyor.

	}

}

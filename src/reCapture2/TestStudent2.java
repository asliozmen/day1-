package reCapture2;

public class TestStudent2 {
	
	public static void main (String[] args) {
	
	Student s1= new Student();
	Student s2= new Student();
	Student s3= new Student();
	Student s4= s2;
	
	System.out.println("s1: "+ s1.hashCode());
	System.out.println("s2: "+ s2.hashCode());
	System.out.println("s3: "+ s3.hashCode());
	System.out.println("s4: "+ s4.hashCode());
	
	s1=s2;
	s3=s1;
	System.out.println("++++++++++++++++");
	
	System.out.println("s1: "+ s1.hashCode());
	System.out.println("s2: "+ s2.hashCode());
	System.out.println("s3: "+ s3.hashCode());
	System.out.println("s4: "+ s4.hashCode());
	
	String name= new String ("Adam");    // String name1="Adam";  Bu stringpool'da       oburu new object heapte
	
	}
}

package reCapture2;

public class Student {
	
	String name;    // buradaki stringin static olup olmamasina gore teststudentda variablelar assign oluyor.
	int age;
	
	public void study() {     // eger burada public static void deseydik sadece static olan variablelara ulasa
		                        // biliyorduk. non=statik method icin ise fark etmiyor.
		
		System.out.println(name + "is studing");
		System.out.println(age);
	}

}

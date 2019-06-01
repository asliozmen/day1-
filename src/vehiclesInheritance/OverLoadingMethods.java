package vehiclesInheritance;

public class OverLoadingMethods {
	public Number method(Number n) {
		System.out.println("method that accepts as a parameter Number");
		return n;
	}
    public Number method(Integer n) {
    	System.out.println("method that accepts as a parameter Integer");
    	return n;
    }
    public Number method (String n) {
    	System.out.println("method that accepts as a parameter String" );
    	return 5;
    }
    //covariant
    public static void main (String[] args) {
    	OverLoadingMethods om= new OverLoadingMethods();
    	om.method(5.77);
    }
}

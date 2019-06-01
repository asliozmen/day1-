package operators;

public class ExampleFive {

	public static void main(String[] args) {
		
		double a = 25.64;
		int b = 25;
		a = a % 10; // 25.64 / 10 = 2.564 => 25.64- 20= 5.64
		b = b % 10; // 25/10 =2.5 ==> remainder is 5 
		
		System.out.println( a + "      " + b);

	}

}

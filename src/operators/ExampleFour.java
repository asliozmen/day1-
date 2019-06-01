package operators;

public class ExampleFour {

	public static void main(String[] args) {
		
		int a = 29;
		int b = 5;
		int c = 2;
		
		int d = a% b% c ;
		// a % b --> 29 / 5 = 4-->remainder then %c yani 4/2-->remainder is 0.
		System.out.println("d is : "+ d);

	}

}

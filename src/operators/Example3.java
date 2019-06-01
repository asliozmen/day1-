package operators;

public class Example3 {

	public static void main(String[] args) {
		
		int num1=5;
		int num2=8;
		int num3=2;
		
		int result= num1++ + num2 + num1;
		System.out.println(result);
		
		int result2= num1 + ++num2 + num1;
		System.out.println(result2);

	}

}

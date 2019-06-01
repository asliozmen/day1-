package operators;

public class incrementOperator {
	
	public static void main(String[] args) {
		
		int a=25;
		int b=4;
		int c=a++ + ++b;
		System.out.println (c+a);
		
		int d=26;
		System.out.println(d-- == a++);
	}

}

package operators;

public class ExampleSix {

	public static void main(String[] args) {
		
		int a = 6;
		int b = a++; // b=6
		int c = ++b + 5;// c= 7+5=12
		int result = c % 2; // 12/2= remainder is 0 so result is 0. 
		
		System.out.println(result);
		
		
//		b = --c;       // 12-1 = 11
//		b--;           //11
		//a = b +  ++c; //(11-1)-->10 + (12+1 -1)-->12= 22
		
		//System.out.println(a);
		
		

		

	}

}

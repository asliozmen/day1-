package exceptionsWithTemirlanjune1;

public class WrappingAnException {

	public static void main(String[] args) {
     
		int num=4;
		
		try {
		System.out.println((num/0));
		}catch (ArithmeticException ex) {
			System.out.println("Sorry this operation is undefined.");
		}
	}

}

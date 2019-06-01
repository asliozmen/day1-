package operators;

public class PrimeNumbers {

	public static void main(String[] args) { // 1 ve kendisinden baska sayiya bolunemeyen sayiya prime number deniyor.
		
		int num = 0;
		
		while (num<=100) {
			if ((num>0 && (num %2 !=0 && num %3 != 0 && num %5 !=0 && num %7 != 0 ) || num ==2|| num==3 || num ==5 || num ==7 )) 
			{
			System.out.println(num);
			}
			num++;
		} 
		

	}

}

package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicArrayList {

	public static void main(String[] args) {
	
		int[] number =new int[5];
		number[0]=1;
		number[1]=5;
		System.out.println(Arrays.toString(number));
		System.out.println(number[1]);
//Main difference in array and array list size array is the fixed size. Array list resizable.
	ArrayList bankCards = new ArrayList ();
	bankCards.add("Visa");
	bankCards.add("MasterCard");
	bankCards.add(2123456);  //integer Wrapper class
	bankCards.add(false);    //boolean Wrapper class
	System.out.println(bankCards);
	
	bankCards.add(1,"Amex");
	System.out.println(bankCards);
	bankCards.add(3, "Discovery");
	System.out.println(bankCards);
	bankCards.add(3,"Chase");
	System.out.println(bankCards);
	
	System.out.println(bankCards.get(5));
	bankCards.add(2, 8888888);
	System.out.println(bankCards);
	
	for (Object bc:bankCards) {
		System.out.println(bc);     // array list icin for-loop boyle yapiliyor.
	}
		System.out.println("====================");
		for (int i=0 ; i<bankCards.size();i++) {
		System.out.println(bankCards.get(i));
		}
			
		}
	}
	



package arrayList;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> phoneParts=new ArrayList<>();
		phoneParts.add("charger");
		phoneParts.add("battery");
		phoneParts.add("screen");
		phoneParts.add("headphones");          
		phoneParts.add("microphone");       // burada<> diamond brakets icine yazdigimiz cins veri
		                                    // girebiliriz yani integer olmaz kabul etmiyor.
       System.out.println(phoneParts);
       phoneParts.remove("charger");
       System.out.println(phoneParts);
       phoneParts.remove(0);
       System.out.println(phoneParts);
       
       phoneParts.set(0, "camera");
       System.out.println(phoneParts);
       
       ArrayList<Integer>numbers=new ArrayList<>();
       numbers.add(12);
       numbers.add(56);
       numbers.add(2);
       numbers.add(5);
       numbers.remove(4);
       System.out.println(numbers);       // we have these methods for Arraay List;
                                           // add (2 types), set, remove, size 
	}

}

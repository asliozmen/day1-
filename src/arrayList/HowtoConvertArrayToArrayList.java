package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HowtoConvertArrayToArrayList {

	public static void main(String[] args) {
		
		String[] city= {"Chicago", "Milwaukee","LosAngeles"};
		List cityofUS= Arrays.asList(city);  // convert array to arrayList
		//once you convert from ArrayList is fixed size.You can not add you can not
		//remove value.. but you can set.
		List<String>names= new ArrayList<String>();
		
		names.add("Muammer");
		names.add("Tima");
		names.add("Arslan");
		System.out.println(names);
		// String[] nameOf= list.toArray();  //ArrayList to Array
 		int [] Ages = {13,14,15,16};
 		List Age= Arrays.asList(Ages);
 		System.out.println(Ages);
	}

}

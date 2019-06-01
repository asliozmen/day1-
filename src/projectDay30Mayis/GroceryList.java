package projectDay30Mayis;

import java.util.ArrayList;
import java.util.List;

public class GroceryList extends GroceryBuddy {

	ArrayList listOfPurchasedList= new ArrayList();
	
	public List shoppingList(String item) {
		
		for (int i=0; i<Fruits.length; i++) {
			if (item.equalsIgnoreCase(Fruits[i])) {
				listOfPurchasedList.add(item);
				return listOfPurchasedList;
			}
		}
		
		for (int k=0; k<Vegatables.length;k++) {
			if(item.equalsIgnoreCase(Vegatables[k])) {
				listOfPurchasedList.add(item);
				return listOfPurchasedList;
			}
		}
		System.out.println("this item is not avalible.");
	}
}

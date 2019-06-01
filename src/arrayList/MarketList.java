package arrayList;

import java.util.ArrayList;
import java.util.List;

public class MarketList {

	
		
	static List itemsToBuy;
	
	static {
		itemsToBuy= new ArrayList<>();
		itemsToBuy.add("milk");
		itemsToBuy.add("Bread");
		itemsToBuy.add("sugar");
		
		System.out.println("Welcome to grocery store");
		//System.out.println(itemsToBuy);
		
		shoppingList(); //bu methodu olusturduk niye 'listeyi gormek icin.
	}
 public static void shoppingList() {
	 System.out.println(itemsToBuy);
 }
 
 public static void buy(String item) { //yeni bir method yazmak istedik. unutulan item icin.
	 itemsToBuy.add(item);
	 shoppingList();
 }
 public static void buy (String item1, String item2) {
	 itemsToBuy.add(item1);
	 itemsToBuy.add(item2);
	 shoppingList();
 }
 public static void returnItem(String item) {
	 itemsToBuy.remove(item);
	 shoppingList();
	 
 }
	 public MarketList() {
		 
		 System.out.println("In the car");
	 }
 }


package arrayList;

public class Buyer {

	public static void main(String[] args) {
		
		MarketList buyer1= new MarketList();
		
		buyer1.buy("Coffee");
       
		buyer1.returnItem("milk");
		
		buyer1.buy("eggs", "chocolate");  //method overloading yapmis olduk. otherwise you can not add more than one item at once.
	}

}

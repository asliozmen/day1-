package projectDay30Mayis;

public class  GroceryBuddy extends CheckOut{


		
		
		
		String[] Fruits= {"Apple", "Orange", "Watermelon", "Banana", "Pineapple", "Grape","Mango", "Strawberry", "Peach", "Cherry. "};
		String[] Vegatables= {"Carrots", "Broccoli", "Onion", "Potato", "Tomato", "Cucumber",
				"Corn", "Bean", "Spinach", "Pepper"};
		String[] Others= {"Milk", "Bread", "Beef", "Eggs", "Chicken", "Sugar" , "Salt" ,
				"Coffee", "Rice", "Pasta"};
		
		
		double [] PriceFruits= {2.99, 1.99,3.99,2.49,0.99,1.69,2.49,4.99,3.39,1.79};
		double [] PriceVegatables= {3.99,4.9,5.00,1.49,0.99,1.69,2.49,2.99,3.39,1.79};
		double [] PriceOthers= {2.49, 4.40,7.99,2.49,5.99,6.70,0.99,4.99,8.39,1.79};
		
		
		public void printFruit() {
			for(String printFruit:Fruits) {
				System.out.println(printFruit);
			
			
		}
		public void printVeggie() {
			for (String printVegatables:Vegatables)
			System.out.println(printVegatables);
				
			}
		public void printOthers() {
			for (String printOthers1:Others)
				System.out.println(printOthers1);
			
		}
        public double getPrice(String name) {
        
        double price=0.0;
        for (int i=0; i<Fruits.length; i++) {
        	if (name.equalsIgnoreCase(Fruits[i])) {
        		price=PriceFruits[i];
        		return PriceFruits[i];
        	}
        }
             for (int k=0; k<Fruits.length;k++) {
            	 if (name.equalsIgnoreCase(Vegatables[k])) {
            		 price=PriceVegatables[k];
            	 }
             }
            for (int  j=0;j<Fruits.length; j++) {
            	if (name.equalsIgnoreCase(Others[j])) {
            		return PriceOthers[j];
            	}
             
             
             
             
        
        
        
        
        
		
		
		
		
		
		
		
		
			
			 
				
			 
			// System.out.println(Fruits[i]);
	}

}}

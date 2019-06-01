package arrayList;

public class CarTaskWithMuammer {
	
	private String name;
	private int year;
	private double price;
	
	public String getName() {
		return this.name;
		
	}
     public void setName(String name) {
    	 this.name=name;
     }
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public CarTaskWithMuammer(String name) { // constractor yapmaya basliyor.
		this.name=name;
				}
	
	
	public CarTaskWithMuammer (String name, int year, double price) {	
	}

}

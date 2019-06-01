package arrayList;

class ArrayListPractice3 {
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	String name;
	double price;
	int year;
	private void Car() {
		getJobDetails();
	}
	private ArrayListPractice3(String name) {                     
		this.name= name;  
		getJobDetails();
	}
	
	private ArrayListPractice3(String name,double price, int year) {
		this.name=name;
		this.price=price;
		this.year=year;
	}
	private void getJobDetails() {
		System.out.println("Name of the car is : "+name+ "Price of the car is: "+ price+ "year is:" + year);
	}

}

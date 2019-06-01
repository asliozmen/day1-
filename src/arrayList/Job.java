package arrayList;

public class Job {

	String title;
	double salary;
	String location;
	public Job() {
	getJobDetails();
	}
	public Job(String title) {                     //constractor
	this.title= title;  
		getJobDetails();// this kullanmasaydik stringten sonraki title'i anlardi
	}
	public Job (String title, double salary) {  //constractor
		this.title=title;
		this.salary=salary;
	}
	public Job(String title,double salary, String location) {
		this.title=title;
		this.salary=salary;
		this.location=location;
	}
	public void getJobDetails() {
		System.out.println("Title is : "+ title+ "Salary is: "+ salary+ "Location is:" + location);
	}
}

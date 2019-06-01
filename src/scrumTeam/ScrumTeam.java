package scrumTeam;

public class ScrumTeam {
	private String ID;
	private String position;
	private int salary;
	private static final String COMPANY;  //final means its value will be same.and value should be in uppercase.if we dont give value
	                                                // here it will be complain. there is two way one you can give the value in static block or
	                                              // instance block. if it is static 
	
	static {
		COMPANY="Google";
		System.out.println("Scrum team static block");                
		
	}
	{
		System.out.println("Scrum team instance block");
		
	}
     public ScrumTeam() {
    	 System.out.println("Scrum team constractor");
    	 
     }
     public void work() {
    	 System.out.println("Scrum team is working in 5'th sprint");
    	 
     }
     public static int calculateSalary(int hours) {
    	 return 0;
     }
}

package methodPractice;

public class BankAccount {
	
	int balance= 1000;
	String clientName= "David";
	String clientLastName= "Musk";
	String clientDOB = "01/01/1973";
	
	
	
	
	public int increaseBalance(int balance)  { // Burada method create ettik simdi burada orginal
		                                       // balance 1000.
		
		balance += balance ; // balance += balance buradaki balance'lar copy 
		
		return balance; // 2000 is the return for thid method.
	}
    public void decreaseBalance(int number) {  //number is local variables
	 
	 number-= 200;
	 
	 System.out.println("Number inside the method is " + number); }
    
    public void chancename(String name) {
    	
    	name ="BankAccount";
    	System.out.println(name);
    	}
    
    public void chanceLastName () {
    clientLastName= "Turan";
    	
    }
	public void changeDOB(String string) {
		// TODO Auto-generated method stub
		
	}
}

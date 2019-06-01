package methodPractice;

public class BankAccountTest {

	public static void main(String[] args) {
		
		BankAccount account= new BankAccount();
		
		System.out.println(account.balance);
		
		System.out.println(account.increaseBalance(account.balance));
		
		System.out.println(account.balance);
		
		int number=300;     //Yeni bir method yaziyoruz.
		
		account.decreaseBalance(number);  //Java is pass by value for primitives.
		
		System.out.println(number);
		
		int addValue = 1000;
		
		System.out.println (account.increaseBalance(addValue)); //2000
		
		System.out.println(addValue); // 1000
		
//		String name = "Techtorial";
//		account.chanceLastName();  // Bank account.. This is the copy 
//		Systen.out.println(name); // Techtorial
//		
//		account.chanceLastName(); // Musk
//		System.out.println(account.clientLastName);
//		
//		account.chanceLastName();
//		System.out.println(account.clientLastName);
//		
//		account.changeDOB ("05/10/1988");
//		System.out.println(account.clientDOB);
//		
		

	}

}

package exceptions;

public class CheckedAndUnchecked {

	public static void main(String[] args) {
		//Kendime not: exceptionla ilgili dallanmis charti ezberlesen iyi olur.
		
		try {
		
		String name= null;
		
		int length=name.length(); //unchecked exception. bunu onlemek icin try and catch satiri yaziyoruz.
		
	    }catch(NullPointerException exception) {
	    	
		System.out.println("There is an exception");
		System.out.println(exception.getClass());
	}
		try {
		Thread.sleep(5000);
	}catch (Exception e) {
		System.out.println("There migth be an exception.");
	}
		try {
		int  number= 25/0;  //Burada unchecked exception oldugundan supheleniyorsam yakalamaya calisiyorum..
		}catch (Exception e) {
			System.out.println("this is exception i caught:"+ e.getMessage() );
		}
	}
}

package methodRecapute;

public class Amazon {
	
	public static void navigate(String url) {
		System.out.println("Navigate to " + url);
	}
    public static void login (String userName, String password) {
    	System.out.println ("Logging in to with "+ userName + " and " + password);
    }
    public static void search (String item) {
    	System.out.println ("Searching for " + item);
    }
}

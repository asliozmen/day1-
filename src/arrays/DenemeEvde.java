package arrays;

public class DenemeEvde {

	public static void main(String[] args) {
		
		String success1="     doing  what   ever  it  takes !     ";
		
          success1=success1.toUpperCase().trim().substring(7,12).replace("T","s");
          
          System.out.println(success1);
          
          String adress= "Hoffmann Estates";
          
          System.out.println(adress.indexOf('s',11));
          
          System.out.println(adress.length());
          
          System.out.println(adress.startsWith("h"));
  		
          System.out.println(adress.equalsIgnoreCase("hoffmann estates"));
          
          System.out.println(adress.startsWith("h"));
          
          String word = "JAVA";
          
          int length=word.length();
          for (int i=length-1 ; i>=0; i--) {
          
          System.out.println(word.charAt(i));
          
	}
	}
}
      
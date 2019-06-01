package exceptions;

public class RunTimeException {

	public static void main(String[] args) {
    String[] str= {"one","two","three"};
    
    try {
        System.out.println("This is in try block.");
    	System.out.println(str[3]); //index 3'de bisey yok.OutOfBoundry Exception.. Try-catch yapabiliriz.
        System.out.println("This line will not executed");
    
    }catch (Exception e) {
    	
    	System.out.println(e.getClass());
    }
       System.out.println("Code is done"); 
       
       //Birden fazla catch kullanabiliyoruz.Second one should be unrelated or superclass.
       
       
       String[] str2= {"Ali","Ayse","Ahmet","Veli"};
       
       try {
    	   System.out.println(str2[4]);
       }catch (NullPointerException e) {
    	   
    	   System.out.println("First catch block");
       }catch (ArithmeticException e) {
    	   System.out.println("Second catch block");
      }catch (ArrayIndexOutOfBoundsException e) {
    	   
    	   System.out.println("Third catch block");
       }finally {
    	   System.out.println("Final");
       }
       
	}

}

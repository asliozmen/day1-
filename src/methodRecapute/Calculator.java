package methodRecapute;

public class Calculator {
	
       public int add (int a, int b) {         // non-static method type.
    	   int sum = a+b;
    	   return sum ;
       }
       public static int substract (int a, int b) {
    	   int result= a-b;
    	   return result;
       }
       public int multiply (int a, int b) {
    	   return a*b;
    	   
       }
       public int division (int a, int b) {
    	   return a/b;
       }
}

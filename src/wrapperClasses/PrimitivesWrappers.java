package wrapperClasses;

public class PrimitivesWrappers {

	public static void main(String[] args) { 
	 
		int num =55;
		Integer num2 = new Integer (12);  
		long num3=234567; 
		Long num4=new Long (54555);
		
		int num5= num2; // here we coverted num2 from wrapperclasses to primitive type. Bunun adi UNBOXIG.
		Integer num6 = num5; // buradada primitiveden wrapperclassa cevirmis olduk. bunun adi AUTOBOXING.

		String number = "123";
		Integer number1 = Integer.valueOf(number); //coverting String to Integer
		Integer number2= Integer.parseInt(number); // converting String to int
		
		Double number3 = Double.valueOf(number);
		double number4=Double.parseDouble(number);
		
		Double d1= new Double(2.5);
		Double d2= new Double(2.5);
		
		System.out.println(d1==d2);// comparing two references
		System.out.println(d1.equals(d2));
		
		double d3=55;
		double d4=55;
		
		System.out.println(d3==d4);
	}

}

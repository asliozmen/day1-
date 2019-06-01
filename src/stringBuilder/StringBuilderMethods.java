package stringBuilder;

public class StringBuilderMethods {

	public static void main(String[] args) {
		
		
		StringBuilder word1 =new StringBuilder();
		
		word1.append("Java");
		word1.append("Programming");
		System.out.println(word1);
		//Java - Programming
		String word= "Java Programming";
		word= "Java - Programming"; // reassign etmemiz gerekiyordu.
		
		word1.insert(4, "-");
		System.out.println(word1);
		word1.insert(4, " ");
		System.out.println(word1);
		
		String word2= word1.toString();//StringBuilder to String
		String word3="language";
		StringBuilder word4= new StringBuilder(word3);// String to StringBuilder
		
		String word5 ="techtorial";
		System.out.println(new StringBuilder(word5).reverse().toString()); //tersten yazdirma

		//delete
		StringBuilder str1= new StringBuilder("Tea cup.");
		str1.delete(7, 8);
		System.out.println(str1);
		str1.delete(str1.indexOf("a"), str1.indexOf("a")+1);  // a'dan basla bir sonrakine kadar
		System.out.println(str1);
		
		System.out.println(str1.substring(str1.indexOf("c"), str1.indexOf("c")+1));
		
		
		
		
		
	}

}

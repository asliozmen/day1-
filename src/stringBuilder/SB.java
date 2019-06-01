package stringBuilder;

public class SB {

	public static void main(String[] args) {
		
		StringBuilder builder= new StringBuilder();
		builder.append("hello");
		builder.reverse();
		System.out.println(builder);  // hello nun polindrome olup olmadigini check etmek;
		
		if (builder.equals(builder.reverse().toString())) {
			System.out.println("This is polindrome");
		} else {
			System.out.println("this is not polindrome");
		}
		StringBuilder sb1=new StringBuilder("World");
		StringBuilder sb2=new StringBuilder("World");
		
		sb1.toString();
		sb2.toString();
		
		System.out.println(sb1.equals(sb2));
	}

}

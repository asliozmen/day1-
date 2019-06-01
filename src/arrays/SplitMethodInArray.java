package arrays;

public class SplitMethodInArray {

	public static void main(String[] args) {
	
		String str = "Hello World 2019";
		
		String str1 = "Hello World 2018";
		
		String str2 = "Hello World 2017";
		
		String str3 = "Hello World 2016";
		
		String [] st= str.split("  ");
		String [] st1= str1.split(" ");
		String [] st2= str2.split(" ");
		String [] st3= str3.split(" ");
		
		System.out.println(st[2].equals("2019"));
		System.out.println(st1[2].equals("2018"));
		System.out.println(st2[2].equals("2017"));
		System.out.println(st3[2].equals("2016"));

		
		
		
		
		
		
		

	}

}

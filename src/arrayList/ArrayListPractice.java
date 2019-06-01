package arrayList;

public class ArrayListPractice {
	
	public static void main (String[]args) {
//giving String str= "BDAKKLIOPLKKF";
	//Create a StringBuilder and do task below
	//Task1: delete the first and last occurance of K
	//Task2: From the left over change the firts occurance of K to M
	//Task3: insert "bility" after letter A
	
	
	StringBuilder str= new StringBuilder("BDAKKLIOPLKKF");
	
	str.deleteCharAt(3);
	//str.delete(4,8);
	System.out.println(str);
	
	str.deleteCharAt(11);
	System.out.println(str);
	
	str.replace(3, 4, "M");
	System.out.println(str);
	
	str.insert(3, "bility");
	System.out.println(str);
	// String word= "DBAF123GYPRJKIRAMBDACEDCMJK"; AABDACDC
	//Create stringbuilder object
	//Append all the letter between A and D if it is avalible in 
	//string word (A B C D)
	
	String word="DBAF123GYPRJKIRAMBDACEDCMJK";
	StringBuilder strB= new StringBuilder();
	
	for(int i=0; i<word.length(); i++) {
		System.out.print(word.charAt(i)+ " ");
	
		if ( word.charAt(i)>= 'A'&& word.charAt(i)<='D') {
	    // veya 
		}	
//if(word.charAt(i)=='A'||word.charAt(i)=='B'||word.charAt(i)=='C'||word.charAt(i)=='D') {
 //strB.append(word.charAt(i));


	System.out.println();
	System.out.println(strB);

	
	}
	}
	}
	 
	
	
	


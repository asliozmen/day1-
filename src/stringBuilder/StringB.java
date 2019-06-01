package stringBuilder;

public class StringB {

	public static void main(String[] args) {
		StringB fruit = new StringB();
		fruit.append("apple");
		fruit.append("orange");
		System.out.println(fruit);
		//fruit.reverse();
		
		
		String fruit2=new String();
		System.out.println(fruit);
		
		
		
		StringB email= new StringB();
		System.out.println(email.hashCode());
		email.append("Dear John");
		email.append("\n Writing regarding my vacation.");
		email.append("\n I am planing my vacation between 5/25 and 5/30,");
		email.append("can you please approve my vacation");
		email.append("\n\n Regards,");
		email.append("\n Mike");
		
		System.out.println(email);
		
		//String fruit2 = new String();
		fruit2=fruit2.concat("banana");
		System.out.println(fruit2 + " "+ fruit2.hashCode());
		String newValue="orange";
		System.out.println(newValue);
		fruit2=fruit2.concat(newValue);
		System.out.println(fruit2+ " "+ fruit2.hashCode());
		String f1="banana";
		System.out.println(f1.hashCode());
		
		
		
		
		
		
		

	}

	private void append(String string) {
		
		
	}

}

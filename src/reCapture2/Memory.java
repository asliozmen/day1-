package reCapture2;

public class Memory {

	public static void main(String[] args) {
		
		
		String animal= new String("Monkey");
		String animal2= new String("Monkey");
		
		System.out.println(animal == animal2);
		System.out.println(animal.contentEquals(animal2));
		
		String fruits = "apple";
		String fruits1= " apple";
		System.out.println (fruits==fruits1);
		System.out.println(fruits.equals(fruits1));

	}

}

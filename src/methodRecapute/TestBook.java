package methodRecapute;

public class TestBook {

	public static void main(String[] args) {
		
		Book b1= new Book();
		
		System.out.println(b1.getBookInfo());
		System.out.println(b1.count);
		System.out.println("=================");
		
		Book b2 = new Book ("John");
		
		System.out.println(b2.getBookInfo());
		System.out.println(b2.count);
		
		Book b3 = new Book("Tom", "Java OCA");
		
		System.out.println(b3.getBookInfo());
		
		System.out.println("-----------------");
		
		Book b4 = new Book ("Jake", "Ramadan", 500 , 1000);
		
		System.out.println(b4.getBookInfo());
		
		System.out.println(b4.count);

	}

}

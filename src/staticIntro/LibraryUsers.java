package staticIntro;

public class LibraryUsers {
	
	public static void main(String[] args) {
		
		Library libUser1 = new Library("Techtorial");   // parametreye ismimizi yazmadan olmadi.
		
		while (libUser1.checkOutBook()) { // boolean oldugu icin boyle yazabiliyoruz dogru ise yoksa else gidiyor.
			
			System.out.println("Successfully checked a book out of library");
			System.out.println ("Avalible number of books in our library is :" + Library.numOfBooks);
			
		} 
			System.out.println("Sorry, no books avalible in the library");
		
		
	}

}

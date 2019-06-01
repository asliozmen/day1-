package methodRecapute;

public class Book {
	
	String author;
	String title;
	int page;
	int price;
	static int count;       // simdi constractor olusturalim.
	
	public Book() {        // non-argument constractor. no parameter.
		count++;
		}
	public Book(String author) {
		
		this.author= author; // static olmayan variablesleri this ile mthod disindan cagir
	    count++;
	}
    public Book(String author, String title) {//bu parametreleri baslangictaki variableslara nasil assign ediyot
    this.author= author;
    this.title = title;
    count++;
    
    }
    public Book (String author, String title, int page) {
    	this.author= author;
    	this.title = title;
    	this.page = page;
    	count++;
    }
    public Book (String author, String title, int page, int price) {
    	this.author=author;
    	this.title=title;
    	this.page= page;
    	this.price= price;
    	count++;
    }
    public String getBookInfo() {
    	return "Author is: "+ author + "\nTitle :" + title + " \nPage: " + page + "\nPrice :" + price ;
    }
    	
    }
    	
    	
    	
    	
    	
    	
    	
    

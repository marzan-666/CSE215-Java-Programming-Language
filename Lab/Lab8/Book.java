package Lab8;


public class Book {
	private int isbn;
	private String title;
	private String author;
	private double price;
	
	public Book(int isbn ,String title,String author,double price){
		this.isbn=isbn;
		this.title=title;
		this.author=author;
		this.price=price;
		
	}
	public String toString(){
		return "isbn:"+isbn+"\ntitle:"+title+"\nauthor:"+author+"\nprice:"+price;
		
	}


}

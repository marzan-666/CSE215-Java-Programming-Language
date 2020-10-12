package Lab8;


public class Ebook extends Book {
	private String downloadURL;
	private double sizeMB;
	
	public Ebook(int isbn, String title, String author, double price,String downloadURL,double sizeMB) {
		super(isbn, title, author, price);
		this.downloadURL=downloadURL;
		this.sizeMB=sizeMB;
		//System.out.println("Constructor in Ebook class");
		
	}
	public String toString(){
		return super.toString()+"\ndownloadURL:"+downloadURL+"\nsizeMB:"+sizeMB ;
	}

	


}

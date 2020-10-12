package Lab8;


public class PaperBook extends Book{
	private double shippingWeight;
	private boolean inStock;

	public PaperBook(int isbn, String title, String author, double price,double shippingWeight,boolean inStock) {
		super(isbn, title, author, price);
		this.shippingWeight=shippingWeight;
		this.inStock=inStock;
	}
	public String toString(){
		return super.toString()+"\nweight:"+shippingWeight+"\nStock:"+inStock;
	}
	

}

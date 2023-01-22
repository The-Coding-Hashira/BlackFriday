
public class Books extends Product {
	String author;
	String title;
	
	public Books(String inventoryNumber, double price, int quantity, Provider provider, String author, String title) {
		super(inventoryNumber, price, quantity, provider);
		this.author = author;
		this.title = title;
	}
	
	@Override
	public double getPromotionalPrice() {
		price = price - price*50/100;
		return price;
	}
	@Override
	public boolean sellProduct(int piece) throws NoMoreProductsException {
		if(quantity - piece >= 0) {
			quantity -= piece;
			return true;
		} else {
			throw new NoMoreProductsException("Not enough products!");
		}
	}
	@Override
	public String toString() {
		return "Books [author=" + author + ", title=" + title + ", inventoryNumber=" + inventoryNumber + ", price="
				+ price + ", quantity=" + quantity +"] "+ provider.toString();
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}

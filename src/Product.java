
public abstract class Product {
	String inventoryNumber;
	double price;
	int quantity;
	Provider provider;
	
	public Product(String inventoryNumber, double price, int quantity, Provider provider) {
		this.inventoryNumber = inventoryNumber;
		this.price = price;
		this.quantity = quantity;
		this.provider = provider;
	}
	
	public abstract double getPromotionalPrice();
	public abstract boolean sellProduct(int piece) throws NoMoreProductsException;

	public String getInventoryNumber() {
		return inventoryNumber;
	}

	public void setInventoryNumber(String inventoryNumber) {
		this.inventoryNumber = inventoryNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

}

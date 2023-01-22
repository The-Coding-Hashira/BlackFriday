
public class Electronics extends Product {
	String manufacturer;
	String model;
	
	public Electronics(String inventoryNumber, double price, int quantity, Provider provider, String manufacturer,
			String model) {
		super(inventoryNumber, price, quantity, provider);
		this.manufacturer = manufacturer;
		this.model = model;
	}
	
	@Override
	public double getPromotionalPrice() {
		price = price - price*10/100;
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
		return "Electronics [manufacturer=" + manufacturer + ", model=" + model + ", inventoryNumber=" + inventoryNumber
				+ ", price=" + price + ", quantity=" + quantity +"] "+ provider.toString();
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
}

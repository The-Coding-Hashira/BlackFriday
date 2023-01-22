import java.io.IOException;

public class BlackFriday {
	public static Electronics[] Electronics;
	public static Books[] Books;
	
	public static void processSales() {
		ProductLoader load = new ProductLoader();
		int electronics = 0;
		int books = 0;
		
		try {
			Object[] products = load.importDataFromFile();
			for(int i = 0; i < products.length; i++) {
				if(products[i] instanceof Electronics) {
					electronics++;
				} else if(products[i] instanceof Books) {
					books++;
				} else {
					System.out.println("Unknown product!");
				}
			}
			
			Electronics = new Electronics[electronics];
			Books = new Books[books];
			electronics = 0;
			books = 0;
			
			for(int i = 0; i < products.length; i++) {
				if(products[i] instanceof Electronics) {
					Electronics[electronics] = (Electronics) products[i];
					electronics++;
				} else if(products[i] instanceof Books) {
					Books[books] = (Books) products[i];
					books++;
				} else {
					System.out.println("Unknown product!");
				}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}

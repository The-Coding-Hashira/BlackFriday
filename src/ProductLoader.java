import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProductLoader implements ImportData {
	private final String PRODUCTS_FILE = "salesproducts.txt";

	@Override
	public Object[] importDataFromFile() throws IOException {
		
		try(BufferedReader in = new BufferedReader(new FileReader(PRODUCTS_FILE))){
			Object[] products = new Object[getNumberOfRows()];
			
			for(int j = 0; j < getNumberOfRows(); j++) {
				String line = in.readLine();
				if(line.startsWith("1")) {
					Electronics el = new Electronics(null, 0, 0, null, null, null);
					Provider pro = new Provider(null,null);
					String[] arrLine = line.split("#");
					
					pro.setName(arrLine[1]);
					pro.setPhoneNumber(arrLine[2]);
					el.setProvider(pro);
					
					el.setInventoryNumber(arrLine[3]);
					el.setPrice(Double.parseDouble(arrLine[4]));
					el.setQuantity(Integer.parseInt(arrLine[5]));
					el.setManufacturer(arrLine[6]);
					el.setModel(arrLine[7]);
					
					products[j] = el;
					
				} else if(line.startsWith("2")) {
					Books bk = new Books(null, 0, 0, null, null, null);
					Provider pro = new Provider(null, null);
					String[] arrLine = line.split("#");
					
					pro.setName(arrLine[1]);
					pro.setPhoneNumber(arrLine[2]);
					bk.setProvider(pro);
					
					bk.setInventoryNumber(arrLine[3]);
					bk.setPrice(Double.parseDouble(arrLine[4]));
					bk.setQuantity(Integer.parseInt(arrLine[5]));
					bk.setAuthor(arrLine[6]);
					bk.setTitle(arrLine[7]);
					
					products[j] = bk;
				} else {
					System.out.println("Error recognizing the product!");
				}
			}
			return products;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	private int getNumberOfRows() throws IOException {
		int i = 0;
		BufferedReader in = new BufferedReader(new FileReader(PRODUCTS_FILE));
		while(in.readLine()!=null) {
			i++;
		}
		in.close();
		return i;
	}

}

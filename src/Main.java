
public class Main {

	public static void main(String[] args) {
		BlackFriday.processSales();
		for(int i = 0; i < BlackFriday.Electronics.length; i++) {
			System.out.println(BlackFriday.Electronics[i].toString());
		}
		
		for(int i = 0; i < BlackFriday.Books.length; i++) {
			System.out.println(BlackFriday.Books[i].toString());
		}

	}

}

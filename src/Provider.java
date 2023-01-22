
public class Provider {
	String name;
	String phoneNumber;
	
	public Provider(String name, String phoneNumber) {
		this.name = name;
		try {
			if(phoneNumber == null) {
				this.phoneNumber = null;
			}
			else if(ValidatePhone.validatePhoneNumber(phoneNumber)) {
				this.phoneNumber = phoneNumber;	
			}
		} catch(WrongPhoneNumberException e) {
			System.out.println(e.getMessage());
		}
	}
	@Override
	public String toString() {
		return "Provider [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		try {
			if(ValidatePhone.validatePhoneNumber(phoneNumber)) {
				this.phoneNumber = phoneNumber;	
			}
		} catch(WrongPhoneNumberException e) {
			System.out.println(e.getMessage());
		}
	}
	
}

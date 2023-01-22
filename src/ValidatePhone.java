import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface ValidatePhone {
	public final String PHONE_PATTERN = "[0-9]{10}";
	final Pattern p = Pattern.compile(PHONE_PATTERN);
	
	public static boolean validatePhoneNumber(String phoneNumber) throws WrongPhoneNumberException {
		Matcher m = p.matcher(phoneNumber);
		if(m.matches()) {
			return true;
		} else {
			throw new WrongPhoneNumberException("Invalid phone number!");
		}
	}

}

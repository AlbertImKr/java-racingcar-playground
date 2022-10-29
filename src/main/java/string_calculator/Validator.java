package string_calculator;

public class Validator {

	void validate(String[] strings) {
		for (String string : strings) {
			validate(string);
		}
	}

	private static void validate(String string) {
		for (Character c : string.toCharArray()) {
			boolean digit = Character.isDigit(c);
			validate(digit);
		}
	}

	private static void validate(boolean digit) {
		if (!digit) {
			throw new RuntimeException();
		}
	}
}

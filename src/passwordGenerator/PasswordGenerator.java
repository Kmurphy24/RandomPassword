package passwordGenerator;

import java.lang.Math;
import java.lang.StringBuilder;
import java.util.Random;

public class PasswordGenerator {

	private String[] letters = new String[] { "q", "w", "e", "r", "t", "y",
			"u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l",
			"z", "x", "c", "v", "b", "n", "m" };
	private StringBuilder password = new StringBuilder();

	public String generatePassword(int length) {
		int[] numbers = new int[length];
		Random randomNum = new Random();
		for (int i = 0; i <length; i+=2){
			int tempNum = randomNum.nextInt(26-0 + 1);
		}
		for (int i = 0; i < length; i++) {
			password.append(letters[i]);
		}
		return password.toString();
	}

	public String testArray() {
		return letters[1];
	}

}
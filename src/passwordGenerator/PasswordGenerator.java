package passwordGenerator;

import java.lang.StringBuilder;
import java.util.Random;

public class PasswordGenerator {

	private String[] letters = new String[] { "q", "w", "e", "r", "t", "y",
			"u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l",
			"z", "x", "c", "v", "b", "n", "m" };
	private StringBuilder password = new StringBuilder();
	private int[] numbers;

	public String generatePassword(int length) {		
		Random randomNum = new Random();
		numbers = new int[length];
		int tempNum = randomNum.nextInt(25);
		numbers[0] = tempNum;
		numbers[1] = tempNum + 1;
		for (int i = 2; i < length; i += 2) {
			tempNum = randomNum.nextInt(25);
			if(inArray(tempNum) || tempNum==19)
				i -= 2;
			else{
			numbers[i] = tempNum;
			numbers[i + 1] = tempNum + 1;
			}
		}
		for (int i = 0; i < length; i++) {
			password.append(letters[numbers[i]]);
		}
		return password.toString();
	}

	public String testArray() {
		return letters[1];
	}

	private boolean inArray(int num) {
		for(int i = 0; i < numbers.length; i++){
			if(num == numbers[i] || num + 1 == numbers[i])
				return true;
		}
		return false;
	}

}
package passwordGenerator;
import java.lang.Math;
import java.lang.StringBuilder;

public class PasswordGenerator {

	private String letters[] = new String[]{"q","w","e","r","t","y","u","i","o","p",
								"a","s","d","f","g","h","j","k","l",
								"z","x","c","v","b","n","m"};
	private StringBuilder password;
	
	
	public String testArray(){
		return letters[0];
	}
	
	public StringBuilder generatePassword(int length){
		for(int i = 1; i < length; i++){
			password.append(letters[i]);
		}
		return password;
	}
}	
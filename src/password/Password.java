package password;

import passwordGenerator.PasswordGenerator;

public class Password {

	private String password;
	private int passwordLength;
	PasswordGenerator pwg = new PasswordGenerator();
	
	
	public Password(int length){
		this.passwordLength = length;
	}
	
	public String createPassword(){
		return password = pwg.generatePassword(passwordLength);
	}
	
	public int getLength(){
		return passwordLength;
	}
	
	public void setLength(int length){
		this.passwordLength = length;
	}
}

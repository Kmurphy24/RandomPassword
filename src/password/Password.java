package password;

public class Password {

	private String passWord;
	private int passwordLenght;
	
	
	public Password(int length){
		this.passwordLenght = length;
	}
	
	public String createPassword(){
		return passWord;
	}
	
	public int getLength(){
		return passwordLenght;
	}
	
	public void setLength(int length){
		this.passwordLenght = length;
	}
}

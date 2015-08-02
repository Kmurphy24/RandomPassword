package passwordGenerator;

public class passwordGeneratorMain {

	public static void main(String[] args) {
		PasswordGenerator pass = new PasswordGenerator();
		
		System.out.println(pass.testArray());
		
		System.out.println(pass.generatePassword(6));

	}

}

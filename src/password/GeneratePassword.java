package password;

public class GeneratePassword {

	public static void main(String[] args) {
		Password pw1 = new Password(6);
		Password pw2 = new Password(8);
		Password pw3 = new Password(10);
		Password pw4 = new Password(12);
		
		System.out.println(pw1.createPassword());
		System.out.println(pw2.createPassword());
		System.out.println(pw3.createPassword());
		System.out.println(pw4.createPassword()+"\n");
		pw1.setLength(4);
		System.out.println(pw1.createPassword());

	}

}

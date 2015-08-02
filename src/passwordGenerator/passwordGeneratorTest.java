package passwordGenerator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class passwordGeneratorTest {

	PasswordGenerator pass;
	
	@Before
	public void setUp() throws Exception {
		pass = new PasswordGenerator();
	}

	@Test
	public void test() {
		assertEquals("w", pass.testArray());
	}

	@Test
	public void testgeneratePassword(){
		assertEquals("qwerty", pass.generatePassword(6));
	}
}

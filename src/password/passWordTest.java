package password;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class passWordTest {

	Password pass;
	@Before
	public void setUp() throws Exception {
		pass = new Password(6);
	}


	@Test
	public void testCreatePassword() {
		assertEquals(null, pass.createPassword());
	}

	@Test
	public void testGetLength(){
		assertEquals(6,pass.getLength());
	}

}

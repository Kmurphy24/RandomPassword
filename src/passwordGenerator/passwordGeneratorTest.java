package passwordGenerator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class passwordGeneratorTest {

	PasswordGenerator pass;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("q", pass.testArray());
	}

}

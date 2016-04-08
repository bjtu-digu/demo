

import com.Module.LoginModule;

import junit.framework.TestCase;

public class LoginModuleTest extends TestCase {

	public LoginModuleTest(String name) {
		super(name);
	}

	protected static void setUpBeforeClass() throws Exception {
	}

	protected static void tearDownAfterClass() throws Exception {
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testLogin() {
		int n = LoginModule.login("lantian", "123");
		assertEquals(1, n);
	}

}

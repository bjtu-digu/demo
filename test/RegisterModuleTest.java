

import com.Module.RegisterModule;

import junit.framework.TestCase;

public class RegisterModuleTest extends TestCase {

	public RegisterModuleTest(String name) {
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

	public void testRegister() {
		//ԭ�����޷���ֵ�����Բ���
	}

	public void testCheckRegister() {
		int n = RegisterModule.checkRegister("lantian");
		//assertEquals(1, n);
	}

}

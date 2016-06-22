

import com.Module.PostingModule;

import junit.framework.TestCase;

public class PostingModuleTest extends TestCase {

	public PostingModuleTest(String name) {
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

	public void testPosting() {
		//ԭ�����޷���ֵ�����Բ���
	}

	public void testCheckID() {
		int n = PostingModule.checkID("5");
		//assertEquals(1, n);
	}

	public void testCheckBar() {
		int n = PostingModule.checkBar("3");
		//assertEquals(1, n);
	}

}

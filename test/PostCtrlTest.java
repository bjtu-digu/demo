

import junit.framework.TestCase;

import com.Control.PostCtrl;

public class PostCtrlTest extends TestCase {

	private static PostCtrl pc = new PostCtrl("3","1","5","");
	
	public PostCtrlTest(String name) {
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

	public void testOutBarInfo() {
		String s = pc.OutBarInfo();
		//assertEquals("Test2015-09-281",s);
	}

	public void testOutFloorInfo() {
		String s = pc.OutFloorInfo();
		assertEquals("",s);
	}

	public void testGetBarname() {
		String s = pc.getBarname();
		assertEquals("Test",s);
	}

	public void testGetBarId() {
		String s = pc.getBarId();
		assertEquals("3",s);
	}

	public void testGetFirstFloorMsg() {
		String s = pc.getFirstFloorMsg();
		assertEquals("cailan",s);
	}
}

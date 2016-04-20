package test.Module;

import java.util.ArrayList;

import com.Module.BarModule;

import junit.framework.TestCase;

public class BarModuleTest extends TestCase {

	public BarModuleTest(String name) {
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

	public void testCheckBar() {
		int n = BarModule.checkBar("Test");
		assertEquals(1, n);
	}

	public void testGetBarInfo() {
		ArrayList<String> als = BarModule.getBarInfo("Test");
		ArrayList<String> testArrayList = new ArrayList<String>();
		testArrayList.add("3");
		testArrayList.add("5");
		testArrayList.add("personal");
		testArrayList.add("Test");
		testArrayList.add("2015-09-28");
		testArrayList.add("1");
		assertEquals(testArrayList, als);
	}

	public void testGetBarOwnerInfo() {
		ArrayList<String> als = BarModule.getBarOwnerInfo("3");
		ArrayList<String> testArrayList = new ArrayList<String>();
		testArrayList.add("3");
		testArrayList.add("≤Ã¿∂ÃÏ");
		assertEquals(testArrayList, als);
	}

	public void testGetTeacherInfo() {
		ArrayList<String> als = BarModule.getTeacherInfo("3");
		ArrayList<String> testArrayList = new ArrayList<String>();
		testArrayList.add("10");
		testArrayList.add("tin");
		testArrayList.add("12");
		testArrayList.add("cao");
		assertEquals(testArrayList, als);
	}


	public void testGetUserName() {
		String s = BarModule.getUserName("5");
		assertEquals("lantian", s);
	}
	public void testGetReplyNum() {
		int n = BarModule.getReplyNum("3");
		assertEquals(0, n);
	}

	public void testGetFirstFloor() {
		String s = BarModule.getFirstFloor("3");
		assertEquals("cailan", s);
	}
}

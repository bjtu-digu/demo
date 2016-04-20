package test.Module;

import java.util.ArrayList;

import com.Module.PostModule;

import junit.framework.TestCase;

public class PostModuleTest extends TestCase {

	public PostModuleTest(String name) {
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

	public void testGetBarID() {
		String s = PostModule.getBarID("2");
		assertEquals("3", s);
	}

	public void testGetBarInfo() {
		ArrayList<String> als = PostModule.getBarInfo("3");
		ArrayList<String> testArrayList = new ArrayList<String>();
		testArrayList.add("5");
		testArrayList.add("Test");
		testArrayList.add("2015-09-28");
		testArrayList.add("1");
		assertEquals(testArrayList, als);
	}

	public void testGetFloorInfo() {
		ArrayList<String> als = PostModule.getFloorInfo("3", "1", "10");
		ArrayList<String> testArrayList = new ArrayList<String>();
		assertEquals(testArrayList, als);
	}

	public void testGetUserName() {
		String s = PostModule.getUserName("5");
		assertEquals("lantian", s);
	}

	public void testGetFirstInfo() {
		ArrayList<String> als = PostModule.getFirstInfo("3");
		ArrayList<String> testArrayList = new ArrayList<String>();
		testArrayList.add("5");
		testArrayList.add("1111111");
		testArrayList.add("cailan");
		testArrayList.add("2015-10-14 16:46:37.0");
		assertEquals(testArrayList, als);
	}

}

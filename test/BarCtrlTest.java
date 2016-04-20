package test.Control;

import com.Control.BarCtrl;

import junit.framework.Assert;
import junit.framework.TestCase;

public class BarCtrlTest extends TestCase {

	private static BarCtrl bc = new BarCtrl("test","1");
	
	public BarCtrlTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testCheckBarName() {
		boolean b = bc.CheckBarName();
		assertEquals(false, b);
	}

	public void testGetBarName() {
		String s = bc.getBarName();
		assertEquals("Test", s);
	}

	public void testGetBarType() {
		String s = bc.getBarType();
		assertEquals("personal", s);
	}

	public void testGetPostNum() {
		int n = bc.getPostNum();
		assertEquals(14,n);
	}

	public void testGetPostId() {
		String s = bc.getPostId(0);
		assertEquals("15",s);
	}

	public void testGetPosterId() {
		String s = bc.getPosterId(0);
		assertEquals("5",s);
	}

	public void testGetPostName() {
		String s = bc.getPostName(0);
		assertEquals("lantian",s);
	}

	public void testGetPostMsg() {
		String s  = bc.getPostMsg(0);
		assertEquals("qweqweqwewqe",s);
	}

	public void testGetPostDate() {
		String s = bc.getPostDate(0);
		assertEquals("2015-12-27",s);
	}

	public void testGetLastDate() {
		String s = bc.getLastDate(0);
		assertEquals("2015-12-27",s);
	}

	public void testGetLastId() {
		String s = bc.getLastId(0);
		assertEquals("16",s);
	}

	public void testGetUserName() {
		String s = bc.getUserName("5");
		assertEquals("lantian",s);
	}
}

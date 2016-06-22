

import Hibernate.bar;
import Hibernate.user;
import java.util.ArrayList;

import com.Module.BarModule;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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

	public void testGetBarInfo() throws ParseException {
		//List<bar> als = BarModule.getBarInfo("Test");
             //  bar newbar = new bar();
              //  newbar.setBar_id(3);
              //  newbar.setUser_id(5);
               // newbar.setTopic("personal");
               /// newbar.setBar_name("Test");
                
              //  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");  
              //  Date date = sdf.parse("2015-09-28"); 
              //  newbar.setCreate_time(date);
                
              //  newbar.setBar_head(1);

//		testArrayList.add("3");
//		testArrayList.add("5");
//		testArrayList.add("personal");
//		testArrayList.add("Test");
//		testArrayList.add("2015-09-28");
//		testArrayList.add("1");
		//assertEquals(newbar.getBar_head(), als.get(0).getBar_head());
                //assertEquals(newbar.getBar_id(), als.get(0).getBar_id());
               // assertEquals(newbar.getBar_name(), als.get(0).getBar_name());
                //assertEquals(newbar.getUser_id(), als.get(0).getUser_id());
	}

	public void testGetBarOwnerInfo() {
		List<user> als = BarModule.getBarOwnerInfo("3");
                user newuser = new user();
                
                newuser.setUser_id(3);
                newuser.setUser_name("蔡蓝天");
		//testArrayList.add("3");
		//testArrayList.add("������");
		assertEquals(newuser.getUser_id(), als.get(0).getUser_id());
                assertEquals(newuser.getUser_name(), als.get(0).getUser_name());
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



import Hibernate.bar;
import Hibernate.post;
import Hibernate.reply;
import java.util.ArrayList;

import com.Module.PostModule;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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

    public void testGetBarInfo() throws ParseException {
        //List<bar> als = PostModule.getBarInfo("3");
       //bar newbar = new bar();

        //newbar.setUser_id(5);
        //newbar.setBar_name("Test");

       // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");
        //Date date = sdf.parse("2015-09-28");
        //newbar.setCreate_time(date);

        //newbar.setBar_head(1);
//        testArrayList.add("5");
//        testArrayList.add("Test");
//        testArrayList.add("2015-09-28");
//        testArrayList.add("1");
       // assertEquals(newbar.getBar_head(), als.get(0).getBar_head());
        //assertEquals(newbar.getBar_id(), als.get(0).getBar_id());
        //assertEquals(newbar.getBar_name(), als.get(0).getBar_name());
       // assertEquals(newbar.getUser_id(), als.get(0).getUser_id());
    }

    public void testGetFloorInfo() {
        //List<reply> als = PostModule.getFloorInfo("27", "1", "10");
       // reply newreply = new reply();
       // newreply.setReply_msg("hehe");
        //assertEquals(newreply.getReply_msg(), als.get(0).getReply_msg());
    }

    public void testGetUserName() {
        String s = PostModule.getUserName("5");
        assertEquals("lantian", s);
    }

    public void testGetFirstInfo() throws ParseException {
       // List<post> als = PostModule.getFirstInfo("27");
       // post newpost = new post();
        
       // newpost.setUser_id(5);
        //newpost.setPost_name("1111111");
       // newpost.setPost_msg("cailantian");
        
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
        //Date date = sdf.parse("2015-10-14 16:46:37"); 
        //newpost.setPost_date(date);
//        testArrayList.add("5");
//        testArrayList.add("1111111");
//        testArrayList.add("cailan");
//        testArrayList.add("2015-10-14 16:46:37.0");
       // assertEquals(newpost.getUser_id(), als.get(0).getUser_id());
       // assertEquals(newpost.getPost_name(), als.get(0).getPost_name());
        //assertEquals(newpost.getPost_name(), als.get(0).getPost_name());
       // assertEquals(newpost.getPost_date(), als.get(0).getPost_date());
    }

}

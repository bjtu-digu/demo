/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Module;

import java.util.List;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author zqhPC
 */
public class UserModuleNGTest {
    
    public UserModuleNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * getUserInfo方法的测试 (属于类UserModule)。
     */
    @Test
    public void testGetUserInfo1() {
        System.out.println("getUserInfo");
        String user_id = "1";
        String expResult = "1";
        String result = UserModule.getUserInfo(user_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
       
    }
    /*
@Test

    public void testGetUserInfo2() {
        System.out.println("getUserInfo");
        String user_id = "";
        String expResult = "";
        String result = UserModule.getUserInfo(user_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
      
    }
    @Test
    public void testGetUserInfo3() {
        System.out.println("getUserInfo");
        String user_id = "";
        String expResult = "";
        String result = UserModule.getUserInfo(user_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
       
    }
*/
    /**
     * getUserID方法的测试 (属于类UserModule)。
     */
    @Test
    public void testGetUserID1() {
        System.out.println("getUserID");
        String name = "Tin";
        String expResult = "1";
        String result = UserModule.getUserID(name);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
      
    }/*
     @Test
    public void testGetUserID2() {
        System.out.println("getUserID");
        String name = "";
        String expResult = "";
        String result = UserModule.getUserID(name);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
      
    }
     @Test
    public void testGetUserID3() {
        System.out.println("getUserID");
        String name = "";
        String expResult = "";
        String result = UserModule.getUserID(name);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
      
    }
*/
    /**
     * getStarUser方法的测试 (属于类UserModule)。
     */
    @Test
    public void testGetStarUser1() {
        System.out.println("getStarUser");
        String user_id = "1";
        List expResult = null;
       //List result = UserModule.getStarUser(user_id);
       // assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
       
    }/*
      @Test
    public void testGetStarUser2() {
        System.out.println("getStarUser");
        String user_id = "Tin";
        List expResult = null;
        List result = UserModule.getStarUser(user_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
       
    }
      @Test
    public void testGetStarUser3() {
        System.out.println("getStarUser");
        String user_id = "T";
        List expResult = null;
        List result = UserModule.getStarUser(user_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
       
    }
*/
    /**
     * getFansUser方法的测试 (属于类UserModule)。
     * 
     * @Test
    public void testGetFansUser2() {
        System.out.println("getFansUser");
        String user_id = "2";
        List expResult = null;
        List result = UserModule.getFansUser(user_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
      
    }
    * @Test
    public void testGetFansUser3() {
        System.out.println("getFansUser");
        String user_id = "1";
        List expResult = null;
        List result = UserModule.getFansUser(user_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
      
    }
     */
    @Test
    public void testGetFansUser1() {
        System.out.println("getFansUser");
        String user_id = "777";
        List expResult = null;
        //List result = UserModule.getFansUser(user_id);
       // assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
      
    }

    /**
     * getStarBar方法的测试 (属于类UserModule)。
     *  @Test
    public void testGetStarBar2() {
        System.out.println("getStarBar");
        String user_id = "1";
        List expResult = null;
        List result = UserModule.getStarBar(user_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
      
    }
    *  @Test
    public void testGetStarBar3() {
        System.out.println("getStarBar");
        String user_id = "2";
        List expResult = null;
        List result = UserModule.getStarBar(user_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
      
    }
     */
    @Test
    public void testGetStarBar1() {
        System.out.println("getStarBar");
        String user_id = "";
        List expResult = null;
       // List result = UserModule.getStarBar(user_id);
       // assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
      
    }

    /**
     * getPost方法的测试 (属于类UserModule)。
     *  @Test
    public void testGetPost2() {
        System.out.println("getPost");
        String user_id = "2";
        List expResult = null;
        List result = UserModule.getPost(user_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
      
    }
    *  @Test
    public void testGetPost3() {
        System.out.println("getPost");
        String user_id = "1";
        List expResult = null;
        List result = UserModule.getPost(user_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
      
    }
     */
    @Test
    public void testGetPost1() {
        System.out.println("getPost");
        String user_id = "";
        List expResult = null;
       // List result = UserModule.getPost(user_id);
       // assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
      
    }

    /**
     * getUserName方法的测试 (属于类UserModule)。
     *  @Test
    public void testGetUserName2() {
        System.out.println("getUserName");
        String user_id = "2";
        String expResult = "";
        String result = UserModule.getUserName(user_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
      
    }
    *  @Test
    public void testGetUserName3() {
        System.out.println("getUserName");
        String user_id = "1";
        String expResult = "";
        String result = UserModule.getUserName(user_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
      
    }
     */
    @Test
    public void testGetUserName1() {
        System.out.println("getUserName");
        String user_id = "";
        String expResult = null;
        //String result = UserModule.getUserName(user_id);
       // assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
      
    }

    /**
     * getBarName方法的测试 (属于类UserModule)。
     *   @Test
    public void testGetBarName2() {
        System.out.println("getBarName");
        String bar_id = "2";
        String expResult = null;
        String result = UserModule.getBarName(bar_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
      
    }
  @Test
    public void testGetBarName3() {
        System.out.println("getBarName");
        String bar_id = "1";
        String expResult = null;
        String result = UserModule.getBarName(bar_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
      
    }

     */
    @Test
    public void testGetBarName1() {
        System.out.println("getBarName");
        String bar_id = "";
        String expResult = null;
       // String result = UserModule.getBarName(bar_id);
       //assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
      
    }

    /**
     * getReplyNum方法的测试 (属于类UserModule)。
     *  @Test
    public void testGetReplyNum2() {
        System.out.println("getReplyNum");
        String post_id = "1";
        String expResult = "";
        String result = UserModule.getReplyNum(post_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
       
    }
    *  @Test
    public void testGetReplyNum3() {
        System.out.println("getReplyNum");
        String post_id = "2";
        String expResult = "";
        String result = UserModule.getReplyNum(post_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
       
    }
     */
    @Test
    public void testGetReplyNum1() {
        System.out.println("getReplyNum");
        String post_id = "";
        String expResult = "";
        //String result = UserModule.getReplyNum(post_id);
        //assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
       
    }

    /**
     * getReply方法的测试 (属于类UserModule)。
     *  @Test
    public void testGetReply2() {
        System.out.println("getReply");
        String user_id = "1";
        List expResult = null;
        List result = UserModule.getReply(user_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        
    }
    *  @Test
    public void testGetReply3() {
        System.out.println("getReply");
        String user_id = "2";
        List expResult = null;
        List result = UserModule.getReply(user_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        
    }
     */
    @Test
    public void testGetReply1() {
        System.out.println("getReply");
        String user_id = "";
        List expResult = null;
        //List result = UserModule.getReply(user_id);
        //assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        
    }

    /**
     * getMsg方法的测试 (属于类UserModule)。
     * @Test
    public void testGetMsg2() {
        System.out.println("getMsg");
        String user_id = "2";
        List expResult = null;
        List result = UserModule.getMsg(user_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
       
    }
    * @Test
    public void testGetMsg3() {
        System.out.println("getMsg");
        String user_id = "3";
        List expResult = null;
        List result = UserModule.getMsg(user_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
       
    }
     */
    @Test
    public void testGetMsg1() {
        System.out.println("getMsg");
        String user_id = "";
        List expResult = null;
        //List result = UserModule.getMsg(user_id);
        //assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
       
    }

    /**
     * getSignNum方法的测试 (属于类UserModule)。
     *  @Test
    public void testGetSignNum2() {
        System.out.println("getSignNum");
        String user_id = "2";
        String bar_id = "2";
        String expResult =null;
        String result = UserModule.getSignNum(user_id, bar_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
      
    }
    *  @Test
    public void testGetSignNum3() {
        System.out.println("getSignNum");
        String user_id = "1";
        String bar_id = "1";
        String expResult =null;
        String result = UserModule.getSignNum(user_id, bar_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
      
    }
     */
    @Test
    public void testGetSignNum1() {
        System.out.println("getSignNum");
        String user_id = "";
        String bar_id = "";
        String expResult = null;
       // String result = UserModule.getSignNum(user_id, bar_id);
       // assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
      
    }

    /**
     * checkStarUser方法的测试 (属于类UserModule)。
     *  @Test
    public void testCheckStarUser2() {
        System.out.println("checkStarUser");
        String user_id = "2";
        String star_id = "2";
        String expResult = null;
        String result = UserModule.checkStarUser(user_id, star_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
       
    }
    *  @Test
    public void testCheckStarUser3() {
        System.out.println("checkStarUser");
        String user_id = "1";
        String star_id = "1";
        String expResult = null;
        String result = UserModule.checkStarUser(user_id, star_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
       
    }
     */
    @Test
    public void testCheckStarUser1() {
        System.out.println("checkStarUser");
        String user_id = "";
        String star_id = "";
        String expResult = null;
        //String result = UserModule.checkStarUser(user_id, star_id);
       // assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
       
    }

    /**
     * getBarName1方法的测试 (属于类UserModule)。
     * @Test
    public void testGetBarName13() {
        System.out.println("getBarName1");
        String bar_id = "1";
        String expResult = null;
        String result = UserModule.getBarName1(bar_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
       
    }
    * @Test
    public void testGetBarName12() {
        System.out.println("getBarName1");
        String bar_id = "2";
        String expResult = null;
        String result = UserModule.getBarName1(bar_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
       
    }
     */
    @Test
    public void testGetBarName11() {
        System.out.println("getBarName1");
        String bar_id = "";
        String expResult = "";
        //String result = UserModule.getBarName1(bar_id);
        //assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
       
    }
    
}

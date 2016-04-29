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
 * @author haodong
 */
public class BarModuleNGTest {
    
    public BarModuleNGTest() {
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
     * checkBar方法的测试 (属于类BarModule)。
     */
    @Test
    public void testCheckBar() {
        System.out.println("checkBar Test");
        String name = "Test";
        int expResult = 1;
        int result = BarModule.checkBar(name);
        System.out.println(result);
        //assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * CheckSign方法的测试 (属于类BarModule)。
     */
    @Test
    public void testCheckSign() {
        System.out.println("CheckSign");
        String bar_id = "";
        String user_id = "";
        String expResult = "";
        String result = BarModule.CheckSign(bar_id, user_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getBarInfo方法的测试 (属于类BarModule)。
     */
    @Test
    public void testGetBarInfo() {
        System.out.println("getBarInfo");
        String name = "fff";
        List expResult = null;
        List result = BarModule.getBarInfo(name);
        //assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getBarOwnerInfo方法的测试 (属于类BarModule)。
     */
    @Test
    public void testGetBarOwnerInfo() {
        System.out.println("getBarOwnerInfo");
        String id = "1";
        List expResult = null;
        List result = BarModule.getBarOwnerInfo(id);
        //assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getTeacherInfo方法的测试 (属于类BarModule)。
     */
    @Test
    public void testGetTeacherInfo() {
        System.out.println("getTeacherInfo");
        String id = "1";
        List expResult = null;
        List result = BarModule.getTeacherInfo(id);
        //assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getPostList方法的测试 (属于类BarModule)。
     */
    @Test
    public void testGetPostList() {
        System.out.println("getPostList");
        String bar_id = "3";
        String begin = "";
        String end = "";
        List expResult = null;
        List result = BarModule.getPostList(bar_id, begin, end);
        //assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getReplyOwnerInfo方法的测试 (属于类BarModule)。
     */
    @Test
    public void testGetReplyOwnerInfo() {
        System.out.println("getReplyOwnerInfo");
        String reply_id = "1";
        List expResult = null;
        List result = BarModule.getReplyOwnerInfo(reply_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getUserName方法的测试 (属于类BarModule)。
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        String user_id = "1";
        String expResult = "Tin";
        String result = BarModule.getUserName(user_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getReplyNum方法的测试 (属于类BarModule)。
     */
    @Test
    public void testGetReplyNum() {
        System.out.println("getReplyNum");
        String post_id = "27";
        int expResult = 3;
        int result = BarModule.getReplyNum(post_id);
        //System.out.println(result);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getFirstFloor方法的测试 (属于类BarModule)。
     */
    @Test
    public void testGetFirstFloor() {
        System.out.println("getFirstFloor");
        String post_id = "27";
        String expResult = "hehe";
        String result = BarModule.getFirstFloor(post_id);
        //System.out.println("result");
        //System.out.println(result);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * checkStarBar方法的测试 (属于类BarModule)。
     */
    @Test
    public void testCheckStarBar() {
        System.out.println("checkStarBar");
        String user_id = "";
        String bar_id = "";
        String expResult = "";
        String result = BarModule.checkStarBar(user_id, bar_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * checkTeacher方法的测试 (属于类BarModule)。
     */
    @Test
    public void testCheckTeacher() {
        System.out.println("checkTeacher");
        String user_id = "1";
        String expResult = "-1";
        String result = BarModule.checkTeacher(user_id);
        //System.out.println("result");
        //System.out.println(result);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getBarName1方法的测试 (属于类BarModule)。
     */
    @Test
    public void testGetBarName1() {
        System.out.println("getBarName1");
        String bar_id = "3";
        String expResult = "Test";
        String result = BarModule.getBarName1(bar_id);
        //System.out.println("result");
        //System.out.println(result);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * checkBarTeacher方法的测试 (属于类BarModule)。
     */
    @Test
    public void testCheckBarTeacher() {
        System.out.println("checkBarTeacher");
        String user_id = "";
        String bar_id = "";
        String expResult = "";
        String result = BarModule.checkBarTeacher(user_id, bar_id);
        System.out.println("result");
        System.out.println(result);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getReplyer方法的测试 (属于类BarModule)。
     */
    @Test
    public void testGetReplyer() {
        System.out.println("getReplyer");
        String reply_id = "1";
        String expResult = "5";
        String result = BarModule.getReplyer(reply_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }
    
}

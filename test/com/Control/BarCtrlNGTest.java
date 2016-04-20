/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Control;

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
public class BarCtrlNGTest {
    
    public BarCtrlNGTest() {
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
     * getUserID1方法的测试 (属于类BarCtrl)。
     */
    @Test
    public void testGetUserID1() {
        System.out.println("getUserID1");
        String name = "lantian";
        BarCtrl instance = new BarCtrl("555","1");
        String expResult = "5";
        String result = instance.getUserID1(name);
        //System.out.println(result);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * CheckBarName方法的测试 (属于类BarCtrl)。
     */
    @Test
    public void testCheckBarName() {
        System.out.println("CheckBarName");
        BarCtrl instance = new BarCtrl("555","1");
        boolean expResult = false;
        boolean result = instance.CheckBarName();
        System.out.println(result);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getBarOwnerId方法的测试 (属于类BarCtrl)。
     */
    @Test
    public void testGetBarOwnerId() {
        System.out.println("getBarOwnerId");
        BarCtrl instance = new BarCtrl("555","1");
        String expResult = "5";
        String result = instance.getBarOwnerId();
        //System.out.println(result);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getBarOwnerName方法的测试 (属于类BarCtrl)。
     */
    @Test
    public void testGetBarOwnerName() {
        System.out.println("getBarOwnerName");
        BarCtrl instance = new BarCtrl("555","1");
        String expResult = "lantian";
        String result = instance.getBarOwnerName();
        //System.out.println(result);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getBarId方法的测试 (属于类BarCtrl)。
     */
    @Test
    public void testGetBarId() {
        System.out.println("getBarId");
        BarCtrl instance = new BarCtrl("555","1");
        String expResult = "4";
        String result = instance.getBarId();
        //System.out.println(result);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getBarName方法的测试 (属于类BarCtrl)。
     */
    @Test
    public void testGetBarName() {
        System.out.println("getBarName");
        BarCtrl instance = new BarCtrl("555","1");
        String expResult = "555";
        String result = instance.getBarName();
        //System.out.println(result);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getBarType方法的测试 (属于类BarCtrl)。
     */
    @Test
    public void testGetBarType() {
        System.out.println("getBarType");
        BarCtrl instance = new BarCtrl("555","1");
        String expResult = "lantian";
        String result = instance.getBarType();
        //System.out.println(result);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getPostNum方法的测试 (属于类BarCtrl)。
     */
    @Test
    public void testGetPostNum() {
        System.out.println("getPostNum");
        BarCtrl instance = new BarCtrl("555","1");
        int expResult = 0;
        int result = instance.getPostNum();
        //System.out.println(result);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getPostId方法的测试 (属于类BarCtrl)。
     */
    @Test
    public void testGetPostId() {
        System.out.println("getPostId");
        int index = 2;
        BarCtrl instance = new BarCtrl("555","1");
        String expResult = "";
        String result = instance.getPostId(index);
        System.out.println(result);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getPosterId方法的测试 (属于类BarCtrl)。
     */
    @Test
    public void testGetPosterId() {
        System.out.println("getPosterId");
        int index = 2;
        BarCtrl instance = new BarCtrl("555","1");
        String expResult = "";
        String result = instance.getPosterId(index);
        System.out.println(result);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getPostName方法的测试 (属于类BarCtrl)。
     */
    @Test
    public void testGetPostName() {
        System.out.println("getPostName");
        int index = 2;
        BarCtrl instance = new BarCtrl("555","1");
        String expResult = "";
        String result = instance.getPostName(index);
        System.out.println(result);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getPostMsg方法的测试 (属于类BarCtrl)。
     */
    @Test
    public void testGetPostMsg() {
        System.out.println("getPostMsg");
        int index = 2;
        BarCtrl instance = new BarCtrl("555","1");
        String expResult = "";
        String result = instance.getPostMsg(index);
        System.out.println(result);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getPostDate方法的测试 (属于类BarCtrl)。
     */
    @Test
    public void testGetPostDate() {
        System.out.println("getPostDate");
        int index = 2;
        BarCtrl instance = new BarCtrl("555","1");
        String expResult = "";
        String result = instance.getPostDate(index);
        System.out.println(result);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getLastDate方法的测试 (属于类BarCtrl)。
     */
    @Test
    public void testGetLastDate() {
        System.out.println("getLastDate");
        int index = 5;
        BarCtrl instance = new BarCtrl("555","1");
        String expResult = "";
        String result = instance.getLastDate(index);
        System.out.println(result);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getLastId方法的测试 (属于类BarCtrl)。
     */
    @Test
    public void testGetLastId() {
        System.out.println("getLastId");
        int index = 1;
        BarCtrl instance = new BarCtrl("555","1");
        String expResult = "";
        String result = instance.getLastId(index);
        System.out.println(result);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getUserName方法的测试 (属于类BarCtrl)。
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        String user_Id = "5";
        BarCtrl instance = new BarCtrl("555","1");
        String expResult = "lantian";
        String result = instance.getUserName(user_Id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getUserID方法的测试 (属于类BarCtrl)。
     */
    @Test
    public void testGetUserID() {
        System.out.println("getUserID");
        String name = "Tin";
        BarCtrl instance = new BarCtrl("555","1");
        String expResult = "1";
        String result = instance.getUserID(name);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * checkStarBar方法的测试 (属于类BarCtrl)。
     */
    @Test
    public void testCheckStarBar() {
        System.out.println("checkStarBar");
        String user_id = "";
        BarCtrl instance = new BarCtrl("555","1");
        boolean expResult = false;
        boolean result = instance.checkStarBar(user_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * checkSign方法的测试 (属于类BarCtrl)。
     */
    @Test
    public void testCheckSign() {
        System.out.println("checkSign");
        String user_id = "";
        BarCtrl instance = new BarCtrl("555","1");
        boolean expResult = false;
        boolean result = instance.checkSign(user_id);
        //System.out.println(": " + result);
        assertEquals(result, expResult);
        String user_id2 = "133011xx";
        boolean expResult2 = false;
        boolean result2 = instance.checkSign(user_id);
        assertEquals(result2, expResult2);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * checkTeacher方法的测试 (属于类BarCtrl)。
     */
    @Test
    public void testCheckTeacher() {
        System.out.println("checkTeacher");
        String userName = "";
        BarCtrl instance = new BarCtrl("555","1");
        boolean expResult = false;
        boolean result = instance.checkTeacher(userName);
        assertEquals(result, expResult);
        String userName2 = "Tin";
        boolean expResult2 = false;
        boolean result2 = instance.checkTeacher(userName);
        assertEquals(result2, expResult2);
        //fail
        //String userName3 = "Tin";
        //boolean expResult3 = true;
        //boolean result3 = instance.checkTeacher(userName);
        //assertEquals(result3, expResult3);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getTeacherNum方法的测试 (属于类BarCtrl)。
     */
    @Test
    public void testGetTeacherNum() {
        System.out.println("getTeacherNum");
        BarCtrl instance = new BarCtrl("555","1");
        int expResult = 0;
        int result = instance.getTeacherNum();
        assertEquals(result, expResult);
        //int expResult2 = 1;
        //int result2 = instance.getTeacherNum();
        //assertEquals(result2, expResult2);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getTeacherId方法的测试 (属于类BarCtrl)。
     */
    @Test
    public void testGetTeacherId() {
        System.out.println("getTeacherId");
        int index = 0;
        BarCtrl instance = new BarCtrl("555","1");
        String expResult = "";
        //String result = instance.getTeacherId(index);
        //System.out.println(result);
        //assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getTeacherName方法的测试 (属于类BarCtrl)。
     */
    @Test
    public void testGetTeacherName() {
        System.out.println("getTeacherName");
        int index = 4;
        BarCtrl instance = new BarCtrl("555","1");
        String expResult = "";
       // String result = instance.getTeacherName(index);
       // System.out.println(result);
        //assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getBarName1方法的测试 (属于类BarCtrl)。
     */
    @Test
    public void testGetBarName1() {
        System.out.println("getBarName1");
        String bar_id = "4";
        BarCtrl instance = new BarCtrl("555","1");
        String expResult = "555";
        String result = instance.getBarName1(bar_id);
        System.out.println(result);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * checkBarTeacher方法的测试 (属于类BarCtrl)。
     */
    @Test
    public void testCheckBarTeacher() {
        System.out.println("checkBarTeacher");
        String bar_id = "";
        String user_id = "";
        BarCtrl instance = new BarCtrl("555","1");
        boolean expResult = false;
        boolean result = instance.checkBarTeacher(bar_id, user_id);
        //System.out.println(result);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getReplyer方法的测试 (属于类BarCtrl)。
     */
    @Test
    public void testGetReplyer() {
        System.out.println("getReplyer");
        String reply_id = "";
        BarCtrl instance = new BarCtrl("555","1");
        String expResult = null;
        String result = instance.getReplyer(reply_id);
        //System.out.println(result);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Module;

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
public class MsgModuleNGTest {
    
    public MsgModuleNGTest() {
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
     * Msg方法的测试 (属于类MsgModule)。
     */
    @Test
    public void testMsg() {
        System.out.println("Msg");
        String msg = "1";
        String type = "1";
        String sender_id = "1";
        String reader_id = "2";
        MsgModule.Msg(msg, type, sender_id, reader_id);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getUserName方法的测试 (属于类MsgModule)。
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        String user_id = "1";
        String expResult = "Tin";
        String result = MsgModule.getUserName(user_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getUserID方法的测试 (属于类MsgModule)。
     */
    @Test
    public void testGetUserID() {
        System.out.println("getUserID");
        String name = "Tin";
        String expResult = "1";
        String result = MsgModule.getUserID(name);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getMsg方法的测试 (属于类MsgModule)。
     */
    @Test
    public void testGetMsg() {
        System.out.println("getMsg");
        String Msg_id = "1";
        String expResult = "123";
        String result = MsgModule.getMsg(Msg_id);
        //assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }
    
}

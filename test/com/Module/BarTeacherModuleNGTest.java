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
public class BarTeacherModuleNGTest {
    
    public BarTeacherModuleNGTest() {
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
     * SetTeacher方法的测试 (属于类BarTeacherModule)。
     */
    @Test
    public void testSetTeacher() {
        System.out.println("SetTeacher");
        String bar_id = "";
        String user_id = "";
        BarTeacherModule.SetTeacher(bar_id, user_id);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * AskTeacher方法的测试 (属于类BarTeacherModule)。
     */
    @Test
    public void testAskTeacher() {
        System.out.println("AskTeacher");
        String bar_id = "";
        String user_id = "";
        BarTeacherModule.AskTeacher(bar_id, user_id);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getUserID方法的测试 (属于类BarTeacherModule)。
     */
    @Test
    public void testGetUserID() {
        System.out.println("getUserID");
        String name = "";
        String expResult = "";
        String result = BarTeacherModule.getUserID(name);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * DeleteAskTeacher方法的测试 (属于类BarTeacherModule)。
     */
    @Test
    public void testDeleteAskTeacher() {
        System.out.println("DeleteAskTeacher");
        String msg_id = "";
        BarTeacherModule.DeleteAskTeacher(msg_id);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }
    
}

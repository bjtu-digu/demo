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
public class PostModuleNGTest {
    
    public PostModuleNGTest() {
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
     * getBarID方法的测试 (属于类PostModule)。
     */
    @Test
    public void testGetBarID() {
        System.out.println("getBarID");
        String post_id = "27";
        String expResult = "4";
        String result = PostModule.getBarID(post_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getBarInfo方法的测试 (属于类PostModule)。
     */
    @Test
    public void testGetBarInfo() {
        System.out.println("getBarInfo");
        String bar_id = "3";
        //List expResult = null;
        List result = PostModule.getBarInfo(bar_id);
        //assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getFloorInfo方法的测试 (属于类PostModule)。
     */
    @Test
    public void testGetFloorInfo() {
        System.out.println("getFloorInfo");
        String post_id = "27";
        String begin = "";
        String end = "";
        List expResult = null;
        List result = PostModule.getFloorInfo(post_id, begin, end);
        //assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getUserName方法的测试 (属于类PostModule)。
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        String user_id = "1";
        String expResult = "Tin";
        String result = PostModule.getUserName(user_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
       // fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getFirstInfo方法的测试 (属于类PostModule)。
     */
    @Test
    public void testGetFirstInfo() {
        System.out.println("getFirstInfo");
        String post_id = "27";
        List expResult = null;
        List result = PostModule.getFirstInfo(post_id);
        //assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getUserID方法的测试 (属于类PostModule)。
     */
    @Test
    public void testGetUserID() {
        System.out.println("getUserID");
        String name = "Tin";
        String expResult = "1";
        String result = PostModule.getUserID(name);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * checkTeacher方法的测试 (属于类PostModule)。
     */
    @Test
    public void testCheckTeacher() {
        System.out.println("checkTeacher");
        String user_id = "";
        String expResult = "";
        String result = PostModule.checkTeacher(user_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getPoster方法的测试 (属于类PostModule)。
     */
    @Test
    public void testGetPoster() {
        System.out.println("getPoster");
        String post_id = "27";
        String begin = "";
        String end = "";
        String poster_id = "1";
        List expResult = null;
        List result = PostModule.getPoster(post_id, begin, end, poster_id);
        //assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * getTeacher方法的测试 (属于类PostModule)。
     */
    @Test
    public void testGetTeacher() {
        System.out.println("getTeacher");
        String post_id = "27";
        String begin = "";
        String end = "";
        List expResult = null;
        List result = PostModule.getTeacher(post_id, begin, end);
        //assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }
    
}

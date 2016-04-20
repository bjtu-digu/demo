/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Control;

import java.util.ArrayList;
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
public class CtrlNGTest {
    
    public CtrlNGTest() {
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
     * MakeUserTips方法的测试 (属于类Ctrl)。
     */
    @Test
    public void testMakeUserTips() {
        System.out.println("MakeUserTips");
        String id = "";
        String name = "";
        Ctrl instance = new Ctrl();
        String expResult = "<a href=user?id=></a>";
        String result = instance.MakeUserTips(id, name);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * MakeATips方法的测试 (属于类Ctrl)。
     */
    @Test
    public void testMakeATips() {
        System.out.println("MakeATips");
        String address = "";
        String value = "";
        Ctrl instance = new Ctrl();
        String expResult = "<a href=></a>";
        String result = instance.MakeATips(address, value);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * MakeSimpleTips方法的测试 (属于类Ctrl)。
     */
    @Test
    public void testMakeSimpleTips() {
        System.out.println("MakeSimpleTips");
        String name = "";
        String attibute = "";
        String params = "";
        String value = "";
        Ctrl instance = new Ctrl();
        String expResult = "< =></>";
        String result = instance.MakeSimpleTips(name, attibute, params, value);
        System.out.println("TEST 3 " + result);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * MakeTips方法的测试 (属于类Ctrl)。
     */
    @Test
    public void testMakeTips() {
        System.out.println("MakeTips");
        String name = "";
        ArrayList<String> attribute = null;
        String value = "";
        Ctrl instance = new Ctrl();
        String expResult = "<></>";
        String result = instance.MakeTips(name, attribute, value);
        //System.out.println("TEST 4 " + result);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * NewLine方法的测试 (属于类Ctrl)。
     */
    @Test
    public void testNewLine() {
        System.out.println("NewLine");
        Ctrl instance = new Ctrl();
        String expResult = "<br/>";
        String result = instance.NewLine();
        assertEquals(result, expResult);
        //fail
        //String expResult2 = "";
        //String result2 = instance.NewLine();
        //assertEquals(result2, expResult2);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }
    
}

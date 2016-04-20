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
public class SearchCtrlNGTest {
    
    public SearchCtrlNGTest() {
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
     * getUserID方法的测试 (属于类SearchCtrl)。
     */
    @Test
    public void testGetUserID() {
        System.out.println("getUserID");
        String name = "Tin";
        SearchCtrl instance = new SearchCtrl();
        String expResult = "1";
        String result = instance.getUserID(name);
        System.out.println(name);
        assertEquals(result, expResult);
        //fail
        //String expResult2 = "0";
        //String result2 = instance.getUserID(name);
        //System.out.println(name);
        //assertEquals(result2, expResult2);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }
    
}

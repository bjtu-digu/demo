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
public class CreateBarModuleNGTest {
    
    public CreateBarModuleNGTest() {
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
     * checkBar方法的测试 (属于类CreateBarModule)。
     */
    @Test
    public void testCheckBar() {
        System.out.println("checkBar");
        String name = "fff";
        int expResult = 1;
        int result = CreateBarModule.checkBar(name);
        System.out.println(result);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * checkID方法的测试 (属于类CreateBarModule)。
     */
    @Test
    public void testCheckID() {
        System.out.println("checkID");
        String id = "1";
        int expResult = 1;
        int result = CreateBarModule.checkID(id);
        System.out.println(result);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }

    /**
     * createBar方法的测试 (属于类CreateBarModule)。
     */
    @Test
    public void testCreateBar() {
        System.out.println("createBar");
        String id = "15";
        String topic = "15";
        String name = "15";
        int expResult = 1;
        int result = CreateBarModule.createBar(id, topic, name);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        //fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
    }
    
}

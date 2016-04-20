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
 * @author zqhPC
 */
public class RegisterModuleNGTest {
    
    public RegisterModuleNGTest() {
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
     * register方法的测试 (属于类RegisterModule)。
     */
    @Test
    public void testRegister() {
      
        String name = "pppppppppp";
        String pass = "pppppppppp";
        String mail = "pppppppppp";
        String pic_id = "7";
        int expResult = 1;
        int result = RegisterModule.register(name, pass, mail, pic_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
      
    }

    /**
     * checkRegister方法的测试 (属于类RegisterModule)。
     */
    @Test
    public void testCheckRegister1() {
       
        String name1 = "Tin";
        int expResult1 = 1;
        int result1 = RegisterModule.checkRegister(name1);
        assertEquals(result1, expResult1);
       
    }
     @Test
    public void testCheckRegister2() {
       
        String name2 = "qqq";
        int expResult2 = 1;
        int result2 = RegisterModule.checkRegister(name2);
        assertEquals(result2, expResult2);
    }
     @Test
    public void testCheckRegister3() {
       
           String name3 = "iii";
        int expResult3 = 1;
        int result3 = RegisterModule.checkRegister(name3);
        assertEquals(result3, expResult3);
    }
    
}

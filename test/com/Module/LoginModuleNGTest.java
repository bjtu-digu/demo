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
public class LoginModuleNGTest {
    
    public LoginModuleNGTest() {
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
     * login方法的测试 (属于类LoginModule)。
     */
    @Test
    public void testLogin() {
       
        String name1 = "";
        String password1 = "";
        int expResult1 = 0;
        int result1 = LoginModule.login(name1, password1);
        assertEquals(result1, expResult1);
      /*fail
        String name2 = "hhhhhh";
        String password2 = "hhhhhh";
        int expResult2 = 1;
        int result2 = LoginModule.login(name2, password2);
        assertEquals(result2, expResult2);
        */
          /*fail
        String name3 = "jjjjjjj";
        String password3 = "jjjjjjj";
        int expResult3 = 1;
        int result3 = LoginModule.login(name3, password3);
        assertEquals(result3, expResult3);
                   */
    }
    
}

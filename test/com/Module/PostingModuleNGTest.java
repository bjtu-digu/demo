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
public class PostingModuleNGTest {
    
    public PostingModuleNGTest() {
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
     * posting方法的测试 (属于类PostingModule)。
     */
    @Test
    public void testPosting() {
       
     
    }

    /**
     * checkID方法的测试 (属于类PostingModule)。
     */
    @Test
    public void testCheckID1() {
        System.out.println("checkID");
        String user_id = "";
        int expResult = 0;
        int result = PostingModule.checkID(user_id);
        assertEquals(result, expResult);
      
    }
    @Test
    public void testCheckID2() {
        System.out.println("checkID");
        String user_id = "11";
        int expResult = 1;
        int result = PostingModule.checkID(user_id);
        assertEquals(result, expResult);
      
    }
    @Test
    public void testCheckID3() {
        System.out.println("checkID");
        String user_id = "33";
        int expResult = 1;
        int result = PostingModule.checkID(user_id);
        assertEquals(result, expResult);
      
    }

    /**
     * checkBar方法的测试 (属于类PostingModule)。
     */
    @Test
    public void testCheckBar1() {
        System.out.println("checkBar");
        String bar_id = "";
        int expResult = 0;
        int result = PostingModule.checkBar(bar_id);
        assertEquals(result, expResult);
        
    }
@Test
    public void testCheckBar2() {
        System.out.println("checkBar");
        String bar_id = "";
        int expResult = 1;
        int result = PostingModule.checkBar(bar_id);
        assertEquals(result, expResult);
        
    }
    @Test
    public void testCheckBar3() {
        System.out.println("checkBar");
        String bar_id = "7777";
        int expResult = 1;
        int result = PostingModule.checkBar(bar_id);
        assertEquals(result, expResult);
        
    }
    /**
     * getUserID方法的测试 (属于类PostingModule)。
     */
    @Test
    public void testGetUserID() {
       
     
    }
    
}
